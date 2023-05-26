package com.yedam.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
	
//	PRO_ID        NOT NULL NUMBER         
//	MEMBER_ID     NOT NULL VARCHAR2(20)   
//	PRO_NAME      NOT NULL VARCHAR2(20)   
//	PRO_PRICE              NUMBER         
//	PRO_EXPLAIN            VARCHAR2(1000) 
	
	private int proId;
	private String memberId;
	private String proName;
	private int proPrice;
	private String proExplain;
	private double reviewAvg;
	
	
}
