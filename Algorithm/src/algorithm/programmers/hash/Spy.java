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
	
	Map<String, Integer> map;
	
	public Clothes(String[][] str) {
		map = new HashMap<String, Integer>();
		for(int i = 0; i < str.length; i++ ) {
			if( map.containsKey(str[i][1])) {
				map.put(str[i][1], map.get(str[i][1])+1);
			}else {
				map.put(str[i][1], 2);
			}
		}
	}
	public int solution() {
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			
		}
		return 0;
	}
}
