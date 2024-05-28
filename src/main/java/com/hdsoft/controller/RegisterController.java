package com.hdsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.hdsoft.entity.Register;
import com.hdsoft.service.RegisterService;

@Controller
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("register", new Register());
        return "register"; // This refers to the register.jsp template in /WEB-INF/views
    }

    @PostMapping("/register")
    public String submitForm(Register register) {
        registerService.save(register);
        return "register_success"; // Ensure you have a register_success.jsp in /WEB-INF/views
    }
}
