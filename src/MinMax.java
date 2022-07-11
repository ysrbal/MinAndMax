import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int minNum = 0, maxNum = 0;
        int n, i = 1;

        System.out.print("Kac Tane Sayi Gireceksiniz : ");
        n = inp.nextInt();
        
        while (i <= n) {
            int j;
            System.out.print(i + ". Sayiyi Giriniz : ");
            j = inp.nextInt();
            i++;
            if (j > maxNum) {
                maxNum = j;
            } else if (j < minNum || j == 0) {
                minNum = j;
            }
        }
        System.out.println("En Buyuk Sayi : " + maxNum);
        System.out.println("En Kucuk Sayi : " + minNum);
    }
}