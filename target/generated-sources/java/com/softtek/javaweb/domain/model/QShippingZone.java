package com.softtek.javaweb.domain.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QShippingZone is a Querydsl query type for ShippingZone
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QShippingZone extends EntityPathBase<ShippingZone> {

    private static final long serialVersionUID = -1451415870L;

    public static final QShippingZone shippingZone = new QShippingZone("shippingZone");

    public final NumberPath<Long> deliveryTime = createNumber("deliveryTime", Long.class);

    public final StringPath description = createString("description");

    public final NumberPath<Float> shippingCost = createNumber("shippingCost", Float.class);

    public final StringPath shippingZoneId = createString("shippingZoneId");

    public QShippingZone(String variable) {
        super(ShippingZone.class, forVariable(variable));
    }

    public QShippingZone(Path<? extends ShippingZone> path) {
        super(path.getType(), path.getMetadata());
    }

    public QShippingZone(PathMetadata metadata) {
        super(ShippingZone.class, metadata);
    }

}

