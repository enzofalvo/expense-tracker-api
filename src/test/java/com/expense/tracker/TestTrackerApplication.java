package com.expense.tracker;

import org.springframework.boot.SpringApplication;

public class TestTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.from(TrackerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
