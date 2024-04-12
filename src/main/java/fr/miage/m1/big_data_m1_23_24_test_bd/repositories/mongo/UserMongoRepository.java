package fr.miage.m1.big_data_m1_23_24_test_bd.repositories.mongo;

import fr.miage.m1.big_data_m1_23_24_test_bd.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface UserMongoRepository extends MongoRepository<User, UUID>{
}
