package ch.ntb.jass.common.proto;

import ch.ntb.jass.common.entities.Card;

public class YourTurnMessage extends ToPlayerMessage {
	public Card[] validCards;
}
