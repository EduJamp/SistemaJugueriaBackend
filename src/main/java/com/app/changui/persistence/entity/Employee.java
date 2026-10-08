package com.app.changui.persistence.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table( name = "empleado" )
public class Employee extends Person {
    @Id
    @GeneratedValue( strategy = GenerationType.UUID )
    @Column( name = "id_empleado", updatable = false, nullable = false)
    private UUID idEmployee;

    @Column( name = "sueldo", nullable = false, precision =  12, scale = 2 )
    private BigDecimal salary;

    @Column( name = "fecha_ingreso", nullable = false )
    private LocalDate dateOfEntry;

    @Column( name = "fecha_salida" )
    private LocalDate departureDate;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "id_sede", nullable = false )
    private Sede sedeEmployee;

    @OneToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "id_usuario", nullable = false, unique = true )
    private User user;

    public UUID getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(UUID idEmployee) {
        this.idEmployee = idEmployee;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDate getDateOfEntry() {
        return dateOfEntry;
    }

    public void setDateOfEntry(LocalDate dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public Sede getSedeEmployee() {
        return sedeEmployee;
    }

    public void setSedeEmployee(Sede sedeEmployee) {
        this.sedeEmployee = sedeEmployee;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
