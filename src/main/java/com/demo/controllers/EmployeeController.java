package com.demo.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.demo.model.Employee;
import com.demo.model.Student;

@Controller
@SessionAttributes("aNewEmployee")
public class EmployeeController {

  @ModelAttribute
  public void addEmployeeToModel(Model model) {

    System.out.println("Making sure employee object is on model");
    if (!model.containsAttribute("aNewEmployee")) {
      Employee employee = new Employee();
      model.addAttribute("aNewEmployee", employee);
    }
  }

  /**
   * Handler method to create a student. Performs form validation.
   * 
   * @param student
   * @param result
   * @return
   */
  @RequestMapping(value = "/createEmployee")
  public String createEmployee(@Valid
  @ModelAttribute("aNewEmployee")
  Employee employee, BindingResult result) {

    if (result.hasErrors()) {
      System.out.println("Form has errors");
      // show errors on the same page (createAccount.jsp)
      return "createEmployee";
    }

    System.out.println("Form validated successfully");
    // redirect to createAccount.jsp
    return "createEmployee";
  }

  /**
   * Handler method to accept form data, create a student in database and then redirects to another handler method to display the confirmation
   * page. This avoids unwanted POST calls to create a student.
   * 
   * @param student
   * @return
   */
  @RequestMapping(value = "/doCreateEmployee", method = RequestMethod.POST)
  public String performEmployeeCreation(@ModelAttribute("aNewEmployee")
  Employee employee) {
    System.out.println("Employee created successfully | Employee.getFirstName(), " + employee.getLastName() + ", " + employee.getAddress()
        + ", " + employee.getEmail());

    // This tells the browser that it needs to make a new GET request to new resource which is 'studentConfirm' in this case here.
    return "redirect:employeeConfirm";
  }

  /**
   * Handler method to display only the confirmation page without creating student. This method won't have access to the Model Attributes.
   * 
   * @return redirects to employeeCreated.jsp
   */
  @RequestMapping(value = "employeeConfirm")
  public String confirmEmployeeCreation(@ModelAttribute("aNewEmployee")
  Employee employee) {
    System.out.println("Redirecting to confirmation page | employee.getFirstName(), " + employee.getFirstName());
    return "employeeCreated";
  }
}
