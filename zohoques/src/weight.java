import java.util.*;
public class weight{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int[] arr=new int[] {10,12,13,9,6};
		int[] arr_factcount=new int[n];
		for(int i=0;i<n;i++) 
		{
			arr_factcount[i]=factors(arr[i]);
		}
		for (int j=0;j<n-1;j++) {
			for(int k=0;k<n-j-1;k++) {
				if(arr_factcount[k]<arr_factcount[k+1]) {
					int temp=arr_factcount[k];
					arr_factcount[k]=arr_factcount[k+1];
					arr_factcount[k+1]=temp;
					
					temp=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;
				}
			}
		}
		System.out.printf("%-20s:","Array");
		System.out.println(Arrays.toString(arr));
		System.out.print("its factorial count :"+Arrays.toString(arr_factcount));
	}
	public static int factors(int num) {
		int count;
		if (num==1) {
			count=1;
			return count;
		}
		else if (num<0){
			count=0;
			return count;
		}
		else {
			count=2;
			for(int i=2;i<num/2;i++) {
				if(num%i==0) {
					count++;
				}
			}
			return count;
			}
		
	}
	

}
