import javax.xml.transform.sax.SAXSource;
import java.sql.SQLOutput;
import java.util.Scanner;

public class java11_7 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Nhập vào số Tháng :");
        int x = new Scanner(System.in).nextInt();
        if(x==1 || x == 2 || x == 3) {
            System.out.println("Tháng " +x+ " Thuộc quý 1");
        }else if(x==4 || x == 5 || x == 6){
            System.out.println("Tháng " +x+ " Thuộc quý 2");
        }else if(x==7 || x == 8 || x == 9){
            System.out.println("Tháng " + x + " Thuộc quý 3");
        }else if(x==10 || x == 11 || x == 12){
            System.out.println("Tháng " + x + " Thuộc quý 3");
        }
    }
}
