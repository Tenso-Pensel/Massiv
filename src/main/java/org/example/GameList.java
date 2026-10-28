import java.util.ArrayList;
import java.util.List;

public class GameList {
    List<String> games = new ArrayList<>();


    public void addGame(String game) {
        games.add(game);
        System.out.println("Добавлили игру" + game);
    }

    public void removeGame(String game) {
        games.remove(game);
        System.out.println("Удалили игру: " + game);
    }

    public void findGame(String targetGame) {
        for (int i = 0; i < games.size(); i++) {
            if (games.get(i).equals(targetGame)) {
                System.out.println("Нашли игру" + targetGame + "под индексом: " + i);
                return; // выходим из метода, раз уже нашли
            }
        }
        System.out.println("Игра '" + targetGame + "' не найдена!");
    }
}
