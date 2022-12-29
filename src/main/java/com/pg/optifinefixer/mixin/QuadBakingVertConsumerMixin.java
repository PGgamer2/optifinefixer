package com.pg.optifinefixer.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.core.Direction;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.model.pipeline.QuadBakingVertexConsumer;

@OnlyIn(Dist.CLIENT)
@Mixin(value = {QuadBakingVertexConsumer.class}, priority = 2000)
public abstract class QuadBakingVertConsumerMixin implements VertexConsumer {
	@Redirect(method = "Lnet/minecraftforge/client/model/pipeline/QuadBakingVertexConsumer;endVertex()V", at = @At(value = "NEW", target = "Lnet/minecraft/client/renderer/block/model/BakedQuad;"))
	public BakedQuad constructBakedQuad(int[] p_111298_, int p_111299_, Direction p_111300_, TextureAtlasSprite p_111301_, boolean p_111302_, boolean hasAmbientOcclusion) {
		return new BakedQuad(p_111298_, p_111299_, p_111300_, p_111301_, p_111302_);
	}
}
