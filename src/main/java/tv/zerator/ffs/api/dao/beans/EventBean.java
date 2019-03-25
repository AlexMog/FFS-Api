package tv.zerator.ffs.api.dao.beans;

import lombok.Data;

public @Data class EventBean {
	private int id, minimumViews, minimumFollowers;
	private String name, description;
	private boolean reservedToAffiliates, reservedToPartners, isCurrent;
	private Status status;
	private RankingType rankingType;
	
	public enum Status {
		OPEN,
		CLOSED,
		STARTED,
		ENDED
	}
	
	public enum RankingType {
		SCORE_ASC,
		SCORE_DESC
	}
}
