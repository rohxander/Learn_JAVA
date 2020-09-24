class TestArray{
	public static void main(String[] args) {
		int a[] ={20, 30, 40, 50, 60};
			for (int i=0; i<a.length;i++) {
			 	System.out.println(a[i]);
			 } 
			 float sum = 0, avg;
			 for (int i=0; i<a.length; i++){
			 	System.out.println(sum);
			 	sum += a[i];
			 	if(i == 4){
			 	System.out.println(sum);
			 }}
			 
			 avg = sum/a.length;
			 System.out.println("Average = "+ avg);
			

	}
}