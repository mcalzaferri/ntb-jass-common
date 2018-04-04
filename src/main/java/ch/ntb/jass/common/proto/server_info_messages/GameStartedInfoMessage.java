package ch.ntb.jass.common.proto.server_info_messages;

import ch.ntb.jass.common.entities.TableEntity;
import ch.ntb.jass.common.proto.ToPlayerMessage;

/**
 * This is an information message sent to all players.
 * Information message to all players that the game started.
 * The teams are also defined with this message.
 */

public class GameStartedInfoMessage extends ToPlayerMessage {
    /**
     * The table with the teams that are playing against each other.
     */
    public TableEntity table;
}
