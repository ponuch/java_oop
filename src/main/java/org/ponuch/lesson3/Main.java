package org.ponuch.lesson3;

import org.ponuch.lesson3.impl.PhoneBookImpl;
import org.ponuch.lesson3.impl.TextRepo;
import org.ponuch.lesson3.interfaces.PhoneBook;
import org.ponuch.lesson3.interfaces.Repository;

import java.io.IOException;

/**
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        PhoneBook phoneBookImpl = new PhoneBookImpl();
        phoneBookImpl.insert("alex", "222-333-444");
        phoneBookImpl.insert("alex", "111-222-555");
        var phones =  phoneBookImpl.allPhones("alex");
        assert phones.size() == 2;
        System.out.println(phones);
        phoneBookImpl.delete("alex", "111-222-555");
        assert phones.size() == 1;
        System.out.println(phones);

        Repository repo = new TextRepo();
        repo.save(phoneBookImpl);

    }
}