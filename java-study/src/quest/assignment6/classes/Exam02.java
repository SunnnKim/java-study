package quest.assignment6.classes;
/**

연습과제 
작성 패키지 : exam 
작성 클래스명 : Test01.java 조건 : - 메인 메소드를 구현합니다. 메인 메소드의 역할은 아래와 같습니다. 
- 면적을 구할 도형의 종류를 표현할 랜덤한 숫자를 생성합니다.(1 ~ 4) 
예> 1-정사각형, 2-직사각형, 3-삼각형, 4-원 
- 생성된 숫자에 따라서 
1, 4번일 경우는 도형의 면적을 구할 랜덤 숫자를 1개 생성합니다. 
2, 3번일 경우는 도형의 면적을 구할 랜덤 숫자를 2개 생성합니다. 
- 면적을 구할 랜덤 숫자까지 생성되었다면 각각의 도형의 면적을 구하는 클래스를 호출합 
니다. 
- 출력결과는 아래와 같이 출력됩니다. 
정사각형일 경우 : 정사각형의 면적은 9 입니다 
직사각형일 경우 : 직사각형의 면적은 12 
입니다 
삼각형일 경우 : 삼각형의 면적은 6 입니다 
원일 경우 : 원의 면적은 6 입니다 
- 도형의 면적을 출력하는 부분은 도형의 area() 메서드에서 처리합니다. 
추상클래스 작성 
클래스명 : Shape 
조건 : 
- public void area( ) 메소드 선언 : 추상메서드로 선언 
일반클래스 작성 
작성 클래스명 : Rectangle (직사각형), Triangle (삼각형), Circle (원) 
조건 : 
- Shape 클래스를 상속 
- 필요한 값들은 자유롭게 구현 
작성 클래스명 : Square(정사각형) 
조건 : 
- Rectangle 클래스를 상속 
- 필요한 값들은 자유롭게 구현 

 */
import java.util.Random;

public class Exam02 {
	public static void main(String[] args) {
		
		Random r = new Random();
		int option = r.nextInt(4)+1;
		int length1 =0, length2 = 0;
		
		System.out.println("*****  도형 면적구하기 *****");
		System.out.println("1-정사각형, 2-직사각형, 3-삼각형, 4-원 : " + option);
		
		if(option == 1 || option == 4) { // 1이나 4일 경우 랜덤숫자 1개
			length1 = r.nextInt(4)+1;
			
			//도형 면적구하는 메소드 호출;
			//1-정사각형, 2-직사각형, 3-삼각형, 4-원 
			System.out.println("길이 : " + length1);
			
			if(option == 1) {
				Square s1 = new Square(length1, length2);
				s1.area();
			}else {
				Circle c1 = new Circle(length1);
				c1.area();	
			}
			
			
			
		}
		else { // 2나 3일 경우 서로다른 랜덤숫자 2개
			length1 = r.nextInt(4)+1;
			length2= length1;
			while(length1 == length2) length2 = r.nextInt(4)+1;
		
			System.out.println("길이 : " + length1 +" , " + length2);
			//도형 면적구하는 메소드 호출;
			//1-정사각형, 2-직사각형, 3-삼각형, 4-원 
			if(option == 2) {
				Ractangle r1 = new Ractangle(length1, length2);
				r1.area();
			}else {
				Triangle t1 = new Triangle(length1, length2);
				t1.area();	
			}
		}
		
		
	
	}

}
abstract class Shape{
	int length1=0;
	int length2=0;
	int area;
	
	
	public abstract void area();
	
	public Shape(int a, int b) {
		this.length1 = a;
		this.length2 = b;	
		
		}
	public Shape(int a) {
		this.length1 = a;

		
		}
	
	
}

class Ractangle extends Shape{
	public Ractangle(int a, int b) {
		super(a, b);
	}
	
	
	public void area() {
		area = length1 * length2;
		System.out.println("직사각형의 면적은 " +  area +" 입니다.");
		
	}
}



class Triangle extends Shape{


	public Triangle(int a,int b) {
		super(a,b);
	}

	public void area() {
		area = length1 * length2;
		System.out.println("삼각형의 면적은 " +  area +" 입니다.");
		
		
	}

}
class Circle extends Shape{
	

	public Circle(int a) {
		super(a);
		}

	public void area() {
		
		area = length1 * length1;
		System.out.println("원의 면적은 " +  area +" π 입니다.");
		
	}

}

class Square extends Ractangle {
	public Square(int a, int b) {
		super(a, b);
	}

	public void area() {
		area = length1 * length1;
		System.out.println("정사각형의 면적은 " +  area +" 입니다.");

	}

}

