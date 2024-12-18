package Study.config_mysql.secondary;

import jakarta.persistence.*;

@Entity
@Table(name = "secondary_entity")
public class SecondaryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
