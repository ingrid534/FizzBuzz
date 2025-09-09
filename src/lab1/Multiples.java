package lab1;

public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int fin = 0;
        while (i < 1000) {
            if ((i % 3) == 0 || i % 5 == 0) {
                fin++;
            }
            i++;
        }
        System.out.println(fin);
    }
}
