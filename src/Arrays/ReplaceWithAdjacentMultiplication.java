package Arrays;

public class ReplaceWithAdjacentMultiplication {
	
	public static void main(String[] args) {
		int[] arr= {2,4,5};
		updateArray(arr);
		for(int el : arr) {
			System.out.print(el + " ");
		}
	}
	public static int[] updateArray(int[] arr) {
        
        for(int i=0; i<arr.length; i++){
            if(i==0){
                arr[i]=arr[i]*arr[i+1];
            }else if(i==arr.length-1){
                arr[i]=arr[i-1]*arr[i];
            }else{
                arr[i] = arr[i-1] * arr[i] * arr[i+1];
            }
        }
        return arr;
    }
}
