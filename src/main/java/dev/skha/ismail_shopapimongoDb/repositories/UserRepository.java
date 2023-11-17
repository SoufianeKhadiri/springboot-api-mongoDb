package dev.skha.ismail_shopapimongoDb.repositories;

import dev.skha.ismail_shopapimongoDb.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
}
