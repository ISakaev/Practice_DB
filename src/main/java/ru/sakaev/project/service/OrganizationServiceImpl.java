package ru.sakaev.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sakaev.project.dao.organization.OrganizationDao;
import ru.sakaev.project.model.Organization;

import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService{

    private OrganizationDao organizationDao;

    /**
     * Конструктор OrganizationServiceImpl
     */
    @Autowired
    public OrganizationServiceImpl(OrganizationDao organizationDao) {
        this.organizationDao = organizationDao;
    }

    /**
     * Получить объекты Organization
     */
    @Override
    @Transactional
    public List<Organization> organizationList(Organization organization) {
        return organizationDao.organizationList(organization);
    }

    /**
     * Получить Organization по идентификатору
     */
    @Override
    @Transactional
    public Organization organizationById(int id) {
        return organizationDao.organizationById(id);
    }

    /**
     * Сохранить Organization
     */
    @Override
    @Transactional
    public void save (Organization organization) {
         organizationDao.save(organization);
    }

    /**
     * Обновить Organization
     */
    @Override
    @Transactional
    public void update (Organization organization) {
         organizationDao.update(organization);
    }


}
