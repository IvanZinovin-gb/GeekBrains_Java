public class Main {
    public static void main(String[] args) {
        //Задание 2
        byte var1 = 125;
        short var2 = 1002;
        int var3 = 2010;
        long var4 = 777L;
        float var5 = 1.25f;
        double var6 = 3.14D;
        char var7 = 'a';
        boolean var8 = true;

        System.out.println(calculate(2, 5, 3, 9));
        System.out.println(calculate(1, 2, 3, 4));

        System.out.println(check(4, 5));// 9 < 10 - false
        System.out.println(check(9, 1)); //10=10 - true
        System.out.println(check(10, 2)); //12 > 10 && 12 < 20 - true
        System.out.println(check(10, 10)); //20 = 20 - true

        checking_sign(1);
        checking_sign(-5);
        checking_sign(0);

        System.out.println(checking_number(1));
        System.out.println(checking_number(-4));

        welcome_function("Иван");
        welcome_function("GeekBrains");

        leap_year(100);
        leap_year(200);
        leap_year(400);
        leap_year(500);
        leap_year(501);
        leap_year(504);
        leap_year(800);
        leap_year(2001);
        leap_year(2018);
        leap_year(2020);
        leap_year(2016);
    }

    //Задание 3
    public static float calculate(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;
    }

    //Задание 4
    public static boolean check(float a, float b) {
        float sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //Задание 5
    public static void checking_sign(int a) {
        if (a < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    //Задание 6
    public static boolean checking_number(int a) {
        if (a < 0) {
            return true;
        } else return false;
    }

    //Задание 7
    public static void welcome_function(String name) {
        System.out.println("Привет, " + name + "!");
    }

    //Задание 8
    public static void leap_year(int year) {
        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Год високосный");
        } else System.out.println("Год не високосный");
    }

    /*
    Написать метод, который определяет является ли год високосным,
     и выводит сообщение в консоль.
     Каждый 4-й год является високосным,
     кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
}
