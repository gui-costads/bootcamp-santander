package com.apirest.bootcampsantander.domain.model;

import java.util.List;

public class User {
    private Long id;
    private String name;
    private Account account;
    private Card card;
    private List<Feature> featureList;
    private List<News> newsList;

    public User(String name, Account account, Card card, List<Feature> featureList, List<News> newsList) {
        this.name = name;
        this.account = account;
        this.card = card;
        this.featureList = featureList;
        this.newsList = newsList;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Feature> getFeatureList() {
        return featureList;
    }

    public void setFeatureList(List<Feature> featureList) {
        this.featureList = featureList;
    }

    public List<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<News> newsList) {
        this.newsList = newsList;
    }
}
