package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PhoneBookMap {
    // Коробка Паспорт/Телефон (Ключ) -> Имя (Значение)
    Map<String, String> phoneBook = new HashMap<>();
    // 1. Добавление (в Map используется .put вместо .add)
    public void addContact(String phone, String name) {
        phoneBook.put(phone, name);
    }
    // 2. Удаление по ключу (по номеру телефона)
    public void removeContact(String phone) {
        phoneBook.remove(phone);
    }
    // 3. Поиск через цикл while
    public void findContactByPhone(String targetPhone) {
        // Берем список всех ключей (телефонов) для прокрутки в while
        Iterator<String> iterator = phoneBook.keySet().iterator();

        while (iterator.hasNext()) { // Пока в списке еще есть телефоны...
            String currentPhone = iterator.next();
            if (currentPhone.equals(targetPhone)) {
                System.out.println("Нашли! Номер " + currentPhone + " принадлежит: " + phoneBook.get(currentPhone));
                break;
            }
        }
    }
}
