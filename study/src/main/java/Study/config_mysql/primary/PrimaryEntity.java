package Study.config_mysql.primary;

import jakarta.persistence.*;

@Entity
@Table(name = "primary_entity")
public class PrimaryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
