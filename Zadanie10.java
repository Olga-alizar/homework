//Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).

public class Zadanie10 {
    public static void main(String[] args){
        int f = 10;
        int i = 0;
        for (i=11; i <=15; i++)  {
            f *= i;
        }
        System.out.println ("факториал числа в границах от 10 до 15: " + f + "\n");
    }
}