import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listUser(query) {
  return request({
    url: '/blog/user/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getUser(id) {
  return request({
    url: '/blog/user/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addUser(data) {
  return request({
    url: '/blog/user',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateUser(data) {
  return request({
    url: '/blog/user',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delUser(id) {
  return request({
    url: '/blog/user/' + id,
    method: 'delete'
  })
}

// 导出【请填写功能名称】
export function exportUser(query) {
  return request({
    url: '/blog/user/export',
    method: 'get',
    params: query
  })
}