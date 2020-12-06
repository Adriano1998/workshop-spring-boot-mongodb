package com.student.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.student.workshopmongo.domain.Post;
import com.student.workshopmongo.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

	
}
