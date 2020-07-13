package com.github.PheonixVX.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterBlocks {

    public static final Block RUBY_ORE = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f).breakByTool(FabricToolTags.PICKAXES, 2));
    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).breakByTool(FabricToolTags.PICKAXES, 2));

    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier("rubymod", "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.BLOCK, new Identifier("rubymod", "ruby_block"), RUBY_BLOCK);
    }
}
