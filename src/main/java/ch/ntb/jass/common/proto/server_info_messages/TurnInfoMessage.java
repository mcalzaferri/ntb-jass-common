package ch.ntb.jass.common.proto.server_info_messages;

import ch.ntb.jass.common.entities.*;
import ch.ntb.jass.common.proto.ToPlayerMessage;

/**
 * This is a information message sent to all players.
 * This message is sent when a card is player, it contains the information of the card played.
 * @param card played card
 */

public class TurnInfoMessage extends ToPlayerMessage {
    public CardEntity laidCard;
}
