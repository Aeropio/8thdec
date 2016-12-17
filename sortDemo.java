import java.util.*;
public class sortDemo{
	public static void main(String[] args) {
		int arr[] = {4,5,5,4,5,4,7,6,7,7};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
			for(int i:arr){
				map.put(i,0);
			}
			for(int i :arr)
			{
				for(Map.Entry <Integer,Integer> m:map.entrySet()){
					//System.out.println(m.getKey()+m.getValue());
					if(m.getKey()==i){
						map.put(i,m.getValue()+1);
					}
				}
			}
			for(Map.Entry<Integer,Integer> m:map.entrySet()){
				if(m.getValue()==1){
					System.out.println(m.getKey());
				}
			}
		
		}
}
