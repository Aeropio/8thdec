import java.util.*;

public class nextHighest{
	public static void main(String[] args) {
		int num = 1234;
		int next = getNextHighest(num);
		System.out.println("  "+next);
	}
	// public static void swap(int a,int b){
	// 	int temp = a;
	// 	a = b;
	// 	b = temp;
	// }
	public static int getNextHighest(int num){
		String n = Integer.toString(num);
		String str[] = n.split("");
		int arr[] = new int[str.length];
		int j=0;
		for(String s:str){
			arr[j++] = Integer.parseInt(s);
		}

		int highIndex = arr.length-1;
		int index = highIndex-1;
		while(index>=0&&arr[index+1]<arr[index]){
			index--;
		}
		if(index==-1){
			System.out.println(num);
			System.exit(0);
		}
		
		//sort all elements to right of startindex
		for(int i=index+1;i<arr.length-1;i++){
			for(int k = i+1;k<arr.length;k++){
				if(arr[k]<arr[i]){
					//swap
					//swap(arr[k],arr[i]);
					int temp = arr[k];
					arr[k] = arr[i];
					arr[i] = temp;
					
				}
			}
		}
		//find first elemnt greater than arr[index] to the right of index
		//int startindex = index;
		int index1 = index;
		int ele = arr[index];
		while(index<=highIndex&&arr[index]<=ele){
			index++;
		}
		int index2 = index;
		//swap 
		int tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
		

		for(int i:arr){
			System.out.print(i);
		}
		return 0;


		
	}
}