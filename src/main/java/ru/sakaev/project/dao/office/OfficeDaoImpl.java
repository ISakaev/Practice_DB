package ru.sakaev.project.dao.office;

import org.springframework.beans.factory.annotation.Autowired;
import ru.sakaev.project.module.Office;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class OfficeDaoImpl implements OfficeDao {

    private final EntityManager em;

    @Autowired
    public OfficeDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Office> all() {
        TypedQuery<Office> query = em.createQuery("SELECT o FROM Organization o", Office.class);
        return query.getResultList();
    }

    @Override
    public Office loadById(Long id) {
        return em.find(Office.class, id);
    }

    @Override
    public void update(Office office) {

    }

    @Override
    public void save(Office office) {
        em.persist(office);

    }
}
