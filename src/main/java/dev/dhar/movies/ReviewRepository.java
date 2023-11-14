package dev.dhar.movies;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository <Review,ObjectId>{
}
