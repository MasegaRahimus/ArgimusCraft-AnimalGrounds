package net.masega.animalgrounds.item;

import net.masega.animalgrounds.AnimalGrounds;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AnimalGrounds.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ANIMAL_GROUNDS_TABS = CREATIVE_MODE_TABS.register("animal_grounds_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GAITENITE.get()))
                    .title(Component.translatable("creativetab.animal_grounds_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.GAITENITE.get());
                        pOutput.accept(ModItems.RAW_GAITENITE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
