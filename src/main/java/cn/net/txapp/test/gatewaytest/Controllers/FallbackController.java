package cn.net.txapp.test.gatewaytest.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {
    @RequestMapping("/fallback")
    public Mono<String> defaultfallback(){
        return Mono.fromCallable(()->"他妈的服务挂了");
    }
}
