
//Напишите три цикла выполняющих многократное сложение строк, один с
//помощью оператора сложения и String, другой с помощью StringBuilder и метода
//append, а также аналогично для StringBuffer. Сравните скорость их выполнения.

public class Zadanie21 {
    public static void main(String[] args) {

        String first = "";
        StringBuilder second = new StringBuilder();
        StringBuffer third = new StringBuffer();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1500; i++) {
            first += "ab";
        }
        System.out.println(" String за " + (System.currentTimeMillis() - start) + " мс");

        start = System.currentTimeMillis();
        for (int i = 0; i < 1500; i++) {
            second.append("ab");
        }
        System.out.println("StringBuilder за " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 1500; i++) {
            third.append("ab");
        }
        System.out.println("StringBuffer за " + (System.currentTimeMillis() - start));
    }
}

