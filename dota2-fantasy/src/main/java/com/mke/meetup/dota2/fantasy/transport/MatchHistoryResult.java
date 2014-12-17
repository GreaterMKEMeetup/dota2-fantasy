package com.mke.meetup.dota2.fantasy.transport;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MatchHistoryResult {
	
	@JsonProperty("match_id")
	private long id;
	@JsonProperty("match_seq_num")
	private long sequenceNumber;
	@JsonProperty("start_time")
	private int startTime;
	@JsonProperty("lobby_type")
	private int lobbyType;
	@JsonProperty("radiant_team_id")
	private long radiant;
	@JsonProperty("dire_team_id")
	private long dire;
	
	private Collection<MatchHistoryPlayer> players;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setSequenceNumber(long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public void setLobbyType(int lobbyType) {
		this.lobbyType = lobbyType;
	}

	public void setRadiant(long radiant) {
		this.radiant = radiant;
	}

	public void setDire(long dire) {
		this.dire = dire;
	}

	public void setPlayers(Collection<MatchHistoryPlayer> players) {
		this.players = players;
	}

	public long getSequenceNumber() {
		return sequenceNumber;
	}

	public int getStartTime() {
		return startTime;
	}

	public int getLobbyType() {
		return lobbyType;
	}

	public long getRadiant() {
		return radiant;
	}

	public long getDire() {
		return dire;
	}

	public Collection<MatchHistoryPlayer> getPlayers() {
		return players;
	}
	
	

}
