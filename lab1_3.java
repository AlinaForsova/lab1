import java.sql.SQLOutput;
import java.util.Scanner;

public class lab1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число x: ");
        int x = in.nextInt();
        System.out.println("Введите целое число n:");
        int n = in.nextInt();
        if (n < -15 || n > 15) {
            System.out.println("Неверный формат входных данных");
            in.close();
        } else {
            if (n == 1) {
                System.out.println(x);
            } else {
                if (n == 0) {
                    System.out.println(1);
                } else {
                    if (n > 0) {
                        int number = 1;
                        for (int degree = 0; degree < n; degree = degree + 1) {
                            number = number * x;

                        }
                        System.out.println(number);
                    }
                    if (n < 0) {
                        float number = 1;
                        for (int degree = 0; degree > n; degree = degree - 1) {
                            number = number / x;
                        }
                        System.out.println(number);
                    }
                }
            }

        }
    }
}

