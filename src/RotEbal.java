import java.util.Scanner;

public class RotEbal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оцените ваше настроение от 1 до 10:");

        int moodLevel;
        while (true) {
            if (scanner.hasNextInt()) {
                moodLevel = scanner.nextInt();
                if (moodLevel >= 1 && moodLevel <= 10) {
                    break;
                } else {
                    System.out.println("Введите число от 1 до 10:");
                }
            } else {
                System.out.println("Некорректный ввод, попробуйте снова:");
                scanner.next(); // очистка ввода
            }
        }

        System.out.println("Ваш уровень настроения: " + moodLevel);

        if (moodLevel <= 3) {
            System.out.println("Кажется, у вас плохое настроение. Может, стоит отдохнуть?");
        } else if (moodLevel <= 7) {
            System.out.println("У вас среднее настроение, день может стать лучше!");
        } else {
            System.out.println("Отличное настроение! Так держать!");
        }

        scanner.close();
    }
}
