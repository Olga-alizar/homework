
//Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
//учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//текста также могут быть пробелы, но могут и отсутствовать.

public class Zadanie19 {
    public static void main(String[] args) {
        //String str = "  Строковый литерал — это  последовательность символов, заключенных в двойные кавычки. ";
        String str = "  Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно ";
        int n = 0, j=0;
        char symbol;
        while (str.charAt(j) == ' '){
            j++;
        }

        for (int i = j; i < str.length(); i++) {
            symbol = str.charAt(i);
            if ((symbol == ' ' || symbol == ',' || symbol == '.' || symbol == '—')  && str.charAt(i-1) != ' ' && str.charAt(i-1) != ','  && str.charAt(i-1) != '.' && str.charAt(i-1) != '—') {
                n++;
            }
        }
        System.out.println("У нас есть " + n + " слов");
    }
}