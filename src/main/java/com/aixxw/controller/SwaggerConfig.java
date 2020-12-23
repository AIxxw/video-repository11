package com.aixxw.controller;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.collect.Lists.newArrayList;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket creatDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(creatApiInfo())
                .groupName("javaee2007")
                .enable(true)
                .select().apis(RequestHandlerSelectors.basePackage("com.aixxw.controller"))
                .build();
    }
    @Bean
    public Docket creatDocket1() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(cteatApiInfo1())
                .groupName("javaee20071")
                .enable(true)
                .select().apis(RequestHandlerSelectors.basePackage("com.aixxw.controller"))
                .build();
    }

//    private String title;
//    private String description;
//    private String termsOfServiceUrl;
//    private Contact contact;
//    private String license;
//    private String licenseUrl;
//    private String version;
//    private List<VendorExtension> vendorExtensions = newArrayList();
    @Bean
    public ApiInfo creatApiInfo() {
        return new ApiInfoBuilder().title("java2007.title")
                .description("java2007.description")
                .termsOfServiceUrl("http://www.baidu.com")
                .contact(new Contact("jack","baihe.com","1219129554@qq.com"))
                .license("java.license")
                .licenseUrl("java.licenseUrl")
                .version("111.0")
                .build();
    }

    @Bean
    public ApiInfo cteatApiInfo1() {
        return  new ApiInfoBuilder().title("测试")
                .description("测试描述")
                .termsOfServiceUrl("http://baihe.com")
                .contact(new Contact("aaa","http://lol.com","1"))
                .license("1111")
                .licenseUrl("http://jd.com")
                .version("111")
                .build();
    }
}
