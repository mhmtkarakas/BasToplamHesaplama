import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        int sum = 0;
        while (number > 0) {

            sum += number % 10;
            number /= 10;
        }
        System.out.println("Basamak sayıları toplamı: " + sum);
    }
}