package org.example;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class CarQueue {
    // Четвертый вид коллекций — Очередь
    Queue<String> cars = new ArrayDeque<>();

    // 1. Добавление
    public void addCar(String car) {
        cars.add(car);
    }

    // 2. Удаление
    public void removeCar(String car) {
        cars.remove(car);
    }

    // 3. Поиск через цикл do-while
    public void findCar(String targetCar) {
        if (cars.isEmpty()) {
            System.out.println("Очередь пустая!");
            return;
        }

        Iterator<String> iterator = cars.iterator();
        do {
            String currentCar = iterator.next();
            if (currentCar.equals(targetCar)) {
                System.out.println("Машина " + targetCar + " найдена в очереди!");
                break;
            }
        } while (iterator.hasNext());
    }
}
