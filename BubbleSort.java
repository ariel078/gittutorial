
public class BubbleSort {
	public static void main(String[] args){
		int[] nums = new int[]{5,90,35,45,150,3};
		bubbleSort(nums);
		for(int i = 0; i<nums.length;i++){
			System.out.print(nums[i] + ", ");
		}
	}
	
	public static void bubbleSort(int[] inputArray){
		
		for(int i = 0; i<inputArray.length;i++){
			for(int j = 1; j<inputArray.length - i; j++){
				
				if(inputArray[j-1] > inputArray[j]){
					int temp = inputArray[j-1];
					inputArray[j-1] = inputArray[j];
					inputArray[j] = temp; 
				}
			}
		}	
	}
}
