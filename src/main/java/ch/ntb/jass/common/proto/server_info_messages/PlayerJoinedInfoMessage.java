package ch.ntb.jass.common.proto.server_info_messages;

import ch.ntb.jass.common.entities.PlayerEntity;
import ch.ntb.jass.common.proto.ToPlayerMessage;

/**
 * This is a informationmessage sent to all players.
 * This message is sent when a player joines the table.
 * @param player player who joined the table
 */

public class PlayerJoinedInfoMessage extends ToPlayerMessage{
	public PlayerEntity player;
}
