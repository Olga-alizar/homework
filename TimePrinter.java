public class TimePrinter {
public static void main(String[] args) {
int s = 4500;
int sec = s % 60;
int m = (s - sec) / 60;
int min = m % 60;
int h = (m - min) / 60;
int d = s / 86400;
int n = s / 604800;
System.out.println(min + " ����� " + sec + " ������ ");
System.out.println(h + " ����� " + min + " ����� " + sec + " ������ ");
System.out.println(d + " ���� " + h + " ����� " + min + " ����� " + sec + " ������ ");
System.out.println(n + " ������ " + d + " ���� " + h + " ����� " + min + " ����� " + sec + " ������");
}
}