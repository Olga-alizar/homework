//Определить число, полученное выписыванием в обратном порядке цифр
//любого 4-х значного натурального числа n.

public class Zadanie4 {
    public static void main(String[] args) {

        int n = 1234;
        int a = n/1000;
        int b = n-(a*1000);
        int c = b/100;
        int d = b-(c*100);
        int i = d/10;
        int f = d-(i*10);
        int g = f*1000+i*100+c*10+a;

        System.out.println ("Исходное число: " + a + c + i + f + "\nОбратный порядок: " + g);
    }
}


