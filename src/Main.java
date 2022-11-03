package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        System.out.println("Xos geldiniz");
        while (i == 1) {
            System.out.println("Zehmet olmasa ededi daxil edin :");
            int a = scan.nextInt(); //bölünən
            int b = 1;  //bölən
            int f = 1;  //ededin bolenlerinin sayi
            while (b <= a / 2) {
                if ((a % b++) == 0) {
                    f++;

                }
            }
            if (f == 2) {
                System.out.println("Bu eded sadedir))");
                System.out.println("Ededin bolenlerinin sayi : " + f);
            } else if (f >= 2) {
                System.out.println("Bu eded murekkebdir))");
                System.out.println("Ededin bolenlerinin sayi : " + f);
            } else if (a == 1) {
                System.out.println("Bu eded ne sade deyil,nede murekkeb deyil))");
            } else if (a == 0) {
                System.out.println("Ededin boleni yoxdur ve eyni zamanda bu eded ne sade deyil nede murekkebdir))");
            }
            System.out.println("Eger yeniden cehd etmek isteyirsinizse 1,eks halda ise 0 daxil edin!");
            i = scan.nextInt();
        }
    }
}