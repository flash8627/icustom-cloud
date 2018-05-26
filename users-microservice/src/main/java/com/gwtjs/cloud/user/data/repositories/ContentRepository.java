package com.gwtjs.cloud.user.data.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gwtjs.cloud.user.data.domain.nodes.Content;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "content", path = "content")
public interface ContentRepository extends PagingAndSortingRepository<Content, Long> {
    List<Content> findByTitle(@Param("0") String title);
}
