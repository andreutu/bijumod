package net.andrei.bijumod.painting;

import net.andrei.bijumod.BijuMod;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraft.world.entity.decoration.Painting;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<Motive> PAINTINGS_MOVTIES =
            DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, BijuMod.MOD_ID);

    public static final RegistryObject<Motive> BIJU_BOSS =
            PAINTINGS_MOVTIES.register("biju_boss", () -> new Motive(32, 48));

    public static final RegistryObject<Motive> BIJU_EARLESS =
            PAINTINGS_MOVTIES.register("biju_earless", () -> new Motive(32, 48));

    public static final RegistryObject<Motive> BIJU_MAD =
            PAINTINGS_MOVTIES.register("biju_mad", () -> new Motive(32, 48));

    public static final RegistryObject<Motive> BIJU_SLEEP =
            PAINTINGS_MOVTIES.register("biju_sleep", () -> new Motive(32, 48));

    public static final RegistryObject<Motive> GARFIELD_SCARED =
            PAINTINGS_MOVTIES.register("garfield_scared", () -> new Motive(64, 48));

    public static final RegistryObject<Motive> GARFIELD_SLEEP =
            PAINTINGS_MOVTIES.register("garfield_sleep", () -> new Motive(64, 48));

    public static final RegistryObject<Motive> GARFIELD_CHUBI =
            PAINTINGS_MOVTIES.register("garfield_chubi", () -> new Motive(32, 48));

    public static final RegistryObject<Motive> GARFIELD_CUTE =
            PAINTINGS_MOVTIES.register("garfield_cute", () -> new Motive(32, 48));

    public static void register(IEventBus eventBus) {
        PAINTINGS_MOVTIES.register(eventBus);
    }
}
