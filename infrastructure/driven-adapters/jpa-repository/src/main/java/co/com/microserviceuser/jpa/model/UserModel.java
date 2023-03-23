package co.com.microserviceuser.jpa.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Entity
@Table(name="User")
public class UserModel {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name="name")
    private String name;
}
