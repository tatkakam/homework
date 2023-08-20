import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
    public static int start() {
        Scanner sc = new Scanner(System.in);
        Random randomizer = new Random();

        int correctAnswer = 0;
        int userAnswer = 1;

        int x = 0;
        int y = 0;

        int score = 0;

        int[] scores = new int[3];
        String[] firstNames = new String[3];
        String[] lastNames = new String[3];


        for(int i = 0; i < 3; i++ ) {
            do {
                System.out.print("Приветствуем вас, " + (i+1) +"-й игрок! Вы участвуете в математическом Quiz'е. Введите ваши Имя Фамилия ");
                firstNames[i] = sc.next();
                lastNames[i] = sc.next();
                System.out.println(firstNames[i] + " " + lastNames[i] + ", Вы готовы? Приступим!");
                x = randomizer.nextInt(9) + 1;
                y = randomizer.nextInt(9) + 1;

                System.out.print("Сложите эти два случайных числа " + x + "+" + y + " и напишите ответ: ");
                userAnswer = sc.nextInt();
                correctAnswer = Calculator.add(x, y);
                if (correctAnswer != userAnswer) {
                    score = score - 5;
                } else {
                    score = score + 5;
                }
                System.out.println("Ваш ответ: " + userAnswer + ". Правильный ответ: " + correctAnswer + ". Текущее количество баллов: " + score);

                System.out.print("Произведите вычитание этих двух случайных чисел " + x + "-" + y + " и напишите ответ: ");
                userAnswer = sc.nextInt();
                correctAnswer = Calculator.substract(x, y);
                if (correctAnswer != userAnswer) {
                    score = score - 5;
                } else {
                    score = score + 5;
                }
                System.out.println("Ваш ответ: " + userAnswer + ". Правильный ответ: " + correctAnswer + ". Текущее количество баллов: " + score);

                System.out.print("Перемножьте эти два случайных числа " + x + "*" + y + " и напишите ответ: ");
                userAnswer = sc.nextInt();
                correctAnswer = Calculator.multyply(x, y);
                if (correctAnswer != userAnswer) {
                    score = score - 5;
                } else {
                    score = score + 5;
                }
                System.out.println("Ваш ответ: " + userAnswer + ". Правильный ответ: " + correctAnswer + ". Текущее количество баллов: " + score);

                System.out.print("Поделите эти два случайных числа " + x + "/" + y + " и напишите ответ в виде целой части: ");
                userAnswer = sc.nextInt();
                correctAnswer = Calculator.divide(x, y);
                if (correctAnswer != userAnswer) {
                    score = score - 5;
                } else {
                    score = score + 5;
                }
                System.out.println("Ваш ответ: " + userAnswer + ". Правильный ответ: " + correctAnswer + ". Текущее количество баллов: " + score);
                scores[i] = score;
                if (score < 20) {
                    System.out.println(firstNames[i] + " " + lastNames[i] + "Ваш финальный счет: " + scores[i] + " баллов. Вы допустили ошибки, но принимаете участие в конкурсе. Удачи!");
                } else {
                    System.out.println("Ура! Опросник завершён! " + firstNames[i] + " " + lastNames[i] + ", Вы победили!  Ваш финальный счет составил  максимальное количество: " + scores[i] + " баллов.");
                    System.out.println();
                    System.out.println();
                }
                score = 0;
                break;
            } while (correctAnswer != userAnswer);

            }
        System.out.println("По итогам опроса 3-х игроков получены следующие результаты: " );
        System.out.println();
        System.out.println(" Финальный счет 1-го игрока " + firstNames[0]  + " " + lastNames[0] + " = " + scores[0] + " баллов.");
        System.out.println();
        System.out.println(" Финальный счет 2-го игрока " + firstNames[1]  + " " + lastNames[1] + " = " + scores[1] + " баллов.");
        System.out.println();
        System.out.println(" Финальный счет 3-го игрока " + firstNames[2]  + " " + lastNames[2] + " = " + scores[2] + " баллов.");


        return correctAnswer;
    }
}