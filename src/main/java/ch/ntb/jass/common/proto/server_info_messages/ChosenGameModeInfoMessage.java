package ch.ntb.jass.common.proto.server_info_messages;

import ch.ntb.jass.common.entities.*;
import ch.ntb.jass.common.proto.ToPlayerMessage;

/**
 * This is a informationmessage sent to all players.
 * It contains the gamemode and the color for the mode "trumpf".
 * @param mode contains the gamemode
 * @param color contains the color if the card with the chosen gamemode is "trumpf"
 */

public class ChosenGameModeInfoMessage extends ToPlayerMessage {
    public GameModeEntity mode;
    public CardColorEntity color;
    
}
