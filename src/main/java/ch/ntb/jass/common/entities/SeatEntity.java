package ch.ntb.jass.common.entities;

import ch.ntb.jass.common.proto.server_messages.LobbyStateMessage;

import java.util.List;

/**
 * Defines one of the four seats at the table.
 * Use this class to define the location of a player at the table.
 */
public class SeatEntity {
    /**
     * The id of a player in {@link LobbyStateMessage#registeredPlayers}
     */
    public String playerId;

    /**
     * The team id of the player
     */
    public Integer playerTeam;

    /**
     * For receiving players, all but the its own color and value are null/UNKNOWN as only the number of cards mus be known.
     */
    public List<CardEntity> cards;

    /**
     * true, if the player wants to start the game.
     */
    public boolean playerIsReady;
}
