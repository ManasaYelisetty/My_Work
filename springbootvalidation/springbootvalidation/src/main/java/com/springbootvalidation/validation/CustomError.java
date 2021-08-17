package com.springbootvalidation.validation;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")

public class CustomError {

		private LocalDateTime timestamp;
		private String message;
		private String details;
		public CustomError() {
			super();
		}
		
		public CustomError(LocalDateTime timestamp, String message, String details) {
			super();
			this.timestamp = timestamp;
			this.message = message;
			this.details = details;
		}

		public LocalDateTime getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(LocalDateTime timestamp) {
			this.timestamp = timestamp;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getDetails() {
			return details;
		}
		public void setDetails(String details) {
			this.details = details;
		}
		
}
