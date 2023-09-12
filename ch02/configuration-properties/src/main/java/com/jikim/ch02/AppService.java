package com.jikim.ch02;

import org.springframework.stereotype.Service;

import com.jikim.ch02.configurationproperties.AppProperties;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Getter
public class AppService {

	private final AppProperties appProperties;
}
