package ch.ntb.jass.common.proto.server_messages;

import ch.ntb.jass.common.entities.Card;
import ch.ntb.jass.common.proto.ToPlayerMessage;

/**
 * This is a message from the server sent to a player
 * Message that defines who's playing next
 * @param validCards Array with the valid cards.
 */

public class YourTurnMessage extends ToPlayerMessage {
    public Card[] validCards;
}
