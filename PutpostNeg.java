import java.util.*;

public class PutpostNeg{
	public void reArrangePosNeg(int arr[]){
		for(int i=0;i<arr.length;i++){
			if(notAtRightPosition(arr,i)){
				//find next opposite signed element
				int nextOppindex = getNextOpposite(arr,i);
				if(nextOppindex != -1){
					leftShift(arr,i,nextOppindex);
				}
				else{
					//no more elemnt found with opp sign
					break;
				}
			}
		}
	}
		private boolean notAtRightPosition(int arr[],int i){
			
				if(i%2==0){
					//even indexes must contain positiv 
					if(arr[i]>0){
						return false;
					}
					else
						return true;
				}
				else{
					if(arr[i]<0)
						return false;
					else
						return true;
				}
			
			//return false;
		}
		private  int getNextOpposite(int arr[],int i){
			for(int index=i+1;index<arr.length;index++){
				if(arr[i]*arr[index]<0){
					return index;
				}
			}
			return -1;
		}
		private void leftShift(int arr[],int start,int end){
			int last = arr[end];
			for(int i=end;i>start;i--){
				arr[i] = arr[i-1];
			}
			arr[start] = last;
		}
	
	public static void main(String[] args) {
		PutpostNeg obj = new PutpostNeg();
		int arr[] = {-1,3,2,4,5,-6,7,-9};
		//put pos in even places and negative in odd places
		obj.reArrangePosNeg(arr);
		for(int i:arr){
			System.out.print(i+" ");
		}


	}
}