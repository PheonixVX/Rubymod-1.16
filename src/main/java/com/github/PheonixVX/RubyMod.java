package com.github.PheonixVX;

import com.github.PheonixVX.blocks.RegisterBlocks;
import com.github.PheonixVX.items.RegisterItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RubyMod implements ModInitializer {

    public static final ItemGroup RUBY_GROUP = FabricItemGroupBuilder.create(
            new Identifier("rubymod", "rubygroup"))
            .icon(() -> new ItemStack(RegisterItems.RUBY))
            .build();

    @Override
    public void onInitialize() {
        RegisterBlocks.register();
        RegisterItems.register();

        Registry.BIOME.forEach(GenerateOres::biomeFeature);
        RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> GenerateOres.biomeFeature(biome));
    }
}
