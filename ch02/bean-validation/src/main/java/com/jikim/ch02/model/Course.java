package com.jikim.ch02.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Course {
	private long id;
	private String name;
	private String category;

	@Min(value = 1, message = "A course should have a minimum of 1 rating")
	@Max(value = 5, message = "A course should have a maximum of 5 rating")
	private int rating;
	private String description;

	@Override
	public String toString() {
		return "Course{" +
			"id=" + id +
			", name='" + name + '\'' +
			", category='" + category + '\'' +
			", rating=" + rating +
			", description='" + description + '\'' +
			'}';
	}
}
