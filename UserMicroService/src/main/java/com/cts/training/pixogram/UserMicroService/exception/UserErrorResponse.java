package com.cts.training.pixogram.UserMicroService.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserErrorResponse {

	private String message;
	private Integer errorCode;
	private Long timeStamp;
		
	
}
