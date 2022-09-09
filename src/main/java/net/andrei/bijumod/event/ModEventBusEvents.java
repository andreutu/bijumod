package net.andrei.bijumod.event;

import net.andrei.bijumod.BijuMod;
import net.andrei.bijumod.event.loot.WeedFromFernAdditionModifier;
import net.andrei.bijumod.event.loot.WeedFromLargeFernAdditionModifier;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = BijuMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new WeedFromFernAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(BijuMod.MOD_ID,"weed_from_fern")),
                new WeedFromLargeFernAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(BijuMod.MOD_ID,"weed_from_large_fern"))
        );
    }
}
