package com.demo.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.model.Student;

@Controller
public class StudentsController {

  /**
   * Handler method to create a student. Performs form validation.
   * 
   * @param student
   * @param result
   * @return
   */
  @RequestMapping(value = "/createStudent")
  public String createStudent(@Valid
  @ModelAttribute("aNewStudent")
  Student student, BindingResult result) {

    if (result.hasErrors()) {
      System.out.println("Form has errors");
      // show errors on the same page (createAccount.jsp)
      return "createStudent";
    }

    System.out.println("Form validated successfully");
    // redirect to createAccount.jsp
    return "createStudent";
  }

  /**
   * Handler method to accept form data, create a student in database and then redirects to another handler method to display the confirmation
   * page. This avoids unwanted POST calls to create a student.
   * 
   * @param student
   * @return
   */
  @RequestMapping(value = "/doCreateStudent", method = RequestMethod.POST)
  public String performStudentCreation(@ModelAttribute("aNewStudent")
  Student student) {
    System.out.println("Student created successfully | student.getFirstName(), " + student.getLastName() + ", " + student.getAddress() + ", "
        + student.getEmail());

    // This tells the browser that it needs to make a new GET request to new resource which is 'studentConfirm' in this case here.
    return "redirect:studentConfirm";
  }

  /**
   * Handler method to display only the confirmation page without creating student. This method won't have access to the Model Attributes.
   * 
   * @return
   */
  @RequestMapping(value = "studentConfirm")
  public String confirmStudentCreation(@ModelAttribute("aNewStudent")
  Student student) {
    System.out.println("Redirecting to confirmation page | student.getFirstName(), " + student.getLastName());
    return "studentCreated";
  }
}
