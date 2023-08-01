import java.util.Random;

public class Main {
    public static void main(String[] args) {
     Random randomizer = new Random();

     int a = randomizer.nextInt(555)+1;
     int b = randomizer.nextInt(111)+1;

     System.out.println("Первое рандомное число: " + a);
     System.out.println("Второе рандомное число: " + b);

     Calculator calculator = new Calculator();

     int addResoult = calculator.add(a,b);
     int substractResoult = calculator.substract(a,b);
     int multyplyResoult = calculator.multyply(a,b);
     int divideResoult = calculator.divide(a,b);

     System.out.println("Результат сложения случайных чисел: " + addResoult);
     System.out.println("Результат вычитания случайных чисел: " + substractResoult);
     System.out.println("Результат умножения случайных чисел: " + multyplyResoult);
     System.out.println("Результат деления случайных чисел: " + divideResoult);
    }
}