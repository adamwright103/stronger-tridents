package net.alphaadux.strongertridents.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.enchantment.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.TridentItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;


@Mixin(Enchantment.class)
public abstract class ExtraTridentEnchantsMixin {
	@ModifyReturnValue(method = "isAcceptableItem", at = @At("RETURN"))
	public boolean isAcceptableItem(boolean original, ItemStack stack) {
		Enchantment enchantment = (Enchantment) (Object) this;
		if (stack.getItem() instanceof TridentItem) {
			return true;
		}
		return original;
	}
}