package me.abebe.demo.model;


import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "potluckers")
public class Potluckers {
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

@Column(name = "first_name")
private String firstName;

@Column(name = "last_name")
private String lastName;

@Column(name = "username")
private String username;

@Column(name = "email")
private String email;

@Column(name = "image")
private String image;

@ManyToMany(fetch = FetchType.EAGER)
@JoinTable(joinColumns = @JoinColumn(name = "potluckers_id"),
        inverseJoinColumns = @JoinColumn(name = "roles_id"), name = "potluckers_roles")

private Collection<Roles> roles;

@ManyToMany(fetch = FetchType.EAGER)
@JoinTable(joinColumns = @JoinColumn(name ="potluckers_id"),
inverseJoinColumns = @JoinColumn(name = "pledged_items_id"),name = "potluckers_pledged_items")

private Collection<PledgedItems> plegeditems;

    public Potluckers() {
    }

    public Potluckers(String firstName, String lastName, String username, String email, String image, Collection<Roles> roles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.image = image;
        this.roles = roles;
    }


    @Override
    public String toString() {
        return "Potluckers{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", image='" + image + '\'' +
                ", roles=" + roles +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Collection<Roles> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Roles> roles) {
        this.roles = roles;
    }
}
