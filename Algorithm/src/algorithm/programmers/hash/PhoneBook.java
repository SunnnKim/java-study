package algorithm.programmers.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PhoneBook {

	public static void main(String[] args) {
		String[] s = {"11", "0011", "0011"};
		Phone p = new Phone();
		p.getMapData(s);
		boolean b = p.check(s);
		System.out.println(b);
	}
}
class Phone{
	Map<String,Integer> map = new HashMap<String,Integer>();
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        return answer;
    }
    public void getMapData(String[] str){
        for(int i = 0; i < str.length; i++){
            map.put(str[i], i);
        }
    }
    public boolean check(String[] str){
    	boolean b = true;
        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext()){
            String key = it.next();
           for(int i = 0; i < str.length; i++) {
        	   if(key.length() > str[i].length()) continue;
        	   String temp = str[i].substring(0,key.length());
        	   if(temp.equals(key) && map.get(key)!= i) {
        		   return false;
        	   }
           }
        
        }
        return b;
    }
}
