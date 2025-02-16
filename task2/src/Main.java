import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double a = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double b = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double c = new Scanner(System.in).nextDouble();

        double max = 0;
        double mid = 0;
        double min = 0;
        //todo дописать логику программы ниже.
if (b > max) max = b;
if (c > max) max = c;

if (b < min) min =b;
if (c < min) min =c;

if ((a != max && a! = min))mid =a;
else if ((b ! = max && b!=min));
else mid =c;


        System.out.println("Наибольший вес: " + max);
        System.out.println("Средний вес: " + mid);
        System.out.println("Наименьший вес: " + min);
    }
}
