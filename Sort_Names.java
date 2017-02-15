import java.util.*;

public class Sort_Names {
	
	public static int return_value(char ch, HashMap map){
		if (map.containsKey(ch)){
			return (int) map.get(ch);
		}
		else
			return 0;
	}
	
	public static int Symbol_Value(String roman, HashMap map){
		int value = 0;
		for (int  i = 0 ; i<roman.length()-1; i++){
			if(return_value(roman.charAt(i),map) < return_value(roman.charAt(i+1), map)){
				value = value - return_value(roman.charAt(i),map);
			}
			else
				value = value + return_value(roman.charAt(i),map);
		}
		value += return_value(roman.charAt(roman.length()-1),map);
		return value;
	}
	
	
	
public static void main(String args[]){
	
	//create a hashmap:
HashMap romans = new HashMap();
	
	romans.put('I', 1);
	romans.put('V', 5);
	romans.put('X', 10);
	romans.put('L', 50);
	
	//String[] str1 = {"Louis IX","Louis VIII"};
	String[] str = {"Louis IX","Philippe II"};
	TreeMap output = new TreeMap();
	//split string into name and numerals:
	for (int i  = 0; i< str.length; i++){
		String[] splits = str[i].split(" ");
		int val = Symbol_Value(splits[1], romans);
		//System.out.println (val);
		output.put(splits[0].concat(" ").concat(Integer.toString(val)),str[i]);
	}
	
	String[] out1 = (String[]) output.values().toArray(new String[0]);

	
	for(int k =0; k<out.length;k++)
		System.out.println(out[k]);
	
}
	
	
}
