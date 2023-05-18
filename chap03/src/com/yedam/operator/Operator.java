package com.yedam.operator;

public class Operator {

	public static void main(String[] args) {
		//++num, num++
		int num = 0;
		System.out.println(num++);
		//실행문 시작후 증가(출력:0, 출력후 num=1)
		System.out.println(++num);
		//실행문 시작전 증가(출력전 num=1, 출력:num=1+1됨 (2가 출력))
		System.out.println(num--);
		
		System.out.println(--num);		
		
		//논리 부정 연산자 !
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		//비교 연산자
		//true or false
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		char char1 = 'A';	//A = 65
		char char2 = 'B';	//B = 66
		
		boolean result4 = (char1 < char2);
		System.out.println(result4);
		//true가 출력됨
		
		//논리 연산자
		char charCode = 'A';
		//A보다 같거나 크고 Z보다 같거나 작은 경우
		if(charCode >= 65 && charCode <=90) {
			System.out.println("대문자 입니다.");
		}
		
		if(charCode >= 97 && charCode <= 122) {
			System.out.println("소문자 입니다.");
		}
		
		//논리 부정 연산자 -> 말장난이야~(이산수학)(그래서 더 유심히 봐야함)**논리연산자는 안되는데 논리부정연산자에서는 가능한 부분도 있음
		if(!(charCode<65) && !(charCode>90)) {
			System.out.println("대문자 입니다~.");
		}
		
		//복합 대입 연산자
		int result = 0;
		
		result += 10; //result = result + 10;
		result -= 5; //result = result - 5;
		result *= 5; //result = result * 5;
		
		//삼항 연산자
		int score = 80;
		char grade;
		
		if(score >= 80) {
			grade = 'B';
		} else {
			grade = 'D';
		}
		//위의 표현과 아래의 표현은 같음
		grade = score >= 80 ? 'B' : 'D';
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
