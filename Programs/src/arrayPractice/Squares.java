package arrayPractice;

public class Squares {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5,6};

		squares(arr);
		for(int n:arr) {
			System.out.println(n);
		}
	}
	static int[] squares(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=arr[i]*arr[i];
		}
		return arr;
		
	}

}
