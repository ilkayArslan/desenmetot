import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int number = input.nextInt();
        inme(number,number);
    }

    static void inme (int a,int b){
        if (a>0){
            System.out.print(a + " ");
            a-=5;
            inme(a,b);
        }else {
            cikme(a,b);
        }
    }
    static void cikme(int a,int b){
        if (a<=b){
            System.out.print(a + " ");
            a+=5;
            cikme(a,b);
        }
    }
}