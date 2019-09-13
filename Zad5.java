
//Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?

public class Zad5 {
        public static void main(String[] args) {
            int n = 1234;
            int a = n/1000;
            int b = n-(a*1000);
            int c = b/100;
            int d = b-(c*100);
            int i = d/10;
            int f = d-(i*10);
            if (a != c && a != i && a != f && c != i && c != f && i != f)
            {
                System.out.println(" Все числа различны" );
            } else {
                System.out.println(" Есть повторяющиеся" );
            }
        }
    }

