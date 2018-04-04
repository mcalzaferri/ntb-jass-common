package ch.ntb.jass.common.entities;

import java.util.Map;

public class TableEntity {
    /**
     * Key: seat number
     */
    public Map<Integer, SeatEntity> seats;

    /**
     * Current scores
     */
    public ScoreEntity scoreBoard;

    /**
     * The id of the current player
     */
    public String currentPlayerId;

    /**
     * Cards on the table.
     */
    public CardEntity[] cardsOnTable;

    /**
     * Current game variant.
     */
    public TrumpEntity trump;
}
