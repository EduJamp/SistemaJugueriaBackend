package com.app.changui.domain.dto;

import com.app.changui.util.enums.GeneralStatus;

public class CategoryDTO {
    private int idCategory;
    private String nameCategory;
    private String descriptionCategory;
    private GeneralStatus stateCategory;

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getDescriptionCategory() {
        return descriptionCategory;
    }

    public void setDescriptionCategory(String descriptionCategory) {
        this.descriptionCategory = descriptionCategory;
    }

    public GeneralStatus getStateCategory() {
        return stateCategory;
    }

    public void setStateCategory(GeneralStatus stateCategory) {
        this.stateCategory = stateCategory;
    }
}
