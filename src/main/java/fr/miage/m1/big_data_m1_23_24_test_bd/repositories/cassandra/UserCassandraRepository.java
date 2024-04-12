package fr.miage.m1.big_data_m1_23_24_test_bd.repositories.cassandra;

import fr.miage.m1.big_data_m1_23_24_test_bd.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserCassandraRepository extends CrudRepository<User, UUID> {
}
