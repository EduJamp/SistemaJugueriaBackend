package com.app.changui.persistence.entity;

import com.app.changui.util.enums.PaymentStatus;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table( name = "pago" )
public class Pay {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_pago", updatable = false, nullable = false)
    private UUID idPay;

    @Column(name = "monto_parcial", nullable = false, precision = 10, scale = 2)
    private BigDecimal partialAmount;

    @Enumerated( EnumType.STRING )
    @Column(name = "estado_pago", length = 20)
    private PaymentStatus paymentStatus = PaymentStatus.completado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_pago", nullable = false)
    private PaymentType paymentType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pedido", nullable = false)
    private Order order;

    public UUID getIdPay() {
        return idPay;
    }

    public void setIdPay(UUID idPay) {
        this.idPay = idPay;
    }

    public BigDecimal getPartialAmount() {
        return partialAmount;
    }

    public void setPartialAmount(BigDecimal partialAmount) {
        this.partialAmount = partialAmount;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
