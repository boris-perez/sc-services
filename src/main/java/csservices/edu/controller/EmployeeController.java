package csservices.edu.controller;


import csservices.edu.repositories.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
    private EmployeeRepository repository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.repository = employeeRepository;
    }

    @RequestMapping("/employees")//Path
    public String getEmployees(Model model) {//Mapa propio de Spring MVC
        model.addAttribute("employees", repository.findAll()); //repository,findAll, es del repositorio y lo asigna a la llave "employees"
        return "employees"; //nombre de la vista o template
    }
}