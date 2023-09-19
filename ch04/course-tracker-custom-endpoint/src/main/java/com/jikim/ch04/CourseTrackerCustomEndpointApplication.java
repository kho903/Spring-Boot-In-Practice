package com.jikim.ch04;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jikim.ch04.model.ReleaseItem;
import com.jikim.ch04.model.ReleaseNote;

@SpringBootApplication
public class CourseTrackerCustomEndpointApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseTrackerCustomEndpointApplication.class, args);
	}

	@Bean(name = "releaseNotes")
	public Collection<ReleaseNote> loadReleaseNote() {
		Set<ReleaseNote> releaseNotes = new LinkedHashSet<>();

		ReleaseNote releaseNote1 = ReleaseNote.builder()
			.version("v1.2.1")
			.releaseDate(LocalDate.of(2023, 9, 1))
			.commitTag("a7d2ea3")
			.bugFixes(Set.of(
				getReleaseItem("SBIP-123",
					"The name of the matching-strategy property is incorrect in the action message of the failure analysis for a PatternParseException #28839"),
				getReleaseItem("SBIP-124",
					"ErrorPageSecurityFilter prevents deployment to a Servlet 3.1 compatible container #28790")))
			.build();

		ReleaseNote releaseNote2 = ReleaseNote.builder()
			.version("v1.2.0")
			.releaseDate(LocalDate.of(2021, 11, 20))
			.commitTag("44047f3")
			.newReleases(Set.of(
				getReleaseItem("SBIP-125",
					"Support both kebab-case and camelCase as Spring init CLI Options #28138")))
			.bugFixes(Set.of(
				getReleaseItem("SBIP-126",
					"Profiles added using @ActiveProfiles have different precedence #28724")))
			.build();

		releaseNotes.addAll(Set.of(releaseNote1, releaseNote2));
		return releaseNotes;
	}

	private ReleaseItem getReleaseItem(String itemId, String itemDescription) {
		return ReleaseItem.builder()
			.itemId(itemId)
			.itemDescription(itemDescription)
			.build();
	}
}
