package algorithm.programmers.bfsdfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 두 개의 단어 begin, target과 단어의 집합 words가 있습니다. 
 아래와 같은 규칙을 이용하여 begin에서 target으로 변환하는 가장 짧은 변환 과정을 찾으려고 합니다.

1. 한 번에 한 개의 알파벳만 바꿀 수 있습니다.
2. words에 있는 단어로만 변환할 수 있습니다.
예를 들어 begin이 hit, target가 cog, words가 
[hot,dot,dog,lot,log,cog]라면 hit -> hot -> dot -> dog -> cog와 같이 
4단계를 거쳐 변환할 수 있습니다.

두 개의 단어 begin, target과 단어의 집합 words가 매개변수로 주어질 때, 
최소 몇 단계의 과정을 거쳐 begin을 target으로 변환할 수 있는지 return 하도록 solution 함수를 작성해주세요.

제한사항
각 단어는 알파벳 소문자로만 이루어져 있습니다.
각 단어의 길이는 3 이상 10 이하이며 모든 단어의 길이는 같습니다.
words에는 3개 이상 50개 이하의 단어가 있으며 중복되는 단어는 없습니다.
begin과 target은 같지 않습니다.
변환할 수 없는 경우에는 0를 return 합니다.
입출력 예
begin	target	words	return
hit	cog	[hot, dot, dog, lot, log, cog]	4
hit	cog	[hot, dot, dog, lot, log]	0
입출력 예 설명
예제 #1
문제에 나온 예와 같습니다.

예제 #2
target인 cog는 words 안에 없기 때문에 변환할 수 없습니다.
 */
public class ChangeWord {
	 public static void main(String[] args) {
		 
		 String[] words = { "hot", "dot", "dog", "lot", "log", "cog" };
		 String begin = "hit";
		 String target = "cog";
		 SolutionBFS s = new SolutionBFS(words, begin, target);
		 int answer = s.solution();
		 System.out.println(answer);
		 // System.out.println(s.solution(begin, target, words));
		 
	 }
	 
	 
    
}
// 큐로풀기??



// 답 

class SolutionBFS {
	String[] word;
	String begin;
	String target;
	int count;
	int matchingCount;
	
	public SolutionBFS(String[] word, String begin, String target) {
		count = 0;
		matchingCount = 0;
		this.word = word;
		this.begin = begin;
		this.target = target;
		
	}
	public int solution() {
		
		for (int i = 0; i < word.length; i++) {
			begin = getWord(i);
		}
		// 마지막은 따로 
		if(!begin.equals(target)) {
			count = -1;
		}
		return count;
		
	}
	
	public String getWord(int n) {
		String result = begin;
		int numCount = 0;
		int targetCount = 0;
		
		if(matchingCount == target.length()-1 ) {
			if(word[n].equals(target)) {
				count++;
				result = word[n];
			}
		}
		else {
			// 타겟과 시작점이랑 글자수 매칭되는 개수 
			for (int i = 0; i < target.length(); i++) {
				char c = target.charAt(i);
				char t = begin.charAt(i);
				if(c == t) targetCount++; 
			}
			if(matchingCount < targetCount) matchingCount = targetCount;
			
			// 시작단어랑 다음 단어랑 매칭되지 않는 개수 
			for (int i = 0; i < 3; i++) {
				char c = word[n].charAt(i);
				char t = begin.charAt(i);
				if(c != t) numCount++; 
			}
			
			if( numCount >= matchingCount && numCount == 1) {
				result = word[n];
				this.count++;
			}
		}
			return result;
		}
}


