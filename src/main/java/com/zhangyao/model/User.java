package com.zhangyao.model;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by zhangyao on 16-4-1.
 */
public class User {

    private String id;

    @NotBlank
    private String name;

    @NotBlank
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
