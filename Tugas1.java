import java.util.Scanner;
public class Tugas1 {
    public static void tampilkanDeretRekursif(int n) {
        if (n < 0) {
            return;
        }
        System.out.print(n + " ");
        tampilkanDeretRekursif(n - 1); 
    }
    public static void tampilkanDeretIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int n = 10; 
        System.out.println("Deret bilangan dari " + n + " sampai 0 (rekursif):");
        tampilkanDeretRekursif(n);
        System.out.println(); 
        System.out.println("Deret bilangan dari " + n + " sampai 0 (iteratif):");
        tampilkanDeretIteratif(n);
    }
}

