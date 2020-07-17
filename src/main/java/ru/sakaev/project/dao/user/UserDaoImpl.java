package ru.sakaev.project.dao.user;

import org.springframework.beans.factory.annotation.Autowired;
import ru.sakaev.project.module.User;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private final EntityManager em;

    @Autowired
    public UserDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<User> all() {
        TypedQuery<User> query = em.createQuery("SELECT o FROM Organization o", User.class);
        return query.getResultList();
    }

    @Override
    public User loadById(Long id) {
        return em.find(User.class, id);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void save(User user) {
        em.persist(user);
    }
}
