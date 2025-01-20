package net.jack.flintlocks.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jack.flintlocks.Flintlocks;
import net.jack.flintlocks.block.modBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class modItemGroups {

    public static final ItemGroup FLINTLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Flintlocks.MOD_ID, "flintlocks"),
           FabricItemGroup.builder().icon(() -> new ItemStack(modItems.SINGLE_BARREL_FLINTLOCK))
                   .displayName(Text.translatable("itemgroup.flintlocks.flintlocks"))
                   .entries((displayContext, entries) -> {
                       entries.add(modBlocks.XBOX);
                       entries.add(modBlocks.GUNPOWDERBLOCK);
                       entries.add(modItems.SINGLE_BARREL_FLINTLOCK);
                       entries.add(modItems.IRON_BULLET);
                   }).build());





    public static void registerItemGroups() {
        Flintlocks.LOGGER.info("Item Groups from:" + Flintlocks.MOD_ID);

    }
}
