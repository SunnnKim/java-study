package polarisTest;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {

		Solution s = new Solution();

		String str = "abac";

		ArrayList<String> list = s.getList(str);

		System.out.println(s.getNumber(list));

		System.out.println(list);

	}

}

class Solution {

 

    public int solution(String s) {

        int answer = 0;

        return answer;

    }

    public ArrayList<String> getList(String str){

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < str.length(); i++) {

        	if( !list.contains(str.charAt(i)+"")) {

        		list.add(str.charAt(i)+"");

        	}

        }

        for(int i = 2; i < str.length() + 1; i++ ) {

        	for (int j = 0; j < str.length() - i + 1; j++) {

				String temp = str.substring(j, j+i);

				if(!list.contains(temp)) {

					list.add(temp);

				}

			}

        }

        

        return list;

    }

    

    public int getNumber(ArrayList<String> list) {

    	int count = 0;

    	for (int i = 0; i < list.size(); i++) {

			String str = list.get(i);

			boolean check = false;

			for (int j = 0; j < str.length() - 1; j++) {

				for(int k= j + 1; k< str.length(); k++) {

					if(str.charAt(j) == str.charAt(k)) {

						check = true;

						break;

						

					}

				}

			}

			if(!check) count ++;

    		

		}

    	return count;

    }

}
