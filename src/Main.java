import java.util.LinkedList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        while (answer != 4) {
            System.out.println("Выберите действие:");
            System.out.println("1 - Добавить ");
            System.out.println("2 - Удалить");
            System.out.println("3 - Обновить");
            System.out.println("4 - Выйти");
            answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    System.out.println("Добавить новое действие");
                    Scanner scanner1 = new Scanner(System.in);
                    String add = scanner1.nextLine();
                    list.add(add);
                    System.out.println(list);
                    break;
                case 2:
                    System.out.println("Удалить действие");
                    Scanner scanner2 = new Scanner(System.in);
                    String remove = scanner2.nextLine();
                    list.remove(remove);
                    System.out.println(list);
                    break;
                case 3:
                    System.out.println("Текущий список дел:");
                    for (String i : list) {
                        System.out.println(i);
                    }
                    break;
                case 4:
                    System.out.println("До скорой встречи");
                    break;
                default:
                    System.out.println("Неверный выбор");
                    break;

            }

        }
    }
}