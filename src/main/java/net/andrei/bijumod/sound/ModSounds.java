package net.andrei.bijumod.sound;

import net.andrei.bijumod.BijuMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BijuMod.MOD_ID);

    public static RegistryObject<SoundEvent> VINE_VARA = registerSoundEffect("vine_vara");
    public static RegistryObject<SoundEvent> BUNA_DIMINEATA = registerSoundEffect("buna_dimineata");
    public static RegistryObject<SoundEvent> PE_CIMPOI = registerSoundEffect("pe_cimpoi");
    public static RegistryObject<SoundEvent> ZILELE_MELE = registerSoundEffect("zilele_mele");
    public static RegistryObject<SoundEvent> CHEF_DE_CHEF = registerSoundEffect("chef_de_chef");
    public static RegistryObject<SoundEvent> LA_INIMA = registerSoundEffect("la_inima");
    public static RegistryObject<SoundEvent> _112 = registerSoundEffect("_112");
    public static RegistryObject<SoundEvent> MA_INSOR = registerSoundEffect("ma_insor");

    private static RegistryObject<SoundEvent> registerSoundEffect(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(BijuMod.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
