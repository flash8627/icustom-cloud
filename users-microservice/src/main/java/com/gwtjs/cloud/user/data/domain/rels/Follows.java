package com.gwtjs.cloud.user.data.domain.rels;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

import com.gwtjs.cloud.user.data.domain.nodes.User;

@RelationshipEntity(type="FOLLOWS")
public class Follows {
    @GraphId
    Long id;
    @StartNode
    User follower;
    @EndNode
    User follows;

    public Follows() {
    }

    public User getFollower() {
        return follower;
    }

    public void setFollower(User follower) {
        this.follower = follower;
    }

    public User getFollows() {
        return follows;
    }

    public void setFollows(User follows) {
        this.follows = follows;
    }
}
