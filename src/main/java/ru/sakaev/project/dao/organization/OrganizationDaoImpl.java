package ru.sakaev.project.dao.organization;

import org.assertj.core.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.sakaev.project.model.Organization;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * DAO для работы с Organization
 */
@Repository
public class OrganizationDaoImpl implements OrganizationDao {

    private final EntityManager em;

    /**
     * Конструктор OrganizationDaoImpl
     */
    @Autowired
    public OrganizationDaoImpl(EntityManager em) {
        this.em = em;
    }

    /**
     * Получить объекты Organization
     */
    @Override
    public List<Organization> organizationList(Organization organization) {

        String name = organization.getName();
        String inn = organization.getInn();
        Boolean isActive = organization.isActive();

        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Organization> criteriaQuery = criteriaBuilder.createQuery(Organization.class);

        Root<Organization> organizationRoot = criteriaQuery.from(Organization.class);

        criteriaQuery.select(organizationRoot);

        Predicate criteria = criteriaBuilder.conjunction();

        Predicate criteriaName = criteriaBuilder.equal(organizationRoot.get("name"), name);
        criteria = criteriaBuilder.and(criteria, criteriaName);

        if (!Strings.isNullOrEmpty(inn)) {
            Predicate predicate = criteriaBuilder.equal(organizationRoot.get("inn"), inn);
            criteria = criteriaBuilder.and(criteria, predicate);
        }

        if (isActive != null) {
            Predicate predicate = criteriaBuilder.equal(organizationRoot.get("isActive"), isActive);
            criteria = criteriaBuilder.and(criteria, predicate);
        }

        criteriaQuery.where(criteria);

        return em.createQuery(criteriaQuery).getResultList();
    }

    /**
     * Получить Organization по идентификатору
     */
    @Override
    public Organization organizationById(int id) {
        return em.find(Organization.class, id);
    }

    /**
     * Обновить Organization
     */
    @Override
    public void update(Organization organization) {

       em.persist(organization);
    }

    /**
     * Сохранить Organization
     */
    @Override
    public void save(Organization organization) {

        em.persist(organization);
    }
}
