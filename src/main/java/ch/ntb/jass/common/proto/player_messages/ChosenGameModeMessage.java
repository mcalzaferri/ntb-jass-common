package ch.ntb.jass.common.proto.player_messages;

import ch.ntb.jass.common.entities.CardColor;
import ch.ntb.jass.common.entities.GameMode;
import ch.ntb.jass.common.proto.ToServerMessage;

public class ChosenGameModeMessage extends ToServerMessage {
    public GameMode mode;
    public CardColor color;
}
