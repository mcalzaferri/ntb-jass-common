package ch.ntb.jass.common.proto;

import java.util.Objects;

/**
 * Message that will be sent from Server to Client.
 * @param type defines de message type that will be sent.
 */

public class Message {
    public String type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(type, message.type);
    }

    @Override
    public int hashCode() {

        return Objects.hash(type);
    }
}
