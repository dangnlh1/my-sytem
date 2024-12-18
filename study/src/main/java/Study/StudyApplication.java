package Study;

import Study.config_mysql.SecondarySchemaRepository;
import Study.config_mysql.mysql_common.PrimaryCommonRepository;
import Study.config_mysql.mysql_common.SecondaryCommonRepository;
import Study.config_mysql.primary.PrimaryEntity;
import Study.config_mysql.secondary.SecondaryEntity;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApplication {

    public StudyApplication(PrimaryCommonRepository primaryCommonRepository, SecondaryCommonRepository secondaryCommonRepository) {
        this.primaryCommonRepository = primaryCommonRepository;
        this.secondaryCommonRepository = secondaryCommonRepository;
    }

    public static void main(String[] args) {
		SpringApplication.run(StudyApplication.class, args);
	}

	private final PrimaryCommonRepository primaryCommonRepository;
	private final SecondaryCommonRepository secondaryCommonRepository;
	@PostConstruct
	void testCommonRepository (){
		PrimaryEntity entity1 = new PrimaryEntity();
		primaryCommonRepository.save(entity1);

		SecondaryEntity entity2 = new SecondaryEntity();
		secondaryCommonRepository.save(entity2);
	}
}
