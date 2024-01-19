import java.util.*;

public class Sample{

	public static void partition(int[] arr,int start, int end){
	
		int pivot = end;
		
		while(start < end){

		System.out.println();
		for(int i=0;i<arr.length; i++){
			System.out.print("  "+arr[i]);
		}
	
			
			if(pivot == start){
				if(arr[pivot] > arr[end]){
					int temp = arr[pivot];
					arr[pivot] = arr[end];
					arr[end] = temp;
					pivot = start;
				} else {
					end--;
				}
			} else {
				
				if(arr[pivot] < arr[start]){
					int temp = arr[pivot];
					arr[pivot] = arr[start];
					arr[start] = temp;
					pivot = end;					
				} else {
					start++;
				}
			
			}
		
		}
		System.out.println();
		for(int i=0;i<arr.length; i++){
			System.out.print("  "+arr[i]);
		}
	}

	public static void main(String[] args){
		
		int[] arr = {40,10,50,30,20,70,5,6,8};
		partition(arr,0,arr.length-1);
		
	}



}



