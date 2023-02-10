package org.ponuch.lesson3.impl;

import org.ponuch.lesson3.interfaces.PhoneBook;

import java.util.*;

/**
 * Класс, упрощённо представлющий телефонную книгу. Предположим, что name - Имя + Фамилия и этого достаточно для уникальности
 */
public class PhoneBookImpl implements PhoneBook {
    private HashMap<String, List<String>> phoneBook = new HashMap<>();

    /**
     * Добавление телефона к существующему пользователю, либо добавление новой записи в книге
     * @param userName - пользователь
     * @param phone - телефон
     */
    public void insert(String userName, String phone) {
        if (phoneBook.containsKey(userName)) {
            var phones = phoneBook.get(userName);
            if (!phones.contains(phone)) {
                phones.add(phone);
            }
        }
        else {
            var list = new ArrayList<String>();
            list.add(phone);
            phoneBook.put(userName, list);
        }
    }

    /**
     * Возвращает список телефонов пользователя
     * @param userName - пользователь
     * @return список телефонов
     */
    public List<String> allPhones(String userName) {
        return phoneBook.getOrDefault(userName, Collections.emptyList());
    }

    public void delete(String userName, String phone) {
        if (phoneBook.containsKey(userName)) {
            phoneBook.get(userName).remove(phone);
        }
    }

    /**
     * Возвращает список телефонов пользователя
     * @param userName - имя пользователя
     * @return список телефонов пользователя
     */
    @Override
    public List<String> findByName(String userName) {
        if (phoneBook.containsKey(userName)) {
            return Collections.unmodifiableList(phoneBook.get(userName));
        }
        return Collections.emptyList();
    }

    /**
     *
     * @return Возвращает полный набор данных
     */
    @Override
    public Map<String, List<String>> getMap() {
        return Collections.unmodifiableMap(this.phoneBook);
    }
}
