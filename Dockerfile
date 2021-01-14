FROM openjdk:8

ENV TARGET_JAR /app/
COPY /target/*.jar $TARGET_JAR

ENV PROFILE_ACTIVE pro
ENV PORT 8080
ENV JAVA_OPTS ""

EXPOSE $PORT

# 设置时区
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' > /etc/timezone

ENTRYPOINT java -jar -Dspring.profiles.active=$PROFILE_ACTIVE -Dserver.port=$PORT $JAVA_OPTS $TARGET_JAR
