package ch.ntb.jass.common.entities;

import java.util.Dictionary;

public class ScoreEntity {
	//Dictionary of <Team, Score>
	//Use get(TeamEntity key) to obtain the score of one team
	//TODO maybe only use id field (int) of TeamEntity instead of TeamEntiy for less data transmission
	Dictionary<TeamEntity, Integer> scores;
}
