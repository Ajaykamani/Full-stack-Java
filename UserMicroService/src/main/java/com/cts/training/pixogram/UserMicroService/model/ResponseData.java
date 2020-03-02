package com.cts.training.pixogram.UserMicroService.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseData {
	private String message;
	private Long timeStamp;
	private Integer id;
	
	
	

	public ResponseData(String message, long timeStamp, Integer id) {
		
		this.message = message;
		this.timeStamp = timeStamp;
		this.id=id;
		
		// TODO Auto-generated constructor stub
	}




	public ResponseData(String message, long timeStamp) {
		this.message = message;
		this.timeStamp = timeStamp;
		
		// TODO Auto-generated constructor stub
	}
	
}
