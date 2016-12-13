import java.io.*;
import java.util.*;

public class stock2{
	public static void main(String[] args) {
		int arr[] = {100, 80, 120, 130, 70, 60, 100, 125};
		int currProfit = 0,totalProfit = 0;
		for(int i=1;i<arr.length;i++){
			currProfit = arr[i] -arr[i-1];
			if(currProfit>0){
				totalProfit += currProfit;
			}
		}
		System.out.println(totalProfit);
	}
}