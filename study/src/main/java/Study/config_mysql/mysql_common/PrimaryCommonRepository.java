package Study.config_mysql.mysql_common;

import Study.config_mysql.PrimarySchemaRepository;
import Study.config_mysql.primary.PrimaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimaryCommonRepository extends JpaRepository<PrimaryEntity, Long>  {

}
