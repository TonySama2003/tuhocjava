import java.util.Scanner;

public class java13_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bấm số để chọn :");
        int so = sc.nextInt();
        switch (so){
            case 1:
                System.out.println(so+". Tìm theo tên");
                break;
            case 2:
                System.out.println(so+". Tìm theo tác giả");
                break;
            case 3:
                System.out.println(so+". Tìm theo nhà xuất bản");
                break;
            case 4:
                System.out.println(so+". Tìm theo tiêu đề");
                break;
        }
    }
}
