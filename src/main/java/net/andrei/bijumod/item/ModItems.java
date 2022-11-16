package net.andrei.bijumod.item;

import net.andrei.bijumod.BijuMod;
import net.andrei.bijumod.block.ModBlocks;
import net.andrei.bijumod.sound.ModSounds;
import net.minecraft.world.item.*;
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

    // Music Discs
    
    public static final RegistryObject<Item> MUSIC_DISC_VINE_VARA = ITEMS.register("music_disc_vine_vara",
            () -> new RecordItem(4, ModSounds.VINE_VARA,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> MUSIC_DISC_BUNA_DIMINEATA = ITEMS.register("music_disc_buna_dimineata",
            () -> new RecordItem(4, ModSounds.BUNA_DIMINEATA,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> MUSIC_DISC_PE_CIMPOI = ITEMS.register("music_disc_pe_cimpoi",
            () -> new RecordItem(4, ModSounds.PE_CIMPOI,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> MUSIC_DISC_ZILELE_MELE = ITEMS.register("music_disc_zilele_mele",
            () -> new RecordItem(4, ModSounds.ZILELE_MELE,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> MUSIC_DISC_CHEF_DE_CHEF = ITEMS.register("music_disc_chef_de_chef",
            () -> new RecordItem(4, ModSounds.CHEF_DE_CHEF,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> MUSIC_DISC_LA_INIMA = ITEMS.register("music_disc_la_inima",
            () -> new RecordItem(4, ModSounds.LA_INIMA,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> MUSIC_DISC_112 = ITEMS.register("music_disc_112",
            () -> new RecordItem(4, ModSounds._112,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> MUSIC_DISC_MA_INSOR = ITEMS.register("music_disc_ma_insor",
            () -> new RecordItem(4, ModSounds.MA_INSOR,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
