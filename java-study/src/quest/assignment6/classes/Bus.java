package quest.assignment6.classes;

public class Bus {

		
		int busNum =0;
		int people=0;
		int sum=0;
		
		public Bus(int busNum) { //생성
			this.busNum = busNum;
			System.out.println(busNum + "번 버스 운행시작.");
		}
		
		 void ride() {
			this.people ++;
			this.sum++;
			System.out.println("승객 1명 승차.");
		}
		
		void ride(int ridePeople) {
			this.people += ridePeople;
			this.sum+= ridePeople;
			System.out.println("승객 "+ ridePeople +"명 승차.");
		}
		
		 void leave() {
			this.people --;
			System.out.println("승객 1명 하차.");
		}
		
		 void leave(int leftPeople) {
			this.people -= leftPeople;
			System.out.println("승객 "+ leftPeople +"명 하차.");
		}

		public String toString() {
		
			String str = busNum + "번 버스의 현재 승차인원: " + people + "명.\n모든 버스의 누적 승차인원: "+sum +"명.";
			return str;
				
		}
		}
		