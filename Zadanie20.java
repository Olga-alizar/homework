
//Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.


public class Zadanie20 {
    public static void main(String[] args) {

        String str = "  Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов. ";
        String strlast = "";
        int n = 0, j=0;
        char symbol;
        while (str.charAt(j) == ' '){
            j++;
        }

        for (int i = j; i < str.length(); i++) {
            symbol = str.charAt(i);
            if ((symbol == ' ' || symbol == ',' || symbol == '.' || symbol == '—')  && str.charAt(i-1) != ' ' && str.charAt(i-1) != ','  && str.charAt(i-1) != '.' && str.charAt(i-1) != '—') {
                strlast = strlast + str.charAt(i-1);
            }
        }
        System.out.println(strlast);
    }
}

