package com.app.changui.persistence.entity;
import com.app.changui.util.enums.GeneralStatus;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table( name = "usuario" )
public class User {
    @Id
    @GeneratedValue( strategy = GenerationType.UUID )
    @Column( name = "id_usuario", updatable = false, nullable = false )
    private UUID idUsuario;

    @Column( name = "usuario", unique = true, nullable = false, length = 100 )
    private String username;

    @Column( name = "password", nullable = false, length = 255 )
    private String password;

    @Enumerated( EnumType.STRING )
    @Column( name = "estado_usuario", length = 20 )
    private GeneralStatus stateUser = GeneralStatus.activo;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "id_rol", nullable = false )
    private Rol rol;

    public UUID getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UUID idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public GeneralStatus getStateUser() {
        return stateUser;
    }

    public void setStateUser(GeneralStatus stateUser) {
        this.stateUser = stateUser;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
