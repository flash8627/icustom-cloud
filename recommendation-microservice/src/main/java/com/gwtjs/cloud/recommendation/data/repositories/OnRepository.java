package com.gwtjs.cloud.recommendation.data.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gwtjs.cloud.recommendation.data.domain.rels.On;

@RepositoryRestResource(collectionResourceRel = "on", path = "on")
public interface OnRepository extends PagingAndSortingRepository<On, Long> {

}
