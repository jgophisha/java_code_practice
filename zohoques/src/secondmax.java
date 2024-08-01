
public abstract class secondmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int[] arr=new int[] {10,12,14,9,4};
		for(int a:arr) {
			if (a>first) {
				second=first;
				first=a;
			}
			else if (a>second) {
				second=a;
			}
		}
		if (arr.length<=1) {
			System.out.print("no second max);");
			return;
		}
		System.out.println("Second Max: "+second);
		
	}

}
