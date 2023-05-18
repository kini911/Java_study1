package com.yedam.collection;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		//벡터리스트생성
		List<Board> vector = new Vector<>();
		//객체담는방법
		Board board = new Board("제목1","내용1","글쓴이1");
		vector.add(board);
		
		vector.add(new Board("제목2","내용2","글쓴이2"));
		vector.add(new Board("제목3","내용3","글쓴이3"));
		vector.add(new Board("제목4","내용4","글쓴이4"));
		vector.add(new Board("제목5","내용5","글쓴이5"));
		//일반 for문으로 벡터리스트 안의 객체가 가진 필드 확인
		//변수에 담은 방식
		for(int i = 0; i<vector.size();i++) {
			Board board2 = vector.get(i);
			System.out.println(board2.subject+"\t"+board2.content+"\t"+board2.writer);
		}
		System.out.println("==============");
		//바로 보여주는 방식
		for(int i = 0; i<vector.size();i++) {
			Board board2 = vector.get(i);
			System.out.println(vector.get(i).subject+"\t"+vector.get(i).content+"\t"+vector.get(i).writer);
		}
		System.out.println("==============");
		//벡터리스트 객체 삭제
		vector.remove(2);
		//향상된 for문 활용
		for(Board board2 : vector) {
			System.out.println(board2.subject+"\t"+board2.content+"\t"+board2.writer);
		}
		
		
		
	}
}
