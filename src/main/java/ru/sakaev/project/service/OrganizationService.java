package ru.sakaev.project.service;

import ru.sakaev.project.model.Organization;

import java.util.List;

public interface OrganizationService {
    /**
     * Получить объекты Organization
     */
    List<Organization> organizationList(Organization organization);

    /**
     * Получить Organization по идентификатору
     */
    Organization organizationById(int id);

    /**
     * Обновить Organization
     */
    void update(Organization organization);;

    /**
     * Сохранить Organization
     */
    void save(Organization organization);
}
