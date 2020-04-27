package me.arnedc.examples.docker.api.rest.hello.views;

public final class HelloVo {
    private final String message;

    public HelloVo(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
