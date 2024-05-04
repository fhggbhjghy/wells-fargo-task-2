package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private long portfolioId;

    protected Security() {

    }

    public Security(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Long portfolioId() {
        return portfolioId;
    }

    public void setclientId(long portfolioId) {
        this.portfolioId = portfolioId;
    }
}
