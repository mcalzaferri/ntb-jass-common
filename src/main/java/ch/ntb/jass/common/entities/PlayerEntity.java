package ch.ntb.jass.common.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * An unique player object, which is defined and checked by the server
 */
public class PlayerEntity {
    @JsonProperty(required = true)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String id;

    @JsonProperty(required = true)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String name;

    @JsonProperty(required = true)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public boolean isBot;

    //Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerEntity that = (PlayerEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
