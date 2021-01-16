<template>
  <el-dialog :title="title" :visible.sync="modelVal" width="80%" append-to-body>
    <el-form ref="form" :model="form" :rules="rules" label-width="80px">
      <el-form-item label="文章标题" prop="title">
        <el-input v-model="form.title" placeholder="请输入文章标题"/>
      </el-form-item>

      <el-form-item label="分类" prop="categoryId">
        <el-select
          v-model="form.categoryId"
          placeholder="请选择分类"
          clearable
          size="small"
          style="width: 240px"
        >
          <el-option
            v-for="ca in categoryList"
            :key="ca.id"
            :label="ca.name"
            :value="ca.id"
          />
        </el-select>
      </el-form-item>

      <el-form-item label="添加时间" prop="addTime">
        <el-date-picker
          clearable size="small"
          v-model="form.addTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="选择添加时间"
        />
      </el-form-item>

      <el-form-item label="阅读量" prop="views">
        <el-input v-model="form.views" placeholder="请输入阅读量"/>
      </el-form-item>

      <el-form-item label="文章简介" prop="description">
        <el-input v-model="form.description" placeholder="请输入文章简介"/>
      </el-form-item>

      <el-form-item label="编辑器">
        <el-radio-group v-model="form.editorType">
          <el-radio :label="1">markdown编辑器</el-radio>
          <el-radio :label="2">富文本编辑器</el-radio>
        </el-radio-group>
      </el-form-item>
      <el-form-item label="文章内容"  v-if="form.editorType===1">
        <mavon-editor v-model="form.content" style="height: 100%;"/>
      </el-form-item>
      <el-form-item label="文章内容" v-else>
        <editor v-model="form.content" :min-height="192"/>
      </el-form-item>
    </el-form>

    <div slot="footer" class="dialog-footer">
      <el-button type="primary" @click="submitForm">确 定</el-button>
      <el-button @click="cancel">取 消</el-button>
    </div>
  </el-dialog>
</template>

<script>
  import modelMixins from '@/mixins/modelMixins'
  import Editor from '@/components/Editor'
  import { mavonEditor } from 'mavon-editor'
  import 'mavon-editor/dist/css/index.css'
  import { addContent, updateContent } from '@/api/blog/content'

  export default {
    name: 'index',
    components: {
      Editor,
      mavonEditor
    },
    mixins: [modelMixins],
    props: {
      title: {
        type: String
      },
      editFrom: {
        type: Object
      },
      categoryList: {
        type: Array,
        default: () => []
      }
    },
    data() {
      return {
        // 表单参数
        form: { ...this.editFrom, editorType: 1 } || {},
        // 表单校验
        rules: {}
      }
    },
    methods: {
      /** 提交按钮 */
      submitForm() {
        this.$refs['form'].validate(valid => {
          if (valid) {
            if (this.form.id != null) {
              updateContent(this.form).then(response => {
                this.msgSuccess('修改成功')
              })
            } else {
              addContent(this.form).then(response => {
                this.msgSuccess('新增成功')
              })
            }
          }
          this.modelVal = false
          this.$emit('submitForm')
        })
      },
      cancel() {
        this.modelVal = false
        this.$emit('cancel')
      }
    }
  }
</script>

<style scoped>

</style>
