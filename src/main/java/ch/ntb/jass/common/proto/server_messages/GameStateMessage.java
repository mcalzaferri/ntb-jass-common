package ch.ntb.jass.common.proto.server_messages;

import ch.ntb.jass.common.entities.TableEntity;
import ch.ntb.jass.common.proto.ToPlayerMessage;

/**
 * This is a Message sent to the player after he joins the server.
 * It contains the complete state of the lobby and a running games to the player.
 * Note that depending on the state of the game most of the following fields can be null.
 * Further state changes are performed using incremental updates.
 */
public class GameStateMessage extends ToPlayerMessage {
    /**
     * The game table (just one for now)
     */
    public TableEntity table;
}
