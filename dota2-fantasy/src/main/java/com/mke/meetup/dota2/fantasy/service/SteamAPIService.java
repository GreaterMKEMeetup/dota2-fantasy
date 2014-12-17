package com.mke.meetup.dota2.fantasy.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.mke.meetup.dota2.fantasy.domain.Match;
import com.mke.meetup.dota2.fantasy.transport.GetMatchHistory;

@Service
public class SteamAPIService {
	
	private static final String KEY_PARAM = "key";
	private static final String ACCOUNT_ID_PARAM = "account_id";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${STEAM_API_KEY}")
	private String apiKey;
	
	/**
	 * <p>Note: API allows for both 64 bit (long), and 32 bit integers for account IDs.  When
	 * Accounts are brought in to the application, both should be saved, but 32 bit only be used when
	 * making API calls due to simplicity (API returns the 32 bit Account IDs)</p>
	 * @param accountId
	 * @return A {@link Collection} of {@link Match} for the given Account ID.
	 */
	public GetMatchHistory retrieveMatchHistory(int accountId) {
		UriComponents uriComponents = UriComponentsBuilder.fromPath(Endpoints.MATCH_HISTORY.getEndpoint())
			.scheme("https")
			.host(Endpoints.DEFAULT_PATH)
			.queryParam(KEY_PARAM, apiKey)
			.queryParam(ACCOUNT_ID_PARAM, accountId)
			.build();		
		return restTemplate.getForObject(uriComponents.toUriString(), GetMatchHistory.class);
	}
	
	private enum Endpoints {
		MATCH_HISTORY("IDOTA2Match_570/GetMatchHistory/V001/");
		
		private static final String DEFAULT_PATH = "api.steampowered.com";
		private final String endpoint;

		Endpoints(String endpoint) {
			this.endpoint = endpoint;
		}
		
		public String getEndpoint() {
			return this.endpoint;
		}
		
	}

}
