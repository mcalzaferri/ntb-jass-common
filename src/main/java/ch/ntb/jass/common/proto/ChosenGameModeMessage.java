package ch.ntb.jass.common.proto;


import ch.ntb.jass.common.entities.CardColor;
import ch.ntb.jass.common.entities.GameMode;

public class ChosenGameModeMessage extends ToServerMessage {
	public GameMode mode;
	public CardColor color;
}
