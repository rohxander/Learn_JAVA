import java.util.Scanner;  
public class Exercise1_2 {
       public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        int x = s.nextInt(); 
        int y = s.nextInt();
        int z = s.nextInt();
        int result = 0;
         if(x>y){
    		if(x>z){
      			System.out.println(x);}
    		else{
      			System.out.println(z);}
      		}
  		if(y>x){
  			if(y>z){
  				System.out.print(y);}
  			else{
  				System.out.print(z);}
  			}
}}