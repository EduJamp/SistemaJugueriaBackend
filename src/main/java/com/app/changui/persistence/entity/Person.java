package com.app.changui.persistence.entity;

import com.app.changui.util.enums.DocumentIdentityType;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Person {
    @Column( name = "nombre",  nullable = false, length = 100 )
    private String name;

    @Column( name = "apellido", length = 100 )
     private String lastName;

    @Enumerated( EnumType.STRING )
    @Column( name = "tipo_documento_identidad", length = 20 )
     private DocumentIdentityType documentIdentityType;

    @Column(name = "numero_documento_identidad")
     private String numberDocumentIdentity;

    @Column( name = "telefono", length = 20 )
     private String numberPhone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DocumentIdentityType getDocumentIdentityType() {
        return documentIdentityType;
    }

    public void setDocumentIdentityType(DocumentIdentityType documentIdentityType) {
        this.documentIdentityType = documentIdentityType;
    }

    public String getNumberDocumentIdentity() {
        return numberDocumentIdentity;
    }

    public void setNumberDocumentIdentity(String numberDocumentIdentity) {
        this.numberDocumentIdentity = numberDocumentIdentity;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }
}
