package ru.sakaev.project.dao.directory;

import ru.sakaev.project.module.Country;

import java.util.List;

/**
 * DAO для работы с Country
 */
public interface CountryDao {

    /**
     * Получить все объекты Country
     *
     * @return
     */
    List<Country> all();
}
