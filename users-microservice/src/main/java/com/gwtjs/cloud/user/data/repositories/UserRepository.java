package com.gwtjs.cloud.user.data.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gwtjs.cloud.user.data.domain.nodes.User;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    // TODO: Replace with @Param("name") when Spring Data Neo4j supports names vs. positional arguments
    List<User> findByLastName(@Param("0") String name);

    List<User> findAll();

}
