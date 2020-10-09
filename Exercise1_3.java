import java.util.Scanner;
public class Exercise1_3 {
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	   int sum=0;
	   int b=2*n;
	   for(int a=0; a<b; a=a+2)
	   	if( a % 3 == 0)
	   		sum = sum + a;
	   System.out.println(sum);
	   
	   
}}