package com.mke.meetup.dota2.fantasy.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerServiceTest {
	
	@Test
	public void env() {
		String apiKey = System.getenv("STEAM_API_KEY");
		assertNotNull("Please ensure your API key is registered as an environment variable", apiKey);
	}
}
