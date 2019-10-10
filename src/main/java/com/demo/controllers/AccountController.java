package com.demo.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.model.Account;

@Controller
public class AccountController {

  /**
   * This method demonstrates the spring's validation framework. @Valid annotation should be added before
   * 
   * @ModelAttribute annotation to instruct the validation to happen first. Result of the validations can be accessed by adding BindingResult
   *                 type as another argument in this handler method.
   * @param account
   * @param result
   * @return
   */
  @RequestMapping(value = "/createAccount")
  public String createAccount(@Valid
  @ModelAttribute("aNewAccount")
  Account account, BindingResult result) {

    if (result.hasErrors()) {
      System.out.println("Form has errors");
      // show errors on the same page (createAccount.jsp)
      return "createAccount";
    }

    System.out.println("Form validated successfully");
    System.out.println(account.getFirstName() + ", " + account.getLastName() + ", " + account.getAddress() + ", " + account.getEmail());
    // redirect to createAccount.jsp
    return "createAccount";
  }

  /**
   * Redirects to the confirmation page of account creation.
   * 
   * @param account
   * @return
   */
  @RequestMapping(value = "/accountCreated", method = RequestMethod.POST)
  public String performAccountCreation(Account account) {
    System.out.println("Account created successfully");
    return "accountCreated";
  }



}
