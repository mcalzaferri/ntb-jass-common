package ch.ntb.jass.common.proto.server_info_messages;

import ch.ntb.jass.common.entities.*;
import ch.ntb.jass.common.proto.ToPlayerMessage;

/**
 * This is a informationmessage sent to all players.
 * It contains the the information of the round being over with the ongoing score.
 * @param score contains the score of the ongoing game 
 */

public class EndOfRoundInfoMessage extends ToPlayerMessage {
	public Score [] score;
}
