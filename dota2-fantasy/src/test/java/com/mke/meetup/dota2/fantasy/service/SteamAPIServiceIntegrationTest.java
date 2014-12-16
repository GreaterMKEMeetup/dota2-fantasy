package com.mke.meetup.dota2.fantasy.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mke.meetup.dota2.fantasy.Application;
import com.mke.meetup.dota2.fantasy.transport.GetMatchHistory;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=Application.class)
public class SteamAPIServiceIntegrationTest {
	
	@Autowired
	private SteamAPIService apiService;
	
	@Test
	public void testInject() {
		assertNotNull(apiService);
	}
	
	@Test
	public void retrieveMatchHistory_ShouldReturn113Matches() {
		int accountId = (int) (0x7ffffff & 76561197963408745L);
		GetMatchHistory result = apiService.retrieveMatchHistory(accountId);
		assertEquals(100, result.getNumResults());
	}

}
