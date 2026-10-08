package com.app.changui.persistence.entity;

import com.app.changui.util.enums.GeneralStatus;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table( name = "producto")
public class Product {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_producto" )
    private Integer idProduct;

    @Column( name = "imagen", length = 255 )
    private String image;

    @Column( name = "nombre", nullable = false, length = 150 )
    private String name;

    @Column( name = "precio", nullable = false, precision = 10, scale = 2 )
    private BigDecimal price;

    @Column( name = "descripcion", columnDefinition = "TEXT")
    private String description;

    @Column( name = "stock", nullable = false )
    private Integer stock = 0;

    @Enumerated( EnumType.STRING )
    @Column( name = "estado_producto", length = 20, nullable = false )
    private GeneralStatus stateProduct = GeneralStatus.activo;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "id_sede" )
    private Sede sede;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "id_categoria" )
    private Category category;

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public GeneralStatus getStateProduct() {
        return stateProduct;
    }

    public void setStateProduct(GeneralStatus stateProduct) {
        this.stateProduct = stateProduct;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
