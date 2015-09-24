package com.leonic.balloons.utils;

import com.leonic.balloons.helpers.LogHelper;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public final class TextureUtils {

	public final static int TEXTURE_MAP_BLOCKS = 0;
	public final static int TEXTURE_MAP_ITEMS = 1;

	public static void bindItemStackTexture(ItemStack itemStack) {
		bindIconSheet(itemStack.getItemSpriteNumber());
	}

	public static void bindIconSheet(int type) {
		final Minecraft mc = Minecraft.getMinecraft();
		if (mc != null) {
			TextureManager manager = mc.getTextureManager();
			bindIconSheet(manager, type);
		} else {
			LogHelper.warn("Binding texture to null client.");
		}
	}

	public static void bindIconSheet(TextureManager manager, int type) {
		final ResourceLocation resourceLocation = manager.getResourceLocation(type);
		manager.bindTexture(resourceLocation);
	}

	public static void bindTextureToClient(ResourceLocation texture) {
		if (texture != null) {
			final Minecraft mc = Minecraft.getMinecraft();
			if (mc != null) {
				mc.renderEngine.bindTexture(texture);
			} else {
				LogHelper.warn("Binding texture to null client.");
			}
		} else {
			LogHelper.warn("Invalid texture location '" + texture + "'");
		}
	}

	public static void bindDefaultTerrainTexture() {
		bindTextureToClient(TextureMap.locationBlocksTexture);
	}

	public static void bindDefaultItemsTexture() {
		bindTextureToClient(TextureMap.locationItemsTexture);
	}

	public static int getRandomNumber() {
		return 4;
	}
}
