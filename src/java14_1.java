import java.util.Scanner;

public class java14_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số trong khoảng từ 1 => 99 :");
        int n = sc.nextInt();
        while (n<1 || n>99){
            System.out.println("Nhập lại : số "+n+" không nằm trong khoảng từ 1 => 99");
            n = sc.nextInt();
        }
        System.out.println("Bạn đã nhập xong số n = "+n);
    }
}
