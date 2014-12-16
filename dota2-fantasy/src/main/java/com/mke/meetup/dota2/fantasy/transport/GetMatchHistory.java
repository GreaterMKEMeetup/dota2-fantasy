package com.mke.meetup.dota2.fantasy.transport;

import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value="result")
public class GetMatchHistory {
	
	private int status;
	@JsonProperty("num_results")
	private long numResults;
	@JsonProperty("total_results")
	private long totalResults;
	@JsonProperty("results_remaining")
	private long resultsRemaining;

	private Collection<MatchHistoryResult> matches = new ArrayList<MatchHistoryResult>();

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Collection<MatchHistoryResult> getMatches() {
		return matches;
	}

	public void setMatches(Collection<MatchHistoryResult> matches) {
		this.matches = matches;
	}

	public long getNumResults() {
		return numResults;
	}

	public void setNumResults(long numResults) {
		this.numResults = numResults;
	}

	public long getResultsRemaining() {
		return resultsRemaining;
	}

	public void setResultsRemaining(long resultsRemaining) {
		this.resultsRemaining = resultsRemaining;
	}

	public long getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(long totalResults) {
		this.totalResults = totalResults;
	}
	
}
