package com.foodapp.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {
	
	private LocalDateTime localDateTime;
	
	private String message;
	
	private String details;
	
	
}
