package com.app.changui.persistence.entity;

import com.app.changui.util.enums.GeneralStatus;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table( name = "categoria")
public class Category {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_categoria")
    private Integer idCategory;

    @Column( name ="nombre", length = 100, nullable = false )
    private String nameCategory;

    @Column( name = "descripcion", columnDefinition = "TEXT" )
    private String description;

    @Enumerated( EnumType.STRING )
    @Column( name = "estado_categoria", length = 20 )
    private GeneralStatus stateCategory = GeneralStatus.activo;

    @OneToMany( mappedBy = "category" )
    private List<Product> products;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GeneralStatus getStateCategory() {
        return stateCategory;
    }

    public void setStateCategory(GeneralStatus stateCategory) {
        this.stateCategory = stateCategory;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
