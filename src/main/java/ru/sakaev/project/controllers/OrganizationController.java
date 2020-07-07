package ru.sakaev.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.ws.RequestWrapper;

@Controller
@RequestMapping("/organization")
public class OrganizationController {

    @PostMapping("/list")
    public String postList(@RequestParam(value = "name") String name,
                           @RequestParam(value = "inn", required = false) int inn,
                           @RequestParam(value = "isActive", required = false) boolean isActive){

        return null;
    }

    @GetMapping("{id}")
    public String getId(){

        return null;
    }

    @PostMapping("/update")
    public String postUpdate(@RequestParam(value = "id") String id, @RequestParam(value = "name") String name,
                           @RequestParam(value = "fullName") String fullName, @RequestParam(value = "inn") int inn,
                           @RequestParam(value = "kpp") int kpp, @RequestParam(value = "address") String address,
                           @RequestParam(value = "phone", required = false) int phone,
                           @RequestParam(value = "inn", required = false) boolean isActive){

        return null;
    }

    @PostMapping("/save")
    public String postSave(@RequestParam(value = "id") String id, @RequestParam(value = "name") String name,
                           @RequestParam(value = "fullName") String fullName, @RequestParam(value = "inn") int inn,
                           @RequestParam(value = "kpp") int kpp, @RequestParam(value = "address") String address,
                           @RequestParam(value = "phone", required = false) int phone,
                           @RequestParam(value = "inn", required = false) boolean isActive){

        return null;
    }



}
