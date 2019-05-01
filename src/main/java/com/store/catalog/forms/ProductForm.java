package com.store.catalog.forms;

import javax.validation.constraints.NotNull;

public class ProductForm
{
    @NotNull
    private String name;
    @NotNull
    private String description;
    @NotNull
    private String code;

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the descrition
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param descrition the descrition to set
     */
    public void setDescription(String descrition) {
        this.description = descrition;
    }

    /**
     * @return String return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

}