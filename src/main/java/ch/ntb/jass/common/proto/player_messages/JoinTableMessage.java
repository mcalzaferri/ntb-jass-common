package ch.ntb.jass.common.proto.player_messages;

import ch.ntb.jass.common.proto.ToServerMessage;

/**
 * This Message is sent to the Server when the player wishes to join the Table
 */
public class JoinTableMessage extends ToServerMessage {
    /**
     * The seat the player wants to sit at.
     * Will be confirmed or denied with the GameStartedMessage
     */
    public Integer preferedSeat;
}
