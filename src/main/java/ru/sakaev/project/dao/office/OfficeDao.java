package ru.sakaev.project.dao.office;

import ru.sakaev.project.module.Office;

import java.util.List;

/**
 * DAO для работы с Office
 */
public interface OfficeDao {

    /**
     * Получить все объекты Office
     *
     * @return
     */
    List<Office> all();

    /**
     * Получить Office по идентификатору
     *
     * @param id
     * @return
     */
    Office loadById(Long id);

    /**
     * Обновить Office
     *
     * @param office
     */
    void update(Office office);;

    /**
     * Сохранить Office
     *
     * @param office
     */
    void save(Office office);
}
