package ch.ntb.jass.common.proto;

import ch.ntb.jass.common.proto.server_info_messages.TurnInfoMessage;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.Objects;

/**
 * Message that will be sent from Server to Client.
 * @param type defines de message type that will be sent.
 */

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "@type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = ToPlayerMessage.class, name = "serverMessage"),
        @JsonSubTypes.Type(value = ToServerMessage.class, name = "clientMessage"),
        @JsonSubTypes.Type(value = TurnInfoMessage.class, name = "turnInfo")
})

public class Message {
    /**
     * An id defined by the sender, which may be used in related responses
     */
    public String id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(id, message.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
