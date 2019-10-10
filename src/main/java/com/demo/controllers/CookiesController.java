package com.demo.controllers;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookiesController {

  /**
   * Adds cookie in the http servlet response.
   * 
   * @param response
   * @return
   */
  @RequestMapping(value = "/addCookie")
  public String addCookie(HttpServletResponse response) {

    response.addCookie(new Cookie("myRandomCookie", "aCookieAdded"));
    return "cookieDemo";
  }

  /**
   * Retrieves the cookie.
   * 
   * @param myCookie
   * @return
   */
  @RequestMapping(value = "/getCookie")
  public String getCookie(@CookieValue("myRandomCookie")
  String myCookie) {
    System.out.println(myCookie);
    return "cookieDemo";
  }
}
