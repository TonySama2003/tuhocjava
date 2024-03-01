import java.util.Scanner;

public class java_baiap_12_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập vào 1 số bất kì :");
        int a =sc.nextInt();
        int giaiThua = 1;
        while (true){
            giaiThua*=a;
            a--;
            if(a==1)
                break;
        }
        System.out.println(a+"! ="+giaiThua);
    }
}
