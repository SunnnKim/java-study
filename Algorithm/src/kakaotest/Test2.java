package kakaotest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test2 {

	

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		Game game = new Game();

		

		int numberOfPlayers = Integer.parseInt(input);

		for (int i = 0; i < numberOfPlayers * (numberOfPlayers -1 ) ; i++) {

			 game.getplayerInfo(br.readLine());	

		}

		game.getRank();

	}



}

class Game{

	

	Map<String, Integer[]> player = new HashMap<String, Integer[]>();

	Object obj[][];

	

	public void getplayerInfo(String str) {

		String player1 = "";

		String player2 = "";

		int score1 = 0;

		int score2 = 0;

		Integer[] info1 = new Integer[5];	//

		Integer[] info2 = new Integer[5];	//

		// 초기화

		for (int i = 0; i < info1.length; i++) {

			info1[i] = 0;

			info2[i] = 0;

		}

		player1 = str.split(" ")[0];

		player2 = str.split(" ")[2];

		score1 = Integer.parseInt(str.split(" ")[1]);

		score2 = Integer.parseInt(str.split(" ")[3]);

		

		if(player.containsKey(player1)) { // 플레이어1이 있는경우

			

			info1 = player.get(player1);

			if( score1 - score2 > 0 ) {	// player1 win

				info1[0]++;	// 승

				info1[2] += score1; // 승리세트 수

				info1[3] += score2;	// 진 횟수 

			}else {	// player1 lost

				info1[1]++;	// 패

				info1[2] += score1; // 승리세트 수

				info1[3] += score2;	// 진 횟수 

			}

			player.replace(player1, info1);

			

		}else {// 플레이어1가 없는 경우

			if( score1 - score2 > 0 ) {	// player1 win

				info1[0]++;	// 승

				info1[2] = score1; // 승리세트 수

				info1[3] = score2;	// 진 횟수 

			}else {	// player1 lost

				info1[1]++;	// 패

				info1[2] = score1; // 승리세트 수

				info1[3] = score2;	// 진 횟수 

			}

			player.put(player1, info1);

		}

		

		// player2

		if(player.containsKey(player2)) { // 플레이어2이 있는경우

			

			info2 = player.get(player2);

			if( score2 - score1 > 0 ) {	// player2 win

				info2[0]++;	// 승

				info2[2] += score2; // 승리세트 수

				info2[3] += score1;	// 진 횟수 

			}else {	// player2 lost

				info2[1]++;	// 패

				info2[2] += score2; // 승리세트 수

				info2[3] += score1;	// 진 횟수 

			}

			player.replace(player2, info2);

		}else {// 플레이어1가 없는 경우

			if( score2 - score1 > 0 ) {	// player2 win

				info2[0]++;	// 승

				info2[2] = score2; // 승리세트 수

				info2[3] = score1;	// 진 횟수 

			}else {	// player1 lost

				info2[1]++;	// 패

				info2[2] = score2; // 승리세트 수

				info2[3] = score1;	// 진 횟수 

			}

			player.put(player2, info2);

		}

	}

	

	public void getRank() {

		Iterator<String> i = player.keySet().iterator();

		this.obj = new Object[player.size()][3];

		int n = 0;

		while(i.hasNext()) {

			String key = i.next();

			Integer[] info = player.get(key);

			System.out.println("key : " + key + " : " +  Arrays.toString(info));

			// 정렬

			this.obj[n][0] = key;

			this.obj[n][1] = info[0]; // 승수

			this.obj[n][2] = info[2] - info[3];

			System.out.println(Arrays.toString(obj[n]));

			n++;

		}

		Object[] temp = new Object[3];

		

		for (int j = 0; j < obj.length - 1; j++) {

			for (int k = j + 1; k < obj.length; k++) {

				

				if( (Integer)obj[j][1] < (Integer)obj[k][1] ) {

					temp = obj[j];

					obj[j] = obj[k];

					obj[k] = temp;

				}

				//승리횟수같을경우 

				else if( (Integer)obj[j][1] == (Integer)obj[k][1]  ) {

					if((Integer)obj[j][2] < (Integer)obj[k][2]) {

						temp = obj[j];

						obj[j] = obj[k];

						obj[k] = temp;

					}else if((Integer)obj[j][2] == (Integer)obj[k][2])  {

						// 알파벳순으로 정렬

						int m = 0;

						char[] c1 = ((String)obj[j][0]).toCharArray();

						char[] c2 = ((String)obj[k][0]).toCharArray();

						do{

							if(c1[m]<c2[m]) {

								temp = obj[j];

								obj[j] = obj[k];

								obj[k] = temp;

								break;

							}else if(c1[m]>c2[m]) {

								break;

							}

							m++;

						}while(c1[m] != c2[m]);

					}

				}

			}

			

		}

		

		// print

		for (int j = 0; j < obj.length; j++) {

			System.out.println(obj[j][0] + " " + obj[j][1] + " " + obj[j][2]);

		}

		

	}

}