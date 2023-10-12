package de.aredblock.yt.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(LivingEntity.class)
public abstract class EntityLivingMixin extends Entity {
    @Shadow public float headYaw;
    public EntityLivingMixin(World world) {
        super(world);
    }
    @Overwrite
    public Vec3d getRotationVector(float vector){
        return this.getRotationVector(this.pitch, this.headYaw);
    }
}
