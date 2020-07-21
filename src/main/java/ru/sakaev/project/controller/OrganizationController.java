package ru.sakaev.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sakaev.project.controller.exception.ErrorException;
import ru.sakaev.project.controller.exception.IdNotFoundException;
import ru.sakaev.project.model.Organization;
import ru.sakaev.project.service.OrganizationService;
import ru.sakaev.project.service.OrganizationServiceImpl;

import java.util.List;

@RestController
@RequestMapping("api/organization")
public class OrganizationController {

    private OrganizationService organizationService;

    /**
     * Конструктор OrganizationController
     */
    @Autowired
    public OrganizationController(OrganizationServiceImpl organizationServiceImpl) {
        this.organizationService = organizationServiceImpl;
    }

    /**
     * Получить объекты Organization
     */
    @PostMapping(value = "/list")
    public List<Organization> list( @RequestBody Organization organization) {
        if(organization.getName() == null){
            throw new ErrorException( "Organization name is not found");
        }
        return organizationService.organizationList(organization);
    }

    /**
     * Получить Organization по идентификатору
     */
    @GetMapping("/{organizationId}")
    public Organization getOrganization (@PathVariable int organizationId){

        Organization organization = organizationService.organizationById(organizationId);
        if(organization == null){
            throw new IdNotFoundException("Organization id not found - " + organizationId);
        }
        return organization;
    }

    /**
     * Сохранить Organization
     */
    @PostMapping("/save")
    public void saveOrganization (@RequestBody Organization newOrganization){

        if(newOrganization.getName() == null || newOrganization.getFullName() == null ||
                newOrganization.getInn() == null || newOrganization.getKpp() == null ||
                newOrganization.getAddress() == null){

            throw new ErrorException( "Insufficient information about the organization");
        }
        newOrganization.setId(0);

        organizationService.save(newOrganization);

    }

    /**
     * Обновить Organization
     */
    @PostMapping("/update")
    public void updateOrganization (@RequestBody Organization newOrganization){
        if( newOrganization.getId() < 1 || newOrganization.getName() == null ||
                newOrganization.getFullName() == null || newOrganization.getInn() == null ||
                newOrganization.getKpp() == null || newOrganization.getAddress() == null){

            throw new ErrorException( "Insufficient information about the organization");
        }
        organizationService.save(newOrganization);

    }

}