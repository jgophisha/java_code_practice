import java.util.*;
public class topthreefreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {7,6,5,4,3,1,6,7,13,25,3,7,19,9,6,10};
		int pmax=Integer.MIN_VALUE;
		int nmax=Integer.MAX_VALUE;
		for (int a:arr) {
			if (a>=pmax) {
				pmax=a;
			}
			else {
				nmax=a;
			}
		}
		int[] parr=new int[pmax-nmax];
		for (int num:arr) {
			parr[num-nmax]+=num;
		}
		Arrays.sort(parr);
		for(int i=0;i<3;i++) {
			System.out.print(parr[i]+" ");
		}
		
		

	}

}
