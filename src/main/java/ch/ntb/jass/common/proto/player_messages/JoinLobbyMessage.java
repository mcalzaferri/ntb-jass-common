package ch.ntb.jass.common.proto.player_messages;

import ch.ntb.jass.common.proto.ToServerMessage;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This Message is sent to the Server when the player wishes to join the Lobby (This is the when the player wants to connect to the server)
 *
 * @param playerData Contains some Data about the player. playerData.id and playerData.seatNr have no purpose here.
 */
public class JoinLobbyMessage extends ToServerMessage {
    @JsonProperty(required = true)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String playerName;

    public boolean isBot;
}
