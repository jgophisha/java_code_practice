import java.util.Scanner;
public class decimaltobinarr {
	public static void main(String[] args) {
		int num=32;
		int[] arr=new int[9];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a binary number:");
		int n=sc.nextInt();
		int place=1;
		while(n!=0) {
			int rem=n%10;
			for(int i=0;i<rem;i++) {
				arr[i]+=place;
			}
			place*=10;
			n/=10;
		}
		
		for (int num1:arr) {
			if (num1==0) {
				break;
			}
			else {
				System.out.print(num1+" ");
			}
		}
		sc.close();
	}


}
