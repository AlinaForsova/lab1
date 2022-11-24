import java.util.Scanner;
public class lab1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество точек: ");
        int N = in.nextInt();
        System.out.println("Введите радиус окружности: ");
        int R = in.nextInt();
        int quantity = 0;
        for (int n = 0; n < N; n = n + 1) {
            System.out.println("X " + (n + 1) + " точки: ");
            float X = in.nextInt();
            System.out.println("Y " + (n + 1) + " точки: ");
            float Y = in.nextInt();
            if (X * X + Y * Y <= R * R) {
                quantity = quantity + 1;
            }

        }
        System.out.println(quantity + " точек попало в окружность");
    }
}
