package ch.ntb.jass.common.proto.server_info_messages;

import ch.ntb.jass.common.entities.Player;

/**
 * This is a informationmessage sent to all players.
 * This message is sent when a  player leaves the table.
 * @param player player who left the table
 */

public class PlayerLeftTableInfoMessage {
	public Player player;
}
