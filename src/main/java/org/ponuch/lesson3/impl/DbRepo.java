package org.ponuch.lesson3.impl;

import org.ponuch.lesson3.interfaces.PhoneBook;
import org.ponuch.lesson3.interfaces.Repository;

public class DbRepo implements Repository {
    @Override
    public void save(PhoneBook phoneBook) {
        System.out.println("Save to database");
    }
}
