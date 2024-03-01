import java.util.Scanner;

public class java_baitap_5 {
    //Tính BMI
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("nhập vào chiều cao (m):");
        double chieucao = new Scanner(System.in).nextDouble();
        System.out.println("nhập vào cân nặng (kg)");
        double cannang = new Scanner(System.in).nextDouble();
        double BMI = cannang/Math.pow(chieucao,2);
        System.out.println("BMI của bạn là :" +BMI);
        if(BMI<15){
            System.out.println("thận hình quá gầy");
        }else if(BMI>=15 && BMI<16){
            System.out.println("thân hình gầy");
        }else if(BMI>=16 && BMI<18.5){
            System.out.println("thân hình hơi gầy");
        }else if(BMI>=18.5 && BMI<25){
            System.out.println("thân hình bình thường");
        }else if(BMI>=25 && BMI<30){
            System.out.println("thân hình hơi béo");
        }else if(BMI>=30 && BMI<35){
            System.out.println("thân hình béo");
        }else if(BMI>=35) {
            System.out.println("thân hình quá béo");
        }
    }
}
