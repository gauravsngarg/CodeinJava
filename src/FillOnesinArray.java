
public class FillOnesinArray {

	// 3 cases
	// Case 1: Check for all blocks of 0's before first one
	// print count_zero
	// Case 2: Check for all blocks of zero keeping 1's on both side
	// if(count_zero == even) print count_zero/2
	// if(count_zero == odd) print (count_zero/2)+1
	// Case 3: Check for all blocks of 0's after last one
	// print count_zero

	// members
	private int count_zero;
	// flag represent cases
	private int FLAG;
	private int answer;
	private int[] arr;

	public void init(int []arr){
		FLAG = 1;
		answer = 0;
		count_zero = 0;
	}

	public int fillOnesInArray(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0){
				count_zero++;
			}
			else{
				if(FLAG == 1){
					setAnswer(answer, count_zero);
					FLAG = 2;
					
				}
				else if(FLAG == 2){
					if(count_zero%2 == 1){
						setAnswer(answer, (count_zero/2) + 1);
					}
					else if(count_zero%2 == 0){
						setAnswer(answer, count_zero/2);
					}
				}
				count_zero = 0;
			}
			
			if(i== arr.length-1){
				setAnswer(answer, count_zero);
			}
			
		}

		return answer;
	}
	public void setAnswer(int ans, int b){
		if(ans > b){
			answer = ans;
		}
		else 
			answer = b;
	}

}
