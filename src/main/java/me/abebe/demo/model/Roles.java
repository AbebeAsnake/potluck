package me.abebe.demo.model;


import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name ="roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique = true, name = "role")
    private String role;
    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private Collection<Potluckers> potluckers;

    public Roles() {
    }

    public Roles(String role, Collection<Potluckers> potluckers) {
        this.role = role;
        this.potluckers = potluckers;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", potluckers=" + potluckers +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Collection<Potluckers> getPotluckers() {
        return potluckers;
    }

    public void setPotluckers(Collection<Potluckers> potluckers) {
        this.potluckers = potluckers;
    }
}
