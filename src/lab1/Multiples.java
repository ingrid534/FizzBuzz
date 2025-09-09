package lab1;

public class Multiples {
    public static void main(String[] args) {
//        multiples();
    }

    public static int multiples(int n, int a, int b) {
        int i = 1;
        int fin = 0;
        while (i < n) {
            if ((i % a) == 0 || i % b == 0) {
                fin++;
            }
            i++;
        }
        System.out.println(fin);
        return fin;
    }

    public static int multiples() {
        return multiples(1000, 3, 5);
    }
}
