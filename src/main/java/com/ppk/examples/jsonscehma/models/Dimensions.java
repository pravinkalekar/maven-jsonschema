
package com.ppk.examples.jsonscehma.models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * The Dimensions Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "width",
    "height"
})
public class Dimensions {

    /**
     * The Width Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("width")
    private Integer width = 0;
    /**
     * The Height Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("height")
    private Integer height = 0;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Dimensions() {
    }

    /**
     * 
     * @param width
     * @param height
     */
    public Dimensions(Integer width, Integer height) {
        super();
        this.width = width;
        this.height = height;
    }

    /**
     * The Width Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    /**
     * The Width Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    public Dimensions withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * The Height Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    /**
     * The Height Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    public Dimensions withHeight(Integer height) {
        this.height = height;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Dimensions withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(width).append(height).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dimensions) == false) {
            return false;
        }
        Dimensions rhs = ((Dimensions) other);
        return new EqualsBuilder().append(width, rhs.width).append(height, rhs.height).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
