package com.xeTraining.orderservice.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "order_service")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "wizard_id")
    private int wizard_id;

    @Column(name = "wand_id")
    private int wand_id;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getWizard_id() {
        return wizard_id;
    }

    public void setWizard_id(int wizard_id) {
        this.wizard_id = wizard_id;
    }

    public int getWand_id() {
        return wand_id;
    }

    public void setWand_id(int wand_id) {
        this.wand_id = wand_id;
    }
}
