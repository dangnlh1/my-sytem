package Study.config_mysql.secondary;

import Study.config_mysql.SecondarySchemaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SecondarySchemaRepository
public interface SecondaryRepository extends JpaRepository<SecondaryEntity, Long>  {

}