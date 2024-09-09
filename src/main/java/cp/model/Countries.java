package cp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Countries")
public class Countries {
    @Id
    private Integer id;
    private String name;
}
