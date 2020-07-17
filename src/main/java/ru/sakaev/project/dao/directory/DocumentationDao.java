package ru.sakaev.project.dao.directory;

import ru.sakaev.project.module.Documentation;

import java.util.List;

/**
 * DAO для работы с Documentation
 */
public interface DocumentationDao {

    /**
     * Получить все объекты Country
     *
     * @return
     */
    List<Documentation> all();
}
