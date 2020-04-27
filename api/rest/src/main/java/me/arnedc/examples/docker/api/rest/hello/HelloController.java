package me.arnedc.examples.docker.api.rest.hello;

import me.arnedc.examples.docker.api.rest.hello.views.HelloVo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RequestMapping("/hello")
@RestController
public class HelloController {

    private static final List<String> greetings = List.of("Hi there", "Hello", "Hey", "🖐", "👋");

    @GetMapping
    public ResponseEntity<HelloVo> sayHello() {
        Random random = new Random();
        final var helloVo = new HelloVo(greetings.get(random.nextInt(greetings.size())));

        return ResponseEntity.ok().body(helloVo);
    }

}
