import java.util.Scanner;

public class java10 {
    public static void main(String[] args) {
     // khởi tạo đối tượng scanner
        Scanner th = new Scanner(System.in); // th là tên đối tượng tùy ý
                                             // System.in cho phép nhập liệu từ bàn phím
        // cho phép nhập chuỗi
        System.out.println("mời nhâp vào mk cấp 1 :");
        String mk1 = th.nextLine();
        System.out.println("mk1 là :" +mk1);
        // nhập số nguyên
        System.out.println("mời nhâp vào 1 số nguyên :");
        int a = th.nextInt();
        System.out.println(" số a là " +a);
        // nếu dùng đoạn code thì khi nhập 2 chuỗi giống nhau chúng ta sẽ gặp lỗi do vậy
        // để chắc chắn hơn thì ta dùng đoạn code sau
        System.out.println("mời nhâp vào 1 số nguyên :");
        int b = new Scanner(System.in).nextInt();
        System.out.println(" số a là " +b);
    }
}
