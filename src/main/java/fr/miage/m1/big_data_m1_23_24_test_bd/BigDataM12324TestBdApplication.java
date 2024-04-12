package fr.miage.m1.big_data_m1_23_24_test_bd;

import fr.miage.m1.big_data_m1_23_24_test_bd.entities.User;
import fr.miage.m1.big_data_m1_23_24_test_bd.repositories.cassandra.UserCassandraRepository;
import fr.miage.m1.big_data_m1_23_24_test_bd.repositories.mongo.UserMongoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableCassandraRepositories(basePackages = "fr.miage.m1.big_data_m1_23_24_test_bd.repositories.cassandra")
@EnableMongoRepositories(basePackages = "fr.miage.m1.big_data_m1_23_24_test_bd.repositories.mongo")
public class BigDataM12324TestBdApplication {

    public static void main(String[] args) {
        SpringApplication.run(BigDataM12324TestBdApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(UserMongoRepository userRepository, UserCassandraRepository userCassandraRepository) {
        return args -> {
            User userInstance = User.builder().name("John").build();
            userCassandraRepository.save(userInstance);
            userRepository.save(userInstance);
        };
    }
}
