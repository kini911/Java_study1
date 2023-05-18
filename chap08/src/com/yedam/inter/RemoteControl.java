package com.yedam.inter;

public interface RemoteControl extends Searchable{
	//인터페이스는 상수와 추상메소드가 있어야함!!!!!
	
	//상수 =>static final 생략가능
	public int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	//추상 메소드 =>abstract 생략가능
	public void turnOn();
	public abstract void turnOff();
	public void setVolume(int volume);

//	void search(String url);
	//searchable을 상속 받았기 때문에 이 메소드가 생략되어있다고 생각하면 됨
}
