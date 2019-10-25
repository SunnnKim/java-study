package quest.assignment6.classes;

/**
주어진 Exam03 클래스를 실행했을 때 다음과 같은 결과가 
출력되도록 필요한 클래스와 인터페이스를 작성하세요.(단, Exam03는 수정하지 않으며 Animal 클래스의 cry() 메소드는 추상메소드로 작성합니다.)

[필요지식] 
- 상속 
- 인터페이스 
- 추상클래스 

[실행 결과] 
멍멍이: 먹습니다. 
멍멍이: 멍멍 짖습니다. 
꽥꽥이: 먹습니다. 
꽥꽥이: 꽥꽥웁니다. 
꽥꽥이: 날개를 퍼덕거리지만 날지 못합니다.
 */

interface i{
	public String eatTxt();
}



abstract class Animal implements i{
	public String name ="";
	
	public Animal(String name) {
		this.name = name;
		}
	
	public String eatTxt() {
		return ": 먹습니다.";
	}

	public abstract void cry();
		
//public abstract String fly();
	//public abstract String notFly();	//?
}

class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}
	
	public void eat(){
		System.out.println(name+ eatTxt());
	}

	public void cry(){
		System.out.println(name + ": 멍멍 짖습니다.");
	}
	
}

class Flyable extends Animal {
	
	public Flyable(String name) {
		super(name);
	}

	public void fly(){
		System.out.println(name+ ": 날개를 퍼덕거리지만 날지 못합니다.");
	}
	public void cry() {	
		System.out.println(name + ": 꽥꽥웁니다.");
	}
	public void eat(){
		System.out.println(name+ eatTxt());
	}	
}

class Duck extends Flyable{
	public Duck(String name) {
		super(name);
	}
	


	
	
}


public class Exam03 {

	
	   public static void main(String[] args) {
		   Dog dog = new Dog("멍멍이"); 
		   Duck duck = new Duck("꽥꽥이");
		   
		   dog.eat();
		   crying(dog);
		    
		   duck.eat(); 
		   crying(duck); 
		   flying(duck);
		   
	   }
		   
	   private static void crying(Animal a){
	      a.cry();
	   }
	   
	   private static void flying(Flyable f){
	      f.fly();
	   }
		
}

