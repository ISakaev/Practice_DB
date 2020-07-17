package ru.sakaev.project.dao.directory;

import org.springframework.beans.factory.annotation.Autowired;
import ru.sakaev.project.module.Country;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class CountryDaoImpl implements CountryDao {

    private final EntityManager em;

    @Autowired
    public CountryDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Country> all() {
        TypedQuery<Country> query = em.createQuery("SELECT p FROM Person p", Country.class);
        return query.getResultList();
    }
}
