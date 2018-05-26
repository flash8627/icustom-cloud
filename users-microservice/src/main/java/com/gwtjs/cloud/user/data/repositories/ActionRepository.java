package com.gwtjs.cloud.user.data.repositories;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gwtjs.cloud.user.data.domain.rels.Action;

@RepositoryRestResource(collectionResourceRel = "actions", path = "actions")
public interface ActionRepository extends PagingAndSortingRepository<Action, Long> {

}
