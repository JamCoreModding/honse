package io.github.jamalam360.honse.mixin;

import net.minecraft.client.render.entity.HorseBaseEntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

/**
 * @author Jamalam
 */

@Mixin(HorseBaseEntityRenderer.class)
public class HorseBaseEntityRendererMixin {
    @ModifyArg(
            method = "scale(Lnet/minecraft/entity/passive/HorseBaseEntity;Lnet/minecraft/client/util/math/MatrixStack;F)V",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/util/math/MatrixStack;scale(FFF)V"
            ),
            index = 0
    )
    public float scale(float scale) {
        return scale * 2.5f;
    }
}
