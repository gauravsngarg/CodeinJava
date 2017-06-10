//http://www.geeksforgeeks.org/fill-array-1s-minimum-iterations-filling-neighbors/

public class Solution {

	public static void main(String[] args) {
		int[] arr = {1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
		FillOnesinArray ob = new FillOnesinArray();

		ob.init(arr);
		int ans = ob.fillOnesInArray(arr);
		System.out.print(ans);
		
		
	}
}
