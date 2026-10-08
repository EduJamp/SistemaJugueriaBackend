package com.app.changui.domain.dto;

import com.app.changui.util.enums.GeneralStatus;

import java.util.List;

public class SedeDTO {
    private int idSede;
    private String nameSede;
    private String locationSede;
    private String numberPhoneSede;
    private GeneralStatus stateSede;
    private List<ProductDTO> productsSede;

    public int getIdSede() {
        return idSede;
    }

    public void setIdSede(int idSede) {
        this.idSede = idSede;
    }

    public String getNameSede() {
        return nameSede;
    }

    public void setNameSede(String nameSede) {
        this.nameSede = nameSede;
    }

    public String getLocationSede() {
        return locationSede;
    }

    public void setLocationSede(String locationSede) {
        this.locationSede = locationSede;
    }

    public String getNumberPhoneSede() {
        return numberPhoneSede;
    }

    public void setNumberPhoneSede(String numberPhoneSede) {
        this.numberPhoneSede = numberPhoneSede;
    }

    public GeneralStatus getStateSede() {
        return stateSede;
    }

    public void setStateSede(GeneralStatus stateSede) {
        this.stateSede = stateSede;
    }

    public List<ProductDTO> getProductsSede() {
        return productsSede;
    }

    public void setProductsSede(List<ProductDTO> productsSede) {
        this.productsSede = productsSede;
    }
}
