package ch.ntb.jass.common.proto.server_messages;

import ch.ntb.jass.common.entities.Card;
import ch.ntb.jass.common.proto.ToPlayerMessage;

public class HandOutCardsMessage extends ToPlayerMessage {
    public Card[] cards;
}
