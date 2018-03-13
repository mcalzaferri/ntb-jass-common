package ch.ntb.jass.common.proto.server_info_messages;

import ch.ntb.jass.common.entities.Player;
import ch.ntb.jass.common.proto.ToPlayerMessage;

/**
 * This is a informationmessage sent to all players.
 * This message is sent when a  player leaves the game.
 * @param player player who left the game
 */

public class PlayerLeftGameInfoMessage extends ToPlayerMessage{
	public Player player;
}
