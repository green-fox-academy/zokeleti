package restproject.rest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    Timestamp createdAt;
    String data;
    String endpoint;

    public Log(Timestamp createdAt, String data, String endpoint){
        this.createdAt = createdAt;
        this.data = data;
        this.endpoint = endpoint;

    }
}
