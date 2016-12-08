

public class sortedMatricSearch{
	public static void main(String[] args) {
		//int arr[][] = new int[2][2];
		int[][] arr = new int[2][2];
		int rows=2,cols=2;
		int startElem = 1;
		//System.out.println("yyyyyyyyyy");
		for(int i=0;i<rows;i++){
			//System.out.println("jiiii");
			for(int j=0;j<cols;j++){
				arr[i][j] = startElem++;
			}
		}
		//searching for element 3
		//search the row in which the element is present
		int numSearch = 897;
		int rowStart = 0;
		while(rowStart<rows&&numSearch>arr[rowStart][cols-1]){
			rowStart++;
		}
		if(rowStart<rows){
			
			System.out.println("row number is  "+rowStart);
			//print all elements in that row
			
			int rowContaingElem = rowStart;
			int array[] = new int[cols];
			int index = 0;
			for(int i=0;i<cols&&index<cols;i++){
				
				array[index++] = arr[rowContaingElem][i];

			}
			int colNumber = binarySearch(array,numSearch);
			if(colNumber==-1){
				System.out.println("no elent found");
			}
			System.out.println(colNumber+" is col num");
		}
		else{
			System.out.println("element not found");
		}

	}
	public static int binarySearch(int array[],int num){
		int start = 0,end = array.length-1,mid = 0;
		mid = (start+end)/2;
		while(start<=end){
			if(array[mid]==num){
				return mid;
			}
			else if(num>array[mid]){
				start = mid+1;
			}
			else{
				end = mid-1;
			}
		}
		return -1;
	}
}