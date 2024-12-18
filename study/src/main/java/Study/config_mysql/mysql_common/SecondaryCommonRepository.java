package Study.config_mysql.mysql_common;

import Study.config_mysql.SecondarySchemaRepository;
import Study.config_mysql.primary.PrimaryEntity;
import Study.config_mysql.secondary.SecondaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondaryCommonRepository extends JpaRepository<SecondaryEntity, Long> , SecondarySchemaRepository {

}
