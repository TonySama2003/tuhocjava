import java.util.Scanner;

public class java11 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("mời nhập vào điểm của bạn : ");
        double dtb = new Scanner(System.in).nextDouble();
        // kiểm tra điều kiện
        if(10>dtb && dtb>=5.0) {
            System.out.println("bạn đã đỗ ");
            System.out.println("chúc mừng bạn ");
        } else
            System.out.println("bạn đã tạch");

    }
}
