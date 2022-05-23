package repository;

import model.ConsumerLog;
import org.h2.message.DbException;

import java.util.List;

public interface IConsumerLogRepository {

    /**
     * Возвращает список записей
     *
     * @return список всех записей
     * @throws DbException в случае ошибки БД
     */
    List<ConsumerLog> getLogsList();

    /**
     * Вставка новой записи
     *
     * @param entity новая запись
     * @throws DbException в случае ошибки БД
     */
    void insert(ConsumerLog entity);
}