import java.io.*;
import java.util.*;


public class DupArray{
	public static void main(String[] args) {
		int arr[] = {2, 4, 1, 2, 6, 1, 6, 3, 0};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i:arr){
			if(map.containsKey(i)){
				map.put(i,map.get(i)+1);
			}
			else
			map.put(i,1);
		}
		// for(Map.Entry m:map.entrySet()){
		// 	System.out.println(m.getkey()+" "+m.getValue());
		// }
		for(Map.Entry m:map.entrySet()){
			//System.out.println(m.getKey()+" "+m.getValue());
			if(!m.getValue().equals(1)){
				System.out.print(m.getKey()+" ");
			}
		}
	}
}