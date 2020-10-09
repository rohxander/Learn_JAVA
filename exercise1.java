import java.util.Scanner;  
public class exercise1 {
       public static void main(String[] args) {
       Scanner s = new Scanner(System.in); 
       double radius= s.nextDouble();
       double perimeter;
       double area;
       perimeter = Math.PI*2*radius;
       area = Math.PI*radius*radius;

       if(radius>0){
       		System.out.println(perimeter);
       		System.out.println(area);
       }
       else
       {
       	System.out.println("please enter non zero positive number");
       }
}
}