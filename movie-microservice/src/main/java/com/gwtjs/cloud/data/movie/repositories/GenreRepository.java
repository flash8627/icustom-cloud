package com.gwtjs.cloud.data.movie.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gwtjs.cloud.data.movie.domain.nodes.Genre;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "genres", path = "genres")
public interface GenreRepository extends PagingAndSortingRepository<Genre, Long> {
    List<Genre> findByName(@Param("0") String name);
}
