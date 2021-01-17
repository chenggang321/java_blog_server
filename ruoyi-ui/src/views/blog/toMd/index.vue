<template>
  <div class="app-container" style="margin: 0 1px">
    <div class="form-group" style="margin-bottom: 10px">
      <label for="code">html：</label>
      <el-input
        type="textarea"
        id="code"
        v-model="code"
        rows="10"
        placeholder="请输入html"
      />
    </div>
    <div class="form-group">
      <label for="editor">md：</label>
      <mavon-editor id="editor" v-model="content" style="height: 100%;" />
    </div>
    <el-button style="margin: 10px 0 50px;float: right" type="primary" size="mini" @click="handleClick">转换</el-button>
  </div>
</template>
<script>
  import { mavonEditor } from "mavon-editor";
  import "mavon-editor/dist/css/index.css";
  import { loadScript } from '@/utils'

  export default {
    name: "HtmlToMd",
    components: {
      mavonEditor,
    },
    data() {
      return {
        code: "",
        content: "",
      };
    },
    methods: {
      handleClick() {
        const self = this;
        loadScript(['/reMarked.js']).then(()=>{
          self.content = new reMarked().render(self.code);
        })
      },
    },
  };
</script>

<style scoped></style>
