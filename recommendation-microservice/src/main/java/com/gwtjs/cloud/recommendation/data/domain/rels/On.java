package com.gwtjs.cloud.recommendation.data.domain.rels;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

import com.gwtjs.cloud.recommendation.data.domain.nodes.Event;
import com.gwtjs.cloud.recommendation.data.domain.nodes.Job;

@RelationshipEntity(type="ON")
public class On {
    @GraphId
    Long id;
    @StartNode
    Event event;
    @EndNode
    Job job;

    public On() {
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
