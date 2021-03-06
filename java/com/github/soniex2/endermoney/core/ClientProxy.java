package com.github.soniex2.endermoney.core;

import com.github.soniex2.endermoney.core.block.BlockEnderOreRenderer;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	public static int renderPass, oreRenderType;

	@Override
	public void setCustomRenderers() {
		oreRenderType = RenderingRegistry.getNextAvailableRenderId();
		RenderingRegistry.registerBlockHandler(new BlockEnderOreRenderer());
	}

}
