import java.util.Scanner;

public class java12 {
    //toán tử 3 ngôi
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Mời nhập vào bàn phím 1 số nguyên n : ");
        int n = cs.nextInt();
        String traloi = (n%2 == 0) ? "Chẵn " : "Lẻ";
        System.out.println("Số vừa nhập là số : "+traloi);
    }
}
