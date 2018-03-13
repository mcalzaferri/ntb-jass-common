package ch.ntb.jass.common.proto.server_info_messages;

import ch.ntb.jass.common.entities.CardColor;
import ch.ntb.jass.common.entities.GameMode;
import ch.ntb.jass.common.proto.ToPlayerMessage;

// Informiert alle Spieler �ber den gew�hlten Trumpf/Modus
public class ChosenGameModeInfoMessage extends ToPlayerMessage {
    public GameMode mode;
    public CardColor color;
}
