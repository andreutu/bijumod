package net.andrei.bijumod.item;

import net.andrei.bijumod.BijuMod;
import net.andrei.bijumod.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BijuMod.MOD_ID);

    public static final RegistryObject<Item> WEED = ITEMS.register("weed",
            () -> new ItemNameBlockItem(ModBlocks.WEED_PLANT.get(), new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.WEED)));

    public static final RegistryObject<Item> JOINT = ITEMS.register("joint",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.JOINT).stacksTo(16)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
