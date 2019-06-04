package com.cafe24.jblog.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.cafe24.config.web.FileUploadConfig;
import com.cafe24.config.web.MVCConfig;
import com.cafe24.config.web.MessageConfig;
import com.cafe24.config.web.SecurityConfig;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.cafe24.jblog.controller","com.cafe24.jblog.controller.api","com.cafe24.jblog.exception"})
@Import({FileUploadConfig.class,MessageConfig.class,MVCConfig.class,SecurityConfig.class})
public class WebConfig {

}
