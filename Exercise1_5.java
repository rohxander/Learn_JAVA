import java.util.Scanner;
public class Exercise1_5{
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
         double mark_avg;
         int result;
         int i;
         int s;
    
      //define size of array
       s = input.nextInt();
     //The array is defined "arr" and inserted marks into it of integer type.
      int[] arr = new int[s];   
      
	 for(i=0;i<arr.length;i++)
	  {
        	arr[i]=input.nextInt();
	  } 
  float sum=0;
  int temp;

  for (int k = 0; k < arr.length; k++) {     
    for (int j = k+1; j < arr.length; j++) {     
       if(arr[k] > arr[j]) {    
           temp = arr[k];    
           arr[k] = arr[j];    
           arr[j] = temp;    
       }     
    }     
  }
  System.out.print(arr[s-1]+"\n"); 

for(int x=0;x<arr.length;x++)
  {
    sum += arr[x];
  }

System.out.println(sum/s);  
      
}}