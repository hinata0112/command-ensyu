import java.util.Scanner;

public class BMI {
    public static void main  (String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Height : ");
      double height = Integer.parseInt(sc.nextLine());
        System.out.print("Wight : ");
      double wight = Integer.parseInt(sc.nextLine());


      height /= 100;
      height *= height;

      double bmi = wight / height;
        System.out.println("BMI : " + String.format("%.2f", bmi));

	  System.out.print("Height : ");
         height = Integer.parseInt(sc.nextLine());
        System.out.print("Wight : ");
         wight = Integer.parseInt(sc.nextLine());


        height /= 100;
        height *= height;

        bmi = wight / height;
        System.out.println("BMI : " + String.format("%.2f", bmi));
}
    }
