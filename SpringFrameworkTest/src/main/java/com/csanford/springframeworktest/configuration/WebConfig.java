package com.csanford.springframeworktest.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 *
 * @author Cody Sanford <cody.b.sanford@gmail.com>
 */
@Configuration
@EnableWebMvc
@ComponentScan( basePackages = "com.csanford.springframeworktest" )
public class WebConfig
{

    @Bean
    public ViewResolver viewResolver()
    {
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	viewResolver.setViewClass( JstlView.class );
	viewResolver.setPrefix( "/WEB-INF/views/" );
	viewResolver.setSuffix( ".jsp" );

	return viewResolver;
    }

}
