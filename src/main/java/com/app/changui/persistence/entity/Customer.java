package com.app.changui.persistence.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table( name = "cliente")
public class Customer extends Person {
    @Id
    @GeneratedValue( strategy = GenerationType.UUID )
    @Column( name = "id_cliente", updatable = false, nullable = false )
    private UUID idCustomer;

    @OneToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "id_usuario", unique = true )
    private User userCustomer;

    public UUID getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(UUID idCustomer) {
        this.idCustomer = idCustomer;
    }

    public User getUserCustomer() {
        return userCustomer;
    }

    public void setUserCustomer(User userCustomer) {
        this.userCustomer = userCustomer;
    }
}
