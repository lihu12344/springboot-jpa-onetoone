package com.example.demo.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "person")
public class PersonMap {

    @Id
    private Integer id;
    private String name;
    private Integer age;

    @OneToOne
    @JoinColumn(name = "card_id")
    private Card card;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonMap)) return false;
        PersonMap personMap = (PersonMap) o;
        return Objects.equals(getId(), personMap.getId()) &&
                Objects.equals(getName(), personMap.getName()) &&
                Objects.equals(getAge(), personMap.getAge()) &&
                Objects.equals(getCard(), personMap.getCard());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAge(), getCard());
    }
}
