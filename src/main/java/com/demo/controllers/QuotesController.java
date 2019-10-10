package com.demo.controllers;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QuotesController {

  private String[] quotes = { "To be or not to be - Shakespeare", "Spring is saying - Let's party",
      "The time is always right to do what is right" };

  // Below application url will be redirected to the below resource method:
  // http://localhost:8080/SpringMVCApplication/getQuote.html
  /**
   * Returns the random quotes.
   * 
   * @param model - Model - this will be accessed at the quote.jsp file
   * @return
   */
  @RequestMapping(value = "/getQuote")
  public String getRandomQuote(Model model) {
    int rand = new Random().nextInt(quotes.length);
    String randomQuote = quotes[rand];
    // set model object's attribute which can be accessed at jsp using ${randomQuote}
    model.addAttribute("randomQuote", randomQuote);
    // redirect to quote.jsp
    return "quote";
  }

  /**
   * Demonstrates Model Attributes.
   * 
   * @param model
   * @return
   */
  @RequestMapping(value = "/getQuotesForUser")
  public String getQuotesForUser(Model model) {
    int rand = new Random().nextInt(quotes.length);
    String randomQuote = quotes[rand];
    // set model object's attribute which can be accessed at jsp using ${randomQuote}
    model.addAttribute("randomQuote", randomQuote);
    // redirect to quotesForUser.jsp
    return "quotesForUser";
  }

  /**
   * @ModelAttribute annotation forces this method to be called before any resource handler method so that it can update the model object with
   *                 available information which can be used by other handler methods of view files.
   * @param userName
   * @param model
   */
  @ModelAttribute
  public void setModelAttributesExample(@RequestParam("userName")
  String userName, Model model) {
    model.addAttribute("userName", userName);

    String userRole = "undefined";

    if ("Andy".equalsIgnoreCase(userName)) {
      userRole = "Student";
    }
    else if ("Dean".equalsIgnoreCase(userName)) {
      userRole = "Professor";
    }

    model.addAttribute("userRole", userRole);
    System.out.println("Model updated with user information");
  }
}
