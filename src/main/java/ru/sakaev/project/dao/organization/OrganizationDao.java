package ru.sakaev.project.dao.organization;

import ru.sakaev.project.module.Organization;

import java.util.List;

/**
 * DAO для работы с Organization
 */
public interface OrganizationDao {

    /**
     * Получить все объекты Organization
     *
     * @return
     */
    List<Organization> all();

    /**
     * Получить Organization по идентификатору
     *
     * @param id
     * @return
     */
    Organization loadById(Long id);

    /**
     * Обновить Organization
     *
     * @param organization
     */
    void update(Organization organization);;

    /**
     * Сохранить Organization
     *
     * @param organization
     */
    void save(Organization organization);

}
