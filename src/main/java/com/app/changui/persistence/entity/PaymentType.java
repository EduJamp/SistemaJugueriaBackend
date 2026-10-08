package com.app.changui.persistence.entity;

import com.app.changui.util.enums.GeneralStatus;
import jakarta.persistence.*;

@Entity
@Table( name = "tipopago")
public class PaymentType {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_tipo_pago")
    private Integer idTipoPago;

    @Column( name = "nombre", length = 50, nullable = false )
    private String name;

    @Enumerated( EnumType.STRING )
    @Column( name = "estado_tipo_pago")
    private GeneralStatus statePaymentType = GeneralStatus.activo;

    public Integer getIdTipoPago() {
        return idTipoPago;
    }

    public void setIdTipoPago(Integer idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GeneralStatus getStatePaymentType() {
        return statePaymentType;
    }

    public void setStatePaymentType(GeneralStatus statePaymentType) {
        this.statePaymentType = statePaymentType;
    }
}
