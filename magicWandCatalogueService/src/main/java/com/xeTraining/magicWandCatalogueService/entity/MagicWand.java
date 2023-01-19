package com.xeTraining.magicWandCatalogueService.entity;

import javax.persistence.*;

@Entity
@Table(name = "magicWand")
public class MagicWand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "magicWand_name")
    private String magicWand_name;

    @Column(name = "magicWand_desc")
    private String magicWand_desc;

    @Column(name = "age_limit")
    private int age_limit;

    @Column(name = "magicWand_stock")
    private int magicWand_stock;

    public MagicWand() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMagicWand_name() {
        return magicWand_name;
    }

    public void setMagicWand_name(String magicWand_name) {
        this.magicWand_name = magicWand_name;
    }

    public String getMagicWand_desc() {
        return magicWand_desc;
    }

    public void setMagicWand_desc(String magicWand_desc) {
        this.magicWand_desc = magicWand_desc;
    }

    public int getAge_limit() {
        return age_limit;
    }

    public void setAge_limit(int age_limit) {
        this.age_limit = age_limit;
    }

    public int getMagicWand_stock() {
        return magicWand_stock;
    }

    public void setMagicWand_stock(int magicWand_stock) {
        this.magicWand_stock = magicWand_stock;
    }
}
