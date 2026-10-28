package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UserSet {
    // Коробка уникальных значений
    Set<String> nicknames = new HashSet<>();

    // 1. Добавление
    public void addUser(String... nick) {
        nicknames.addAll(Arrays.asList(nick));
    }
    // 2. Удаление
    public void removeUser(String nick) {
        nicknames.remove(nick);
    }
    // 3. Поиск через цикл for-each (без индексов, просто перебираем)
    public void findUser(String targetNick) {
        for (String nick : nicknames) {
            if (nick.equals(targetNick)) {
                System.out.println("Никнейм найден в сете: " + nick);
                break; // стоп-кран для цикла
            }
        }
    }

}
