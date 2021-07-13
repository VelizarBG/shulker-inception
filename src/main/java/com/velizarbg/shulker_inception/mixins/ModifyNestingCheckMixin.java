package com.velizarbg.shulker_inception.mixins;

import net.minecraft.screen.slot.ShulkerBoxSlot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ShulkerBoxSlot.class)
public abstract class ModifyNestingCheckMixin {
    @Inject(method = "canInsert", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item;canBeNested()Z"), cancellable = true)
    private void injected(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}
