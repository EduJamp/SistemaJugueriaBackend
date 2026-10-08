package com.app.changui.domain.dto;



import com.app.changui.util.enums.GeneralStatus;

import java.math.BigDecimal;

public class ProductDTO {
    private int idProduct;
    private String imgProduct;
    private String nameProduct;
    private BigDecimal priceProduct;
    private String descriptionProduct;
    private int stockProduct;
    private GeneralStatus stateProduct;
    private Integer idSede;
    private String nameSede;
    private Integer idCategory;
    private String nameCategory;

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getImgProduct() {
        return imgProduct;
    }

    public void setImgProduct(String imgProduct) {
        this.imgProduct = imgProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public BigDecimal getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(BigDecimal priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public int getStockProduct() {
        return stockProduct;
    }

    public void setStockProduct(int stockProduct) {
        this.stockProduct = stockProduct;
    }

    public GeneralStatus getStateProduct() {
        return stateProduct;
    }

    public void setStateProduct(GeneralStatus stateProduct) {
        this.stateProduct = stateProduct;
    }

    public Integer getIdSede() {
        return idSede;
    }

    public void setIdSede(Integer idSede) {
        this.idSede = idSede;
    }

    public String getNameSede() {
        return nameSede;
    }

    public void setNameSede(String nameSede) {
        this.nameSede = nameSede;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
}
