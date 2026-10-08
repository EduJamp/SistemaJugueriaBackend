package com.app.changui.persistence.entity;
import com.app.changui.util.enums.GeneralStatus;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table( name = "rol" )
public class Rol {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_rol" )
    private Integer idRol;

    @Column( name = "nombre", length = 50, nullable = false )
    private String name;

    @Column( name = "descripcion", columnDefinition = "TEXT" )
    private String descripcion;

    @Enumerated( EnumType.STRING )
    @Column( name = "estado_rol", length = 20 )
    private GeneralStatus stateRol = GeneralStatus.activo;

    @OneToMany( mappedBy = "rol" )
    private List<User> users;

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public GeneralStatus getStateRol() {
        return stateRol;
    }

    public void setStateRol(GeneralStatus stateRol) {
        this.stateRol = stateRol;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
