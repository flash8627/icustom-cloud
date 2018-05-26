package com.gwtjs.cloud.data.movie.domain.rels;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

import com.gwtjs.cloud.data.movie.domain.nodes.Genre;
import com.gwtjs.cloud.data.movie.domain.nodes.Movie;

@RelationshipEntity(type="HAS_GENRE")
public class HasGenre {
    @GraphId
    Long id;
    @StartNode
    Movie movie;
    @EndNode
    Genre genre;

    public HasGenre() {
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
