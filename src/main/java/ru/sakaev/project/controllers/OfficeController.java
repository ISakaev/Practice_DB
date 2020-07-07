package ru.sakaev.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/office")
public class OfficeController {

    @PostMapping("/list")
    public String postList(@RequestParam(value = "orgId") int organizationId,
                           @RequestParam(value = "name", required = false) String name,
                           @RequestParam(value = "phone", required = false) int phone,
                           @RequestParam(value = "isActive", required = false) boolean isActive){

        return name;
    }

    @GetMapping("{id}")
    public String getId(){

        return null;
    }
}
