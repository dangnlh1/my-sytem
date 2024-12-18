package Study.config_mysql.primary;

import Study.config_mysql.PrimarySchemaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimaryRepository extends JpaRepository<PrimaryEntity, Long> {

}