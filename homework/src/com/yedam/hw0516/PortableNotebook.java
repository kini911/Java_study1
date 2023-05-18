package com.yedam.hw0516;

public class PortableNotebook implements Notebook, Tablet{
	
	int mode;
	String docProgram;
	String internet;
	String videoType;
	String app;
	
	PortableNotebook(String docProgram,	String internet, String videoType, String app){
		this.docProgram = docProgram;
		this.internet = internet;
		this.videoType = videoType;
		this.app = app;
		this.mode = 1;
		System.out.println("NOTEBOOK_MODE");
	}
	
	
	
	@Override
	public void watchVideo() {
		System.out.println(videoType+"를 시청");
	}

	@Override
	public void useApp() {
		if(mode==1) {
			this.mode = 2;
		}
		System.out.println(app+"를 실행");
	}

	@Override
	public void writeDocumentaion() {
		System.out.println(docProgram+"을 통해 문서 작성");
	}

	@Override
	public void searchInternet() {
		System.out.println(internet+"를 통해 인터넷을 검색");
	}
	public void changeMode() {
		if(mode==1) {
			this.mode = 2;			
			System.out.println("TABLET_MODE");
		}else if(mode==2) {
			this.mode = 1;			
			System.out.println("NOTEBOOK_MODE");	
		}
	}

}
