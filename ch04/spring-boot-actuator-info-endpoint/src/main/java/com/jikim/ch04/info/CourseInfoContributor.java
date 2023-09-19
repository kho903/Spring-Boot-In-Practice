package com.jikim.ch04.info;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import com.jikim.ch04.model.Course;
import com.jikim.ch04.service.CourseService;

import lombok.Builder;
import lombok.Data;

@Component
public class CourseInfoContributor implements InfoContributor {

	private CourseService courseService;

	@Autowired
	public CourseInfoContributor(CourseService courseService) {
		this.courseService = courseService;
	}

	@Override
	public void contribute(Info.Builder builder) {
		Map<String, Integer> courseNameRatingMap = new HashMap<>();
		List<CourseNameRating> courseNameRatingList = new ArrayList<>();
		for (Course course : courseService.getAvailableCourse()) {
			courseNameRatingList.add(
				CourseNameRating.builder()
					.name(course.getName())
					.rating(course.getRating())
					.build());
		}
		builder.withDetail("courses", courseNameRatingList);
	}

	@Builder
	@Data
	private static class CourseNameRating {
		String name;
		int rating;
	}

}
