//Найдите сумму первых n целых чисел, которые делятся на 3.


public class Zadanie12 {
    public static void main(String[] args){
        int n = 0;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        } else {
            n = (int)(Math.random()*20);
        }
        int i = 0, sum = 0, j = 0;
        while (i < n) {
            j ++;
            if (j % 3 == 0) {
                sum += j;
                i ++;
            }
        }
        System.out.println ("Сумма первых " + n + " целых чисел, которые делятся на 3 = " + sum);
    }
}