
package com.ppk.examples.jsonscehma.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * The Root Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "checked",
    "dimensions",
    "id",
    "name",
    "price",
    "tags"
})
public class MyJSONSchema {

    /**
     * The Checked Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("checked")
    private Boolean checked = false;
    /**
     * The Dimensions Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("dimensions")
    private Dimensions dimensions;
    /**
     * The Id Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private Integer id = 0;
    /**
     * The Name Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name = "";
    /**
     * The Price Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("price")
    private Double price = 0.0D;
    /**
     * The Tags Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public MyJSONSchema() {
    }

    /**
     * 
     * @param price
     * @param name
     * @param checked
     * @param id
     * @param dimensions
     * @param tags
     */
    public MyJSONSchema(Boolean checked, Dimensions dimensions, Integer id, String name, Double price, List<String> tags) {
        super();
        this.checked = checked;
        this.dimensions = dimensions;
        this.id = id;
        this.name = name;
        this.price = price;
        this.tags = tags;
    }

    /**
     * The Checked Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("checked")
    public Boolean getChecked() {
        return checked;
    }

    /**
     * The Checked Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("checked")
    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public MyJSONSchema withChecked(Boolean checked) {
        this.checked = checked;
        return this;
    }

    /**
     * The Dimensions Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("dimensions")
    public Dimensions getDimensions() {
        return dimensions;
    }

    /**
     * The Dimensions Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("dimensions")
    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public MyJSONSchema withDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * The Id Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * The Id Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public MyJSONSchema withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * The Name Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The Name Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public MyJSONSchema withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The Price Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    /**
     * The Price Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    public MyJSONSchema withPrice(Double price) {
        this.price = price;
        return this;
    }

    /**
     * The Tags Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    /**
     * The Tags Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public MyJSONSchema withTags(List<String> tags) {
        this.tags = tags;
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

    public MyJSONSchema withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(checked).append(dimensions).append(id).append(name).append(price).append(tags).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MyJSONSchema) == false) {
            return false;
        }
        MyJSONSchema rhs = ((MyJSONSchema) other);
        return new EqualsBuilder().append(checked, rhs.checked).append(dimensions, rhs.dimensions).append(id, rhs.id).append(name, rhs.name).append(price, rhs.price).append(tags, rhs.tags).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
