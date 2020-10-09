import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
       int s=0;
       int remainder;
       int number;
       number = n;
       	for(;number!=0;number/=10,s++);
       		number = n;
       		for(;number!=0;number/=10)
       		{
       			remainder=number%10;
       			result += Math.pow(remainder,s);
       		}
       	if(result==n)
       		System.out.println("1");
       	else {
       		System.out.println("0");
       	}
}}