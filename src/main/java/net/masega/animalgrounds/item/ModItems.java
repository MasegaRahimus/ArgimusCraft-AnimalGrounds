package net.masega.animalgrounds.item;

import net.masega.animalgrounds.AnimalGrounds;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AnimalGrounds.MOD_ID);

    public static final  RegistryObject<Item> GAITENITE = ITEMS.register("gaitenite",
            () -> new Item(new Item.Properties()));
    public static final  RegistryObject<Item> RAW_GAITENITE = ITEMS.register("raw_gaitenite",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
