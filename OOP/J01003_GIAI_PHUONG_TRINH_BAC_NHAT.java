import java.util.Scanner;
public class J01003_GIAI_PHUONG_TRINH_BAC_NHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ptr bac nhat co dang ax + b = 0 => x = (-b)/a
        // a=0 và b=0 => ptr vsn
        //a=0, b!=0 => ptr VN
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double s = (-b)/a;
        if(a==0){
            if(b==0){
                System.out.println("VSN");
            }
            else {
                System.out.println("VN");
            }
        }
        else{
        System.out.printf("%.2f", s);
    }
}
}
