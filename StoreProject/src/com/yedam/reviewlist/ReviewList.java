package com.yedam.reviewlist;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ReviewList {
//	REVIEW_NUM   NOT NULL NUMBER        
//	PRO_ID                NUMBER        
//	MEMBER_ID             VARCHAR2(20)  
//	MEMBER_SCORE          NUMBER        
//	PRO_REVIEW            VARCHAR2(200) 
	
	private int reviewNum;
	private int proId;
	private String memberId;
	private int memberScore;
	private String proReview;
	
	private String proName;
	private int proPrice;
	private String sellerId;
	
}
