package net.andrei.bijumod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraftforge.registries.ForgeRegistries;

public class ModFoods {
    public static final FoodProperties WEED = (new FoodProperties.Builder().fast().nutrition(2).saturationMod(0.36F)
            .effect(new MobEffectInstance(MobEffects.HARM, 10, 0), 0.8F)).build();

    public static final FoodProperties JOINT = (new FoodProperties.Builder().fast().nutrition(6).saturationMod(0.5F)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 300, 2), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 2), 0.3F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 0.1F).build());
}
