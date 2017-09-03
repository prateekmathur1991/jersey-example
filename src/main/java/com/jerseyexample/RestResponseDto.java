package com.jerseyexample;

import java.io.Serializable;

public class RestResponseDto implements Serializable {

	private static final long serialVersionUID = -7957100558919319722L;
	
	private String token;
	
	private String refreshToken;
	
	public RestResponseDto() {
			
	}

	public RestResponseDto(String token, String refreshToken) {
		this.token = token;
		this.refreshToken = refreshToken;
	}

	public String getToken() {
		return token;
	}

	public String getRefreshToken() {
		return refreshToken;
	}
}