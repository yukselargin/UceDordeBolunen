import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, total = 0, count = 0, result;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        k = input.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                count++;
            }
        }
        result = total / count;
        System.out.print("Ortalama: " + result);
    }
}