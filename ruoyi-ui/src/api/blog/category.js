import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listCategory(query) {
  return request({
    url: '/blog/category/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getCategory(id) {
  return request({
    url: '/blog/category/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addCategory(data) {
  return request({
    url: '/blog/category',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateCategory(data) {
  return request({
    url: '/blog/category',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delCategory(id) {
  return request({
    url: '/blog/category/' + id,
    method: 'delete'
  })
}

// 导出【请填写功能名称】
export function exportCategory(query) {
  return request({
    url: '/blog/category/export',
    method: 'get',
    params: query
  })
}