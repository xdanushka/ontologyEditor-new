package com.rmdc.ontologyEditor.model;
// Generated Oct 22, 2017 4:41:35 PM by Hibernate Tools 4.3.1


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Role generated by hbm2java
 */
@Entity
@Table(name="role"
    ,catalog="ontologyeditor"
)
public class Role  implements java.io.Serializable {

     @Id @GeneratedValue(strategy= GenerationType.AUTO)
     private Integer id;
     private String description;
     @OneToMany(fetch=FetchType.LAZY, mappedBy="role")
     private Set<User> users = new HashSet(0);

    public Role() {
    }

    public Role(String description, Set users) {
       this.description = description;
       this.users = users;
    }

    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="description", length=45)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Set<User> getUsers() {
        return this.users;
    }
    
    public void setUsers(Set<User> users) {
        this.users = users;
    }
}


