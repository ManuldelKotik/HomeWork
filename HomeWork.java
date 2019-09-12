//Домашнее задание. Пункт 1

public class MainClass {
    public static void main (String() args) {

    }
}

//Домашнее задание. Пункт 2

public class MainClass {
    public static void main (String() args) {

        byte z = 15;
        System.out.println(z);

        short x = 756;
        System.out.println(x);

        int y = 10 / 4;
        System.out.println(y);

        long l = 1689246347L;
        System.out.println(l);

        double w = 6.6849132;
        System.out.println(w);

        float v = 6.6849132f;
        System.out.println(v);

        char a = 'u';
        char a1 = 643;
        char a2 = '\u244';
        System.out.println(a + " " + a1 + " " + a2);

        boolean b = 9==9;
        System.out.println(b);
        boolean c = 4>7;
        System.out.println(c);

    }
}

//Домашнее задание. Пункт 3

public class MainClass {
   public static int calculate(int a, int b, int c, int d) {
       int a, b, c, d;
       a = 3;
       b = 5;
       c = 1;
       d = 6;

       double z = (a * (b + (c / d)));
       return z;

       System.out.println(z);
        }
    }

//Домашнее задание. Пункт 4

public class MainClass {
    public static boolean task10and20(int x1, int x2) {
        int sum = x1 + x2;
        if (sum > 10 && sum < 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

//Домашнее задание. Пункт 5

public class MainClass {
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
}

//Домашнее задание. Пункт 6

public class MainClass {
    public static boolean isNegative(int x) {
        if (x < 0 ) {
            return true;
        }
        return false;
    }
}

//Домашнее задание. Пункт 7

public class MainClass {
    public static void greetings(String name) {
        System.out.println("Привет, " + name + "!");
    }
}

//Домашнее задание. Пункт 8

public class MainClass {
    public static void year(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + "не високосный");
        else System.out.println(year + "високосный");
    }
}
