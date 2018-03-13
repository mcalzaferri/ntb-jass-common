package ch.ntb.jass.common.proto.server_messages;

import ch.ntb.jass.common.entities.Card;

/**
 * This is a message from the server sent to a player
 * Tell's the player that an invalid card was played.
 * @param wrongCard invalid card before played
 */

public class WrongCardMessage {
	public Card wrongCard;
}
