package com.example.config;

import org.apache.coyote.http2.Http2Protocol;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

//    @Bean
    public EmbeddedServletContainerCustomizer tomcatCustomizer() {
        return (container) -> {
            if (container instanceof TomcatEmbeddedServletContainerFactory) {
                ((TomcatEmbeddedServletContainerFactory) container).addConnectorCustomizers(
                        (connector) -> connector.addUpgradeProtocol(new Http2Protocol())
                );
            }
        };
    }

    @Bean
    public EmbeddedServletContainerCustomizer jettyHttp2Customizer(ServerProperties serverProperties) {
        return new JettyHttp2Customizer(serverProperties);
    }

//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("index.html");
//    }
}
