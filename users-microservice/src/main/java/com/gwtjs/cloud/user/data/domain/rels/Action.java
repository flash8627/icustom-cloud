package com.gwtjs.cloud.user.data.domain.rels;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

import com.gwtjs.cloud.user.data.domain.nodes.Event;
import com.gwtjs.cloud.user.data.domain.nodes.User;

@RelationshipEntity(type="ACTION")
public class Action {
	
    @GraphId
    Long id;

    public User getActor() {
        return actor;
    }

    public void setActor(User actor) {
        this.actor = actor;
    }

    @StartNode
    User actor;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @EndNode
    Event event;

    public Action(User actor, Event event) {
        this.actor = actor;
        this.event = event;
    }

    public Action() {
    }
}
