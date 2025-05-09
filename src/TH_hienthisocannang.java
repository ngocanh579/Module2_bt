import java.util.Scanner;

public class TH_hienthisocannang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap can nang: ");
        double weight = sc.nextDouble();
        System.out.print("nhap chieu cao: ");
        double height = sc.nextDouble();
        double bmi = weight/(height*height);
        System.out.printf("%-20s%s","bmi","Interpretation");
        System.out.println();
        if(bmi<18.5){
            System.out.printf("%-20.2f%s",bmi,"Underweight");
            System.out.println();
        }
        if(bmi < 25.0){
            System.out.printf("%-20.2f%s",bmi,"Normal");
            System.out.println();
        }if(bmi < 30.0){
            System.out.printf("%-20.2f%s",bmi,"Overweight");
            System.out.println();
        }else {
            System.out.printf("%-20.2f%s",bmi,"Obese");
        }
    }
}
