package com.app.changui.persistence.entity;

import com.app.changui.util.enums.CashRegisterStatement;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table( name = "caja" )
public class CashRegister {
    @Id
    @GeneratedValue( strategy = GenerationType.UUID )
    @Column( name = "id_caja" )
    private UUID idCashRegister;

    @Column( name = "fecha_hora_apertura", nullable = false, updatable = false )
    private LocalDateTime openingDateTime = LocalDateTime.now();

    @Column( name = "fecha_hora_cierre" )
    private LocalDateTime closingDateTime;

    @Column( name = "monto_inicial", nullable = false, precision = 10, scale = 2)
    private BigDecimal initialAmount = BigDecimal.ZERO;

    @Column( name = "monto_calculado", nullable = false, precision = 10, scale = 2)
    private BigDecimal calculatedAmount = BigDecimal.ZERO;

    @Column( name = "monto_declarado", precision = 10, scale = 2)
    private BigDecimal declaredAmount;

    @Enumerated( EnumType.STRING )
    @Column( name = "estado_caja", length = 20 )
    private CashRegisterStatement state = CashRegisterStatement.abierta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empleado", nullable = false)
    private Employee employeeCashier;

    public UUID getIdCashRegister() {
        return idCashRegister;
    }

    public void setIdCashRegister(UUID idCashRegister) {
        this.idCashRegister = idCashRegister;
    }

    public LocalDateTime getOpeningDateTime() {
        return openingDateTime;
    }

    public void setOpeningDateTime(LocalDateTime openingDateTime) {
        this.openingDateTime = openingDateTime;
    }

    public LocalDateTime getClosingDateTime() {
        return closingDateTime;
    }

    public void setClosingDateTime(LocalDateTime closingDateTime) {
        this.closingDateTime = closingDateTime;
    }

    public BigDecimal getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(BigDecimal initialAmount) {
        this.initialAmount = initialAmount;
    }

    public BigDecimal getCalculatedAmount() {
        return calculatedAmount;
    }

    public void setCalculatedAmount(BigDecimal calculatedAmount) {
        this.calculatedAmount = calculatedAmount;
    }

    public BigDecimal getDeclaredAmount() {
        return declaredAmount;
    }

    public void setDeclaredAmount(BigDecimal declaredAmount) {
        this.declaredAmount = declaredAmount;
    }

    public CashRegisterStatement getState() {
        return state;
    }

    public void setState(CashRegisterStatement state) {
        this.state = state;
    }

    public Employee getEmployeeCashier() {
        return employeeCashier;
    }

    public void setEmployeeCashier(Employee employeeCashier) {
        this.employeeCashier = employeeCashier;
    }
}
