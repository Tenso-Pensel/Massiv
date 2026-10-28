package org.example;


public class Main {
    public static void main(String[] args) {
                                    // Проверяем 1-й класс (List + for)
        GameList myGames = new GameList();
        myGames.addGame("Rust");
        myGames.addGame("CS2");
        myGames.findGame("Rust");
        myGames.removeGame("CS2");

                                     // Проверяем 2-й класс Set (for-each)
      UserSet userSet = new UserSet();
        userSet.addUser("Lexa");
       userSet.removeUser("Nikita");
        userSet.findUser("Dada");
                                    // Проверяем 3-й класс Map (while)
       PhoneBookMap book = new PhoneBookMap();
        book.addContact("7904444444", "Lexa");
        book.addContact("79991112233", "Dima");
        book.removeContact("7904444444");
        book.findContactByPhone("7904444444");
                                      // Проверяем 4-й класс Queue (do-while)
        CarQueue carQueue = new CarQueue();
        carQueue.addCar("Mazda");
        carQueue.removeCar("Nissan");
        carQueue.findCar("Mazda");


    }


}
