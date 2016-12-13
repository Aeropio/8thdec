import java.io.*;
import java.util.*;

public class countFreq{
	public static void main(String[] args) {
		int arr[] = {2, 3, 3, 2, 5};
		int size = arr.length;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		//populate keys from 1 to n
		for(int i=1;i<=size;i++){
			map.put(i,0);
		}
		// for(Map.Entry<Integer,Integer> m:map.entrySet()){
		// 	System.out.println(m.getKey()+" "+m.getValue());
		// }
		for(int i:arr){
			for(Map.Entry<Integer,Integer> m:map.entrySet()){
				if(m.getKey()==i){
					map.put(i,m.getValue()+1);

				}
				//System.out.println(m.getKey()+" "+m.getValue());
			}
		}
		for(Map.Entry<Integer,Integer> m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}