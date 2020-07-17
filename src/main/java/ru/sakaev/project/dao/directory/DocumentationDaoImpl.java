package ru.sakaev.project.dao.directory;

import org.springframework.beans.factory.annotation.Autowired;
import ru.sakaev.project.module.Documentation;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class DocumentationDaoImpl implements DocumentationDao {

    private final EntityManager em;

    @Autowired
    public DocumentationDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Documentation> all() {
        TypedQuery<Documentation> query = em.createQuery("SELECT p FROM Person p", Documentation.class);
        return query.getResultList();
    }
}
