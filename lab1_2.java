import java.util.Scanner;

public class lab1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день: ");
        int day = in.nextInt();
        if (day < 1 || day > 31) {
            System.out.println("Неверный формат входных данных");
            in.close();
        } else {
            System.out.println("Введите месяц:");
            int month = in.nextInt();
            if (month < 1 || month > 12) {
                System.out.println("Неверный формат входных данных");
                in.close();
            } else {
                if (month == 1 || month == 2 || month == 12) {
                    System.out.println("Зима");
                } else {
                    if (month == 3 || month == 4 || month == 5) {
                        System.out.println("Весна");
                    } else {
                        if (month == 6 || month == 7 || month == 8) {
                            System.out.println("Лето");
                        } else {
                                System.out.println("Осень");
                            }
                        }
                    }
                }
            }
        }
    }

