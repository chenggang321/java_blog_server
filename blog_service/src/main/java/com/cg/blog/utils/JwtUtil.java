package com.cg.blog.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.cg.blog.pojo.User;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtUtil {
    //过期时间
    private static final long EXPIRE_TIME = 15 * 60 * 1000;
    private static final String SECRET = "9a96349e2345385785e804e0f4254dee";

    private static String ISSUER = "sys_user";

    /**
     * 生成token
     * @param claims
     * @return
     */
    public static String genToken(Map<String, String> claims){

        try {
            //使用HMAC256进行加密
            Algorithm algorithm = Algorithm.HMAC256(SECRET);

            // 过期时间
            Date expireDate = new Date(System.currentTimeMillis() + EXPIRE_TIME);

            //创建jwt
            JWTCreator.Builder builder = JWT.create().
                    withIssuer(ISSUER). //发行人
                    withExpiresAt(expireDate);

            //传入参数
            claims.forEach((key,value)-> {
                builder.withClaim(key, value);
            });

            //签名加密
            return builder.sign(algorithm);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 解密jwt
     * @param token
     * @return
     * @throws RuntimeException
     */
    public static Map<String,String> verifyToken(String token) throws RuntimeException{
        Algorithm algorithm = null;
        try {
            //使用HMAC256进行加密
            algorithm = Algorithm.HMAC256(SECRET);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }

        //解密
        JWTVerifier verifier = JWT.require(algorithm).withIssuer(ISSUER).build();
        DecodedJWT jwt =  verifier.verify(token);
        Map<String, Claim> map = jwt.getClaims();
        Map<String, String> resultMap = new HashMap<>();
        map.forEach((k,v) -> resultMap.put(k, v.asString()));
        return resultMap;
    }

    /**
     * 校验token
     * @param token
     * @return
     */
    public static Boolean isVerify(String token) {
        Map<String,String> map = verifyToken(token);
        if (map.size()>0) {
            return true;
        }
        return false;
    }
}
