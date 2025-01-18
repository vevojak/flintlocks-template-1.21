package net.jack.flintlocks.item;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jack.flintlocks.Flintlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class modItems {

    public static final Item SINGLE_BARREL_FLINTLOCK = registerItems("single_barrel_flintlock", new Item(new Item.Settings()));
    public static final Item IRON_BULLET = registerItems("iron_bullet", new Item(new Item.Settings()));

    private static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Flintlocks.MOD_ID, name), item);
    }

    public static void RegisterModItems() {
        Flintlocks.LOGGER.info("Mod items from: " + Flintlocks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register( entries -> {
         entries.add(SINGLE_BARREL_FLINTLOCK);
         entries.add(IRON_BULLET);
        } );
    }
}
