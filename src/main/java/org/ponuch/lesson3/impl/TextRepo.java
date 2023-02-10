package org.ponuch.lesson3.impl;

import org.ponuch.lesson3.interfaces.PhoneBook;
import org.ponuch.lesson3.interfaces.Repository;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class TextRepo implements Repository {
    @Override
    public void save(PhoneBook phoneBook) throws IOException {
        Properties prop = new Properties();
        for(Map.Entry<String, List<String>> entry: phoneBook.getMap().entrySet()) {
            prop.put(entry.getKey(), String.join(", ", entry.getValue()));
        }
        prop.store(new FileOutputStream("data.properties"), null);
        System.out.println("Saved to file");
    }
}
