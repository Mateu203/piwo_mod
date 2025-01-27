package org.sigma.piwo_mod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodPropeties {
    public static final FoodProperties PIWO = new FoodProperties.Builder().nutrition(5).saturationModifier(1)
            .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 200, 200), 1).build();
}
