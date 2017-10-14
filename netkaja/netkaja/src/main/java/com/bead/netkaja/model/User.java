package com.bead.netkaja.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class User extends Base{
    @Column
    private String userName;
    @Column
    private String password;
    @Column
    private Role status;

    public User(String userName, String password, Role status) {
        this.userName = userName;
        this.password = password;
        this.status = status;
    }

    public User(){

    }
    
    public String getUsername(){
        return this.userName;
    }
    
    public void setRole(Role role){
        this.status = role;
    }
}
