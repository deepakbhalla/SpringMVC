package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticResourceController {

  /**
   * Access to static resources using spring mvc requires below entry in Dispatcher Servlet: <mvc:resources location="/resources/"
   * mapping="/myResources/**"/>
   * 
   * @return redirects to accessStaticResources.jsp
   */
  @RequestMapping(value = "/staticResource")
  public String getStaticResource() {
    return "accessStaticResources";
  }
}
