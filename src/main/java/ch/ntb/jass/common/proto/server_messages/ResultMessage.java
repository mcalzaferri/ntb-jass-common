package ch.ntb.jass.common.proto.server_messages;

import ch.ntb.jass.common.proto.ToPlayerMessage;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains the result for a requested operation ({@link ch.ntb.jass.common.proto.ToServerMessage})
 */
public class ResultMessage extends ToPlayerMessage {
    public enum Code {
        /**
         * code for a successful operation
         */
        OK,
        /**
         * code for a failed operation
         */
        FAILURE,
        /**
         * code for a protocol error (for structural errors and wrong messages, etc.)
         */
        PROTOCOL_ERROR
    }

    @JsonProperty(required = true)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Code code;

    public String message;
}
