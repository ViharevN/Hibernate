package me.viharev.hibernate.dao;

import me.viharev.hibernate.model.Employee;

import java.util.List;

public interface EmployeeDAO {

    // 1.Создание(добавление) сущности Employee в таблицу
    void create (Employee employee );
    // 2.Получение конкретного объекта Employee по id
    Employee getById ( int id);
    // 3.Получение списка всех объектов Employee из базы
    List<Employee> getAllEmployee ();
    // 4.Изменение конкретного объекта Employee в базе по id
    void updateByID(Employee employee);
    // 5.Удаление конкретного объекта Employee из базы по id
    void deleteById (Employee employee);

}
