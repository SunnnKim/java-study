package quest.assignment7.queue;

import java.util.Arrays;

// 배열을 이용해서 큐 클래스 만들기 
public class QueueArray {
	
	private Object data[] = null;
	private Object head;
	private Object tail;
	private int headIndex;	// 첫 데이터 위치 
	private int index;	// 현재 데이터 넣은 위치 
	private int nextIndex;	// 다음 데이터 넣을 위치 
	private int dataSize = 0;
	
	public QueueArray(int arraySize) {
		this.data = new Object[arraySize];
		index = -1;
		headIndex=-1;
		nextIndex=headIndex+1;
	}
	
	public boolean add(Object data) {
		// if문
		// 1. 헤드값 - 테일값 <= 0 -> 순차적으로 데이터를 집어넣는다.
		// 2. 헤드값 - 테일값 > 0 -> 맨 끝 데이터가 꽉차서 앞쪽 빈공간으로 넣는다
		// 3. 테일값이 마지막 인덱스다 -> 배열이 꽉 참.
//		if(head ==0 && tail ==0) {	//처음 들어가는 값 일때 
//		}
		// 배열에 넣을 공간이 있는 지 확인 
		if( dataSize == this.data.length) {	
			return false;
		}
		
		index++;
		this.data[index] = data;
		nextIndex = index+1;
		tail = this.data[index];
		dataSize++;
		
		if(headIndex == -1) { // 첫 데이터 일때 헤드 / 테일 지정 
			head = this.data[0];
			headIndex = index;
		}
		//데이터가 다 차지 않았는데 테일이 마지막 배열에 있으면 ?
		if(nextIndex == this.data.length) {
			index = -1;
			tail = this.data[0];
		
		}
		return true;
		
	}
	public int getDataSize() {
		return dataSize;
	}
	// 처음 넣은 데이터부터 꺼내기 (꺼내서 삭제됨)
	public Object getData() {
		if(dataSize == 0) {
			return null;
		}
		Object returnData = this.data[headIndex];
		this.data[headIndex] =  null;
		headIndex++;
		dataSize--;
		if(headIndex == data.length ) {	// 데이터가 남았는데 헤드값을 모두 썼을 때
			headIndex = 0;
		}
		if(dataSize == 0) {	// 모두 꺼냈을 때
			index =-1;
			headIndex = -1;
		}
		return returnData;
	}
	
	
	
	
	
	public String printArr() {
		String printMsg;
		printMsg = "현재 데이터 : "+Arrays.toString(this.data);
		
		return printMsg;
	}
	
	
	
	
}



