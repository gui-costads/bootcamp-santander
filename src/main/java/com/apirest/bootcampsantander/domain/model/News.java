package com.apirest.bootcampsantander.domain.model;

import jakarta.persistence.Entity;
@Entity(name = "tb_news")
public class News extends BaseItem{
    public News() {
    }
    public News(String icon, String description) {
        super(icon, description);
    }
}
