package de.prog2.uwu;

import com.almasb.fxgl.dsl.EntityBuilder;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.*;
import com.almasb.fxgl.physics.BoundingShape;
import com.almasb.fxgl.physics.BoxShapeData;
import com.almasb.fxgl.physics.HitBox;
import com.almasb.fxgl.physics.PhysicsComponent;

public class Factory implements EntityFactory {

    @Spawns("border")
    public Entity newBorder(SpawnData data){
        return FXGL.entityBuilder(data)
                .bbox(new HitBox(BoundingShape.box(data.<Integer>get("width"), data.<Integer>get("height"))))
                .with(new PhysicsComponent())
                .buildAndAttach();
    }

    @Spawns("mapTile")
    public Entity newMapTile(SpawnData data){
        return FXGL.entityBuilder(data)
                .bbox(new HitBox(BoundingShape.box(data.<Integer>get("width"), data.<Integer>get("height"))))
                .buildAndAttach();  //kein physics component weil nur collision detection notwendig
    }

    @Spawns("gameEvent")
    public Entity newGameEvent(SpawnData data){
        return FXGL.entityBuilder(data)
                .bbox(new HitBox(BoundingShape.box(data.<Integer>get("width"), data.<Integer>get("height"))))
                .buildAndAttach();  //kein physics component weil nur collision detection notwendig
    }
}
