package ch.ntb.jass.common.proto.server_info_messages;

import ch.ntb.jass.common.entities.Card;
import ch.ntb.jass.common.proto.ToPlayerMessage;

// Wird bei jedem Zug an alle Spieler/Bots gesendet, z.b. f�r Gui-Aktualisierung
public class TurnInfoMessage extends ToPlayerMessage {
    public Card laidCard;
}
