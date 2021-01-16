export default {
  props: {
    value: {
      required: true
    }
  },
  data() {
    return {
      modelVal: this.value
    }
  },
  watch: {
    value(newVal) {
      this.modelVal = newVal
    },
    modelVal(newVal, val) {
      if (newVal !== val) this.$emit('input', newVal)
    }
  }
}
