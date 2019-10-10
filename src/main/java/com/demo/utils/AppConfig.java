package com.demo.utils;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan(basePackages = "com.demo.controllers")
@Configuration
public class AppConfig extends WebMvcConfigurerAdapter {

  /**
   * Set up view resolver. When controller's handler method returns e.g., 'quote', view resolver will look for quote.jsp based upon the given
   * suffix and prefix locations.
   * 
   * @return
   */
  public InternalResourceViewResolver getIRVR() {
    System.out.println("Setting up view resolver");
    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    resolver.setPrefix("/WEB-INF/jsp/");
    resolver.setSuffix(".jsp");
    return resolver;
  }

  /**
   * Set up the resources for the application.
   */
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    System.out.println("Setting up resources");
    registry.addResourceHandler("/myResources/**").addResourceLocations("/resources/");
  }
}
