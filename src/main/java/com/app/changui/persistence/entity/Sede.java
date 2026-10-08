package com.app.changui.persistence.entity;

import com.app.changui.util.enums.GeneralStatus;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table( name = "sede" )
public class Sede {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_sede" )
    private Integer idSede;

    @Column( name = "nombre", length = 100, nullable = false )
    private String name;

    @Column( name = "ubicacion", length = 255 )
    private String ubicacion;

    @Column( name = "telefono" , length = 20 )
    private String numberPhone;

    @Enumerated( EnumType.STRING )
    @Column( name = "estado_sede", length = 20 )
    private GeneralStatus stateSede  = GeneralStatus.activo;

    @OneToMany( mappedBy = "sede" )
    private List<Product> products;

    @OneToMany( mappedBy = "sedeEmployee")
    private List<Employee> employees;

    @OneToMany( mappedBy = "sede" )
    private List<Order> orders;

    public Integer getIdSede() {
        return idSede;
    }

    public void setIdSede(Integer idSede) {
        this.idSede = idSede;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public GeneralStatus getStateSede() {
        return stateSede;
    }

    public void setStateSede(GeneralStatus stateSede) {
        this.stateSede = stateSede;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
