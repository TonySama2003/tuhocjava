import java.util.Scanner;

public class java_baitap_12 {
    // Viết số nguyên n bất kì và in ra n!
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập vào số nguyên n :");
        int giaiThua = 1;
        for (int n = sc.nextInt() ; n>0 ; n--){
            giaiThua *= n ;
        }
        System.out.println("n! ="+giaiThua);
    }
}
