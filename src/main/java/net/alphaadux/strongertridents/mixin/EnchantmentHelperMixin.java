package net.alphaadux.strongertridents.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.enchantment.*;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.WeightedList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.List;

@Mixin(EnchantmentHelper.class)
public class EnchantmentHelperMixin {
    @ModifyReturnValue(method="getPossibleEntries", at=@At("RETURN"))
    private static List<EnchantmentLevelEntry> modifyPossibleEntries(List<EnchantmentLevelEntry> original) {

        return original;
    }
}
