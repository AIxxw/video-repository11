package com.qf.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                //.apiInfo(ApiInfo.DEFAULT);
                .apiInfo(createApiInfo())
                .groupName("java2007")
                .enable(true)
                .select().apis(RequestHandlerSelectors.basePackage("com.qf.controller"))
                .build();
    }

//    @Bean
//    public Docket createDocket1(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                //.apiInfo(ApiInfo.DEFAULT);
//                .apiInfo(createApiInfo())
//                .groupName("java")
//                .enable(true)
//                .select().apis(RequestHandlerSelectors.basePackage("com.qf.controller"))
//                .build();
//    }

    @Bean
    public ApiInfo createApiInfo(){
       return new ApiInfoBuilder()
                .title("java2007.title")
                .description("java2007.description")
                .termsOfServiceUrl("http://www.baidu.com")
                .contact(new Contact("jack","jack_url","jack_email"))
                .license("java2007.license")
                .licenseUrl("java2007.licenseUrl")
                .version("100.0")
                .build();
    }
}
