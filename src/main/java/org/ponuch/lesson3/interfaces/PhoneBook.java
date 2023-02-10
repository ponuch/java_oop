package org.ponuch.lesson3.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Интерфейс для телефонной книги
 * Позволяет создавать различные имплементации и внедрять их через DI
 */
public interface PhoneBook {
    void insert(String userName, String phone);
    List<String> allPhones(String userName);
    void delete(String userName, String phone);
    List<String> findByName(String userName);

    Map<String, List<String>> getMap();

}
