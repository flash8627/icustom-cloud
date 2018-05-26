package com.gwtjs.cloud.user.data.domain.rels;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

import com.gwtjs.cloud.user.data.domain.nodes.Event;
import com.gwtjs.cloud.user.data.domain.nodes.User;

@RelationshipEntity(type = "CAUSED")
public class Caused {
    @GraphId
    Long id;
    @StartNode
    User user;
    @EndNode
    Event event;
}
