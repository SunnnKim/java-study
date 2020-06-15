package algorithm.programmers.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Spy {
	public static void main(String[] args) {
		String[][] str = {
				{"yellow_hat","headgear"},
				{"blue_sunglasses","eyeware"},
				{"green_turban","headgear"}
		};
		Clothes c = new Clothes(str);
	}
}
class Clothes{
	
	Map<String, String> map;
	
	public Clothes(String[][] str) {
		map = new HashMap<String, String>();
		for (int i = 0; i < str.length; i++) {
			map.put(str[i][0], str[i][1]);
		}
	}
	
	
	
	
}
