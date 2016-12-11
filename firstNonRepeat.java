import java.io.*;
import java.util.*;
public class firstNonRepeat{
	public static void main(String[] args) {
		String str = "ADBCGHIEFKJLADTVDERFSWVGHQWCNOPENSMSJWIERTFB";
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		//convert string to char array
		char arr[] = str.toCharArray();
		for(Character ch:arr){
			if(map.containsKey(ch)){
				map.put(ch,map.get(ch)+1);
			}
			else
				map.put(ch,1);
		}
		for(Map.Entry m:map.entrySet()){
			if(m.getValue().equals(1)){
				System.out.println(m.getKey());
				break;
			}
		}
	}
}