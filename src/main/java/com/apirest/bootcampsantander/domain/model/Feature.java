package com.apirest.bootcampsantander.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_feature")
public class Feature extends BaseItem {
    public Feature(){
    }
    public Feature(String icon, String description) {
       super(icon, description);
    }

}
