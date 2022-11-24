import java.util.Scanner;

public class lab1_1 {
    public static void main (String [] args) {
        int dayNow=25;
        int monthNow=11;
        int yearNow=2022;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день своего рождения: ");
        int day =in.nextInt();
        if (day<1 || day >31) {
            System.out.println("Неверный формат входных данных");
            in.close();
        } else {
        System.out.println("Введите месяц своего рождения:");
            int month = in.nextInt();
            if (month<1 || month>12) {
                System.out.println("Неверный формат входных данных");
                in.close();
            } else {
        System.out.println("Введите год своего рождения:");
        int year= in.nextInt();
        if (year>2022) {
            System.out.println("Неверный формат входных данных");
            in.close();
        } else {
            if (monthNow>month) {
            System.out.print((yearNow-year) + "лет, " + (monthNow-(month+1)) + "месяцев и " + (31+(dayNow-day)) + "дней" );
            }
            else {
                if (monthNow<month) {
                    System.out.println((yearNow-(year-1)) + "лет, " + monthNow + "месяцев и " + Math.max(dayNow-day,dayNow) + "дней");
                } else {
                    if (monthNow==month) {
                        if (dayNow<day) {
                            System.out.println((yearNow-(year-1)) + "лет, " + monthNow + "месяцев и " + dayNow + "дней");
                        } else {
                            if (dayNow>day) {
                                System.out.println((yearNow-year) + "лет, " + 0 + "месяцев и " + (dayNow-day) + "дней");
                            }

                        }
                    }
                }
            }


                }
            }
        }
    }
}

