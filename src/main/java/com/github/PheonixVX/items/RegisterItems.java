package com.github.PheonixVX.items;

import com.github.PheonixVX.RubyMod;
import com.github.PheonixVX.blocks.RegisterBlocks;
import com.github.PheonixVX.materials.RubyArmorMaterial;
import com.github.PheonixVX.materials.RubyMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {

    public static final ToolMaterial rubyMaterial = new RubyMaterial();
    public static final ArmorMaterial rubyArmorMaterial = new RubyArmorMaterial();
    public static final Item RUBY = new Ruby_Item(new Item.Settings().group(RubyMod.RUBY_GROUP));
    public static final Item RUBY_HOE = new ItemHoe(rubyMaterial, 2, 4.0f, new Item.Settings().group(RubyMod.RUBY_GROUP));
    public static final Item RUBY_SWORD = new SwordItem(rubyMaterial, 6, 1.5f, new Item.Settings().group(RubyMod.RUBY_GROUP));
    public static final Item RUBY_PICKAXE = new ItemPickaxe(rubyMaterial, 4, 5.0f, new Item.Settings().group(RubyMod.RUBY_GROUP));
    public static final Item RUBY_SHOVEL = new ShovelItem(rubyMaterial, 2, 4.0f, new Item.Settings().group(RubyMod.RUBY_GROUP));
    public static final Item RUBY_AXE = new ItemAxe(rubyMaterial, 2, 4.0f, new Item.Settings().group(RubyMod.RUBY_GROUP));
    public static final Item RUBY_HELMET = new ArmorItem(rubyArmorMaterial, EquipmentSlot.HEAD, new Item.Settings().group(RubyMod.RUBY_GROUP));
    public static final Item RUBY_CHESTPLATE = new ArmorItem(rubyArmorMaterial, EquipmentSlot.CHEST, new Item.Settings().group(RubyMod.RUBY_GROUP));
    public static final Item RUBY_LEGGINGS = new ArmorItem(rubyArmorMaterial, EquipmentSlot.LEGS, new Item.Settings().group(RubyMod.RUBY_GROUP));
    public static final Item RUBY_BOOTS = new ArmorItem(rubyArmorMaterial, EquipmentSlot.FEET, new Item.Settings().group(RubyMod.RUBY_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("rubymod", "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier("rubymod", "ruby_ore"), new BlockItem(RegisterBlocks.RUBY_ORE, new Item.Settings().group(RubyMod.RUBY_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("rubymod", "ruby_block"), new BlockItem(RegisterBlocks.RUBY_BLOCK, new Item.Settings().group(RubyMod.RUBY_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("rubymod", "ruby_hoe"), RUBY_HOE);
        Registry.register(Registry.ITEM, new Identifier("rubymod", "ruby_sword"), RUBY_SWORD);
        Registry.register(Registry.ITEM, new Identifier("rubymod", "ruby_pickaxe"), RUBY_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("rubymod", "ruby_shovel"), RUBY_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("rubymod", "ruby_axe"), RUBY_AXE);
        Registry.register(Registry.ITEM, new Identifier("rubymod", "ruby_helmet"), RUBY_HELMET);
        Registry.register(Registry.ITEM, new Identifier("rubymod", "ruby_chestplate"), RUBY_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("rubymod", "ruby_leggings"), RUBY_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("rubymod", "ruby_boots"), RUBY_BOOTS);
    }
}
