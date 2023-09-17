package com.apirest.bootcampsantander.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity(name = "tb_news")
public class News extends BaseItem{
    public News(String icon, String description) {
        super(icon, description);
    }
}
