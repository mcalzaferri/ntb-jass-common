package ch.ntb.jass.common.proto.server_messages;

import ch.ntb.jass.common.entities.PlayerEntity;
import ch.ntb.jass.common.proto.ToPlayerMessage;
import ch.ntb.jass.common.proto.player_messages.JoinLobbyMessage;
import ch.ntb.jass.common.proto.player_messages.LeaveLobbyMessage;

import java.util.Map;

/**
 * This is a Message sent to the player after he joins the server.
 * It will send the complete state of the lobby to the player.
 * When a game is running, this message is followed by a {@link GameStateMessage}
 */
public class LobbyStateMessage extends ToPlayerMessage {
    /**
     * The information of all registered players, i.e.
     * players which have checked in with {@link JoinLobbyMessage}
     * and not yet left with {@link LeaveLobbyMessage} or timed out,
     * regardless of whether they are at a table or not.
     * Key: {@link PlayerEntity#id}
     */
    public Map<String, PlayerEntity> registeredPlayers;
}
