package ch.ntb.jass.common.proto.player_messages;

import ch.ntb.jass.common.entities.Card;
import ch.ntb.jass.common.proto.ToServerMessage;

public class PlaceCardMessage extends ToServerMessage {
    public Card card;
}
