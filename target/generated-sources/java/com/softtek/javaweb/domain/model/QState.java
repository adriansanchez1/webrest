package com.softtek.javaweb.domain.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QState is a Querydsl query type for State
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QState extends EntityPathBase<State> {

    private static final long serialVersionUID = -319828663L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QState state = new QState("state");

    public final StringPath description = createString("description");

    public final QShippingZone shippingZone;

    public final NumberPath<Long> stateId = createNumber("stateId", Long.class);

    public QState(String variable) {
        this(State.class, forVariable(variable), INITS);
    }

    public QState(Path<? extends State> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QState(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QState(PathMetadata metadata, PathInits inits) {
        this(State.class, metadata, inits);
    }

    public QState(Class<? extends State> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.shippingZone = inits.isInitialized("shippingZone") ? new QShippingZone(forProperty("shippingZone")) : null;
    }

}

