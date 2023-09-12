package com.jikim.ch02.model;

import com.jikim.ch02.validation.Password;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User {
	private String userName;

	@Password
	private String password;

	@Override
	public String toString() {
		return "User{" +
			"userName='" + userName + '\'' +
			", password='" + password + '\'' +
			'}';
	}
}
