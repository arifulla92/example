import java.util.HashMap;
import java.util.Map;

public class RepetedCount {

	public static void main(String[] args) {
		
		
String str="abcddeofahdlfjohfahsff";
		
		char [] ch=str.toCharArray();
		//String []array=str.split(" ,");
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(Character chr:ch)
		if(map.containsKey(chr))
		{
			map.put(chr, map.get(chr)+1);
		}
		else 
		{
			map.put(chr, 1);
		}
		
		System.out.println(map);
		
		
		
/*String str="a,b,c,d,d";
		
		//char [] ch=str.toCharArray();
		String[] array=str.split(" ,");
		
		//char [] ch=rray();
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		for(String chr:array)
		if(map.containsKey(chr))
		{
			map.put(chr, map.get(chr)+1);
		}
		else 
		{
			map.put(chr, 1);
		}
		
		System.out.println(map);*/
	
	}
	
	

}
