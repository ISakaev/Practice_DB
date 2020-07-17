package ru.sakaev.project.dao.user;

import ru.sakaev.project.module.User;

import java.util.List;

/**
 * DAO для работы с User
 */
public interface UserDao {

        /**
         * Получить все объекты User
         *
         * @return
         */
        List<User> all();

        /**
         * Получить User по идентификатору
         *
         * @param id
         * @return
         */
        User loadById(Long id);

        /**
         * Обновить User
         *
         * @param user
         */
        void update(User user);;

        /**
         * Сохранить User
         *
         * @param user
         */
        void save(User user);

}
