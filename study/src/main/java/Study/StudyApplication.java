package Study;

import Study.config_mysql.SecondarySchemaRepository;
import Study.config_mysql.mysql_common.PrimaryCommonRepository;
import Study.config_mysql.mysql_common.SecondaryCommonRepository;
import Study.config_mysql.primary.PrimaryEntity;
import Study.config_mysql.primary.PrimaryRepository;
import Study.config_mysql.secondary.SecondaryEntity;
import Study.config_mysql.secondary.SecondaryRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApplication {

    public StudyApplication(PrimaryCommonRepository primaryCommonRepository, SecondaryCommonRepository secondaryCommonRepository, PrimaryRepository primaryRepository, SecondaryRepository secondaryRepository) {
        this.primaryCommonRepository = primaryCommonRepository;
        this.secondaryCommonRepository = secondaryCommonRepository;
        this.primaryRepository = primaryRepository;
        this.secondaryRepository = secondaryRepository;
    }

    public static void main(String[] args) {
		SpringApplication.run(StudyApplication.class, args);
	}

	private final PrimaryCommonRepository primaryCommonRepository;
	private final SecondaryCommonRepository secondaryCommonRepository;
	private final PrimaryRepository primaryRepository;
	private final SecondaryRepository secondaryRepository;
	@PostConstruct
	void testCommonRepository (){
		PrimaryEntity entity1 = new PrimaryEntity();
		primaryCommonRepository.save(entity1);
		PrimaryEntity entity2 = new PrimaryEntity();
		primaryRepository.save(entity2);
		System.out.println("primary:" + primaryCommonRepository.findAll().size());



		SecondaryEntity entity3 = new SecondaryEntity();
		secondaryCommonRepository.save(entity3);
		SecondaryEntity entity4 = new SecondaryEntity();
		secondaryRepository.save(entity4);
		System.out.println("secondary:" + secondaryRepository.findAll().size());

	}
}
