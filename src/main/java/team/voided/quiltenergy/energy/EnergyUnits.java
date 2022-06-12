package team.voided.quiltenergy.energy;

import team.voided.quiltenergy.HSV;
import team.voided.quiltenergy.QuiltEnergy;
import team.voided.quiltenergy.registry.EnergyRegistries;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;

public final class EnergyUnits {
	public static final EnergyUnit REDSTONE_FLUX = new EnergyUnit(1.0D, QuiltEnergy.modLoc("redstone_flux_unit"), Component.translatable("quilt_energy.unit.redstone_flux"), new HSV(0, 100, 100));
	public static final EnergyUnit PURE_AMETHYST = new EnergyUnit(4.0D, QuiltEnergy.modLoc("pure_amethyst_unit"), Component.translatable("quilt_energy.unit.pure_amethyst"), new HSV(295, 70, 100));

	public static void register() {
		Registry.register(EnergyRegistries.UNIT, REDSTONE_FLUX.id(), REDSTONE_FLUX);
		Registry.register(EnergyRegistries.UNIT, PURE_AMETHYST.id(), PURE_AMETHYST);
	}
}