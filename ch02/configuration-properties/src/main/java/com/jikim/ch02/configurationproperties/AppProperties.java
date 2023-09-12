package com.jikim.ch02.configurationproperties;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@ConstructorBinding
@ConfigurationProperties("app.jikim.ct")
@RequiredArgsConstructor
@Getter
public class AppProperties {

	private final String name;
	private final String ip;
	private final int port;
	private final Security security;

	@Override
	public String toString() {
		return "AppProperties{" +
			"name='" + name + '\'' +
			", ip='" + ip + '\'' +
			", port=" + port +
			", security=" + security +
			'}';
	}

	@Getter
	@AllArgsConstructor
	public static class Security {
		private boolean enabled;
		private final String token;
		private final List<String> roles;

		@Override
		public String toString() {
			return "Security{" +
				"enabled=" + enabled +
				", token='" + token + '\'' +
				", roles=" + roles +
				'}';
		}
	}
}