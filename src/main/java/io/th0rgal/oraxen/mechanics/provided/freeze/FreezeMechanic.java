package io.th0rgal.oraxen.mechanics.provided.freeze;

import io.th0rgal.oraxen.OraxenPlugin;
import io.th0rgal.oraxen.mechanics.Mechanic;
import io.th0rgal.oraxen.mechanics.MechanicFactory;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.NamespacedKey;
import org.bukkit.persistence.PersistentDataType;

public class FreezeMechanic extends Mechanic {
    private final int freezeRange;
    public static final NamespacedKey NAMESPACED_KEY = new NamespacedKey(OraxenPlugin.get(), "freeze");

    public FreezeMechanic(MechanicFactory mechanicFactory, ConfigurationSection section) {
        super(mechanicFactory, section,
                item -> item.setCustomTag(NAMESPACED_KEY, PersistentDataType.INTEGER, section.getInt("range")));
        this.freezeRange = section.getInt("range");
    }

    public int freezeRange() {
        return freezeRange;
    }
}