import java.util.Scanner;

public class java11_1 {
    //Tính loại điểm
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Mời bạn nhập điểm :");
        double diem = new Scanner(System.in).nextDouble();
        if(10>=diem && diem>=8){
            System.out.println("bạn xếp loại giỏi");
        }else if(8>diem && diem>=6.5){
            System.out.println("bạn xếp loại khá");
        }else if(6.5>diem && diem>=5){
            System.out.println("bạn xếp loại trung bình");
        }else {
            System.out.println("bạn xếp loại yếu");
        }
    }
}

