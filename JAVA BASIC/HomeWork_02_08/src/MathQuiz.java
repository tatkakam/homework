import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
    public static int start() {
        Scanner sc = new Scanner(System.in);
        Random randomizer = new Random();

        int correctAnswer = 0;
        int userAnswer = 1;
        int correctAnswerAdd = 0;
        int userAnswerAdd = 1;
        int correctAnswerSubstract;
        int userAnswerSubstract;
        int correctAnswerMultyPly;
        int userAnswerMultyPly;
        int correctAnswerDivide;
        int userAnswerDivide;


        int x = 0;
        int y = 0;

        int counter = 0;
        int counterAdd = 0;
        int counterSubstract = 0;
        int counterMultyPly = 0;
        int counterDivide = 0;
        int finalCounter = 0;

        do {
            x = randomizer.nextInt(9) + 1;
            y = randomizer.nextInt(9) + 1;

            System.out.println("Сложите эти два случайных числа " + x + "+" + y + " и напишите ответ: ");
            userAnswerAdd= sc.nextInt();
            userAnswer = userAnswerAdd;
            correctAnswerAdd = Calculator.add(x, y);
            correctAnswer = correctAnswerAdd;
            if (correctAnswerAdd != userAnswerAdd) { counter = counter - 5 ;
            counterAdd = counter;}
            else {counter = counter + 5;
            counterAdd = counter;}
            System.out.println("Ваш ответ: " + userAnswer + ". Правильный ответ: " + correctAnswer + ". Текущее количество баллов: " + counterAdd);

            System.out.println("Произведите вычитание этих двух случайных чисел " + x + "-" + y + " и напишите ответ: ");
            userAnswerSubstract= sc.nextInt();
            userAnswer = userAnswerSubstract;
            correctAnswerSubstract = Calculator.substract(x, y);
            correctAnswer = correctAnswerSubstract;
            if (correctAnswerSubstract != userAnswerSubstract) { counter = counter - 5 ;
                counterSubstract = counter;}
            else {counter = counter + 5;
                counterSubstract = counter;}
            System.out.println("Ваш ответ: " + userAnswer + ". Правильный ответ: " + correctAnswer + ". Текущее количество баллов: " + counterSubstract);

            System.out.println("Перемножьте эти два случайных числа " + x + "*" + y + " и напишите ответ: ");
            userAnswerMultyPly = sc.nextInt();
            userAnswer = userAnswerMultyPly;
            correctAnswerMultyPly = Calculator.multyply(x, y);
            correctAnswer = correctAnswerMultyPly;
            if (correctAnswerMultyPly != userAnswerMultyPly) { counter = counter - 5 ;
                counterMultyPly = counter;}
            else {counter = counter + 5;
                counterMultyPly = counter;}
            System.out.println("Ваш ответ: " + userAnswer + ". Правильный ответ: " + correctAnswer + ". Текущее количество баллов: " + counterMultyPly);

            System.out.println("Поделите эти два случайных числа " + x + "/" + y + " и напишите ответ в виде целой части: ");
            userAnswerDivide= sc.nextInt();
            userAnswer = userAnswerDivide;
            correctAnswerDivide = Calculator.divide(x, y);
            correctAnswer = correctAnswerDivide;
            if (correctAnswerDivide != userAnswerDivide) { counter = counter - 5 ;
                counterDivide = counter;}
            else {counter = counter + 5;
                counterDivide = counter;}
            System.out.println("Ваш ответ: " + userAnswer + ". Правильный ответ: " + correctAnswer + ". Текущее количество баллов: " + counterDivide);
            if (counterDivide < 15 || counterAdd < 0 || counterMultyPly < 10 || counterSubstract < 5)
            { System.out.println ("Вы допустили ошибки, можете попробовать заново в следующий раз. Удачи!");}
            if (counterDivide < counterMultyPly) {break;}
        } while (correctAnswer != userAnswer);

        finalCounter = counterDivide;

        if (finalCounter >= 20) {
            System.out.println("Ура! Опросник завершён! Вы победили!  Ваш финальный счет составил  максимальное значение: " + finalCounter);}

        return correctAnswer;

    }
}