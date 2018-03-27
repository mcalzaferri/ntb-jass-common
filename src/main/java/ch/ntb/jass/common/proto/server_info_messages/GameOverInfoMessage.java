package ch.ntb.jass.common.proto.server_info_messages;

import ch.ntb.jass.common.entities.*;
import ch.ntb.jass.common.proto.ToPlayerMessage;

/**
 * This is a informationmessage sent to all players.
 * It's the Information of the Game being over with the final Score
 * @param score contains the score
 */

public class GameOverInfoMessage extends ToPlayerMessage {
    public Score score;
}
