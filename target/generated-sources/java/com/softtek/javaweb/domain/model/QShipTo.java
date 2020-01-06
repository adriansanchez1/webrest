package com.softtek.javaweb.domain.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShipTo is a Querydsl query type for ShipTo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QShipTo extends EntityPathBase<ShipTo> {

    private static final long serialVersionUID = -1335602145L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShipTo shipTo = new QShipTo("shipTo");

    public final StringPath address = createString("address");

    public final QCity city;

    public final StringPath email = createString("email");

    public final StringPath name = createString("name");

    public final StringPath phone = createString("phone");

    public final NumberPath<Long> shipToId = createNumber("shipToId", Long.class);

    public final QUser user;

    public final NumberPath<Long> zipcode = createNumber("zipcode", Long.class);

    public QShipTo(String variable) {
        this(ShipTo.class, forVariable(variable), INITS);
    }

    public QShipTo(Path<? extends ShipTo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShipTo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShipTo(PathMetadata metadata, PathInits inits) {
        this(ShipTo.class, metadata, inits);
    }

    public QShipTo(Class<? extends ShipTo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.city = inits.isInitialized("city") ? new QCity(forProperty("city"), inits.get("city")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user"), inits.get("user")) : null;
    }

}

