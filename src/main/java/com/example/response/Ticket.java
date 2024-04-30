package com.example.response;

import lombok.Data;

@Data
public class Ticket {
	
	private String name;
	private String from;
	private String to;
	private String trainNum;
	private String journeyDate;
	private String price;
	private String trainStatus;

}
