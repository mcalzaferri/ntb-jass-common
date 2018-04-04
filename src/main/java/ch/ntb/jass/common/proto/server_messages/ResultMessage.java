package ch.ntb.jass.common.proto.server_messages;

import ch.ntb.jass.common.proto.ToPlayerMessage;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a generic success or error message
 */
public class ResultMessage extends ToPlayerMessage {
    public enum Code {
        OK,
        FAILURE,
        PROTOCOL_ERROR
    }

    @JsonProperty(required = true)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Code code;

    public String message;
}
