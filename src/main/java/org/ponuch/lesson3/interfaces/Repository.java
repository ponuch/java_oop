package org.ponuch.lesson3.interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Интерфейс для сохранения книги в разных форматах
 */
public interface Repository {
    void save(PhoneBook phoneBook) throws IOException;
}
