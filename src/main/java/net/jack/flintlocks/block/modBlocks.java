package net.jack.flintlocks.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jack.flintlocks.Flintlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class modBlocks {

    public static final Block XBOX = registerBlock("xbox",
            new Block(AbstractBlock.Settings.create().strength(100f).hardness(100f).sounds(BlockSoundGroup.NETHERITE)
            ));

    public static final Block GUNPOWDERBLOCK = registerBlock("gunpowder_block",
            new Block(AbstractBlock.Settings.create().strength(1f).hardness(1f).sounds(BlockSoundGroup.SAND)
            ));
    public static final Block GEMSTONE = registerBlock("gemstone",
            new Block(AbstractBlock
                    .Settings.create()
                    .strength(3f)
                    .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
                    .requiresTool()
            ));
    public static final Block GEMDEEPSTONE = registerBlock("gemdeepstone",
            new Block(AbstractBlock
                    .Settings.create()
                    .strength(3f)
                    .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
                    .requiresTool()
            ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Flintlocks.MOD_ID, name), block);
    }
    // registering placed block (i think)


    private static void registerBlockItem(String name, Block block) {
       Registry.register(Registries.ITEM, Identifier.of(Flintlocks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    // registering block as item


    public static void RegisterModBlocks() {
        Flintlocks.LOGGER.info("Mod blocks from: " + Flintlocks.MOD_ID);
    }
    // to read language and texture json files, also placing in creative window



}
