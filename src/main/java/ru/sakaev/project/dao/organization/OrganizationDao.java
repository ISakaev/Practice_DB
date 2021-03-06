package ru.sakaev.project.dao.organization;

import ru.sakaev.project.model.Organization;

import java.util.List;

/**
 * DAO для работы с Organization
 */
public interface OrganizationDao {

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
