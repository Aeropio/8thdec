import java.io.*;
import java.util.*;

public class missingElement{
	public static void main(String[] args) {
		int arr[] = {1,2,4,5,6,7,8};
		int len = arr.length-1;
		int i = len-1;
		while(i>=0&&arr[i+1]-arr[i]==1){
			//continue
			i--;
		}
		System.out.println(i);
	}
}