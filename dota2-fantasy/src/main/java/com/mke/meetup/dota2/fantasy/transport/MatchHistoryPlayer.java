package com.mke.meetup.dota2.fantasy.transport;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MatchHistoryPlayer {

	@JsonProperty("account_id")
	private long accountId;
	@JsonProperty("player_slot")
	private int slot;
	@JsonProperty("hero_id")
	private int heroId;
	
	public long getAccountId() {
		return accountId;
	}
	public int getSlot() {
		return slot;
	}
	public int getHeroId() {
		return heroId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public void setSlot(int slot) {
		this.slot = slot;
	}
	public void setHeroId(int heroId) {
		this.heroId = heroId;
	}
	
}
