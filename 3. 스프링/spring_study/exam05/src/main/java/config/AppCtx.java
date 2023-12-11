package config;

import aopex.*;
import config.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true) // 하위클래스 기반의 프록시
public class AppCtx {

    @Bean
    public RecCalculator calculator() {

        return new RecCalculator();
    }

    @Bean
    public ProxyCache proxyCache() {
        return new ProxyCache();
    }

    @Bean
    public ProxyCalculator proxyCalculator() {
        return new ProxyCalculator();
    }
}
