package com.jikim.ch04.indicator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class FatalHealthIndicator implements HealthIndicator {
	@Override
	public Health health() {
		return Health.status("FATAL").build();
	}
}
