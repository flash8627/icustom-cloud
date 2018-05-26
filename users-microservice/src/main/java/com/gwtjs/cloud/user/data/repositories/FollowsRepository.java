package com.gwtjs.cloud.user.data.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gwtjs.cloud.user.data.domain.rels.Follows;

@RepositoryRestResource(collectionResourceRel = "follows", path = "follows")
public interface FollowsRepository extends PagingAndSortingRepository<Follows, Long> {

}
