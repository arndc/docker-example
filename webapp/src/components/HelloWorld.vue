<template>
    <div class="hello">
        <h1>{{ msg }}</h1>
        <button @click="sayHello">Say hello</button>
    </div>
</template>

<script>
    export default {
        name: 'HelloWorld',
        props: {
            msg: String
        },
        methods: {
            sayHello() {
                this.$http.get('http://api.localhost:9000/hello').then(response => this.msg = response.data.message);
            }
        }
    }
</script>
