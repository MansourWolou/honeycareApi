package com.mansour.containeriz.User;


import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Builder
@Getter
@Setter
@Entity
@Table(name = "users")
public class UserModel {

    private static final long serialVersionUID = -767070904974486420L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String email;

    //@OneToMany(targetEntity = ContentModel.class,cascade = CascadeType.ALL)
    //@JoinColumn(name = "userTableId" , referencedColumnName = "user_id")
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "userTableId",referencedColumnName = "user_id" )
//    private List<ContentModel> content;

    public UserModel(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public UserModel() {

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserModel user = (UserModel) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(email, user.email);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }
}
