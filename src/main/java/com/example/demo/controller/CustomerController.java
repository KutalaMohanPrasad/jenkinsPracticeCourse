package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@Controller
public class CustomerController {

    
    private final CustomerRepository customerRepository;
    
    
    public CustomerController(CustomerRepository customerRepository) {
    	this.customerRepository=customerRepository;
    }
    
    
    public final String name="mohan";
    
    /* get the list of customers*/
    @GetMapping("/getCustomers")
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    
    //angular , spring (boot,security), java 8-18, azure , RDBS, cosmos

    @PostMapping("/saveCustomers")
    public Customer createCustomer(@RequestBody Customer customer){
        return customerRepository.save( customer );
    }

}
