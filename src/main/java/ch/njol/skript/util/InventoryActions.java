/*
 *   This file is part of Skript.
 *
 *  Skript is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Skript is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Skript.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * 
 * Copyright 2011-2016 Peter Güttinger and contributors
 * 
 */

package ch.njol.skript.util;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.block.Biome;
import org.bukkit.event.inventory.InventoryAction;
import org.eclipse.jdt.annotation.Nullable;

import ch.njol.skript.localization.Language;
import ch.njol.skript.localization.LanguageChangeListener;
import ch.njol.skript.localization.Noun;

/**
 * Inventory action utils...
 */
public class InventoryActions {
	
	private final static EnumUtils<InventoryAction> util = new EnumUtils<InventoryAction>(InventoryAction.class, "inventory actions");
	
	public static @Nullable InventoryAction parse(String s) {
		return util.parse(s);
	}
	
	public static String getAllNames() {
		return util.getAllNames();
	}
	
	public static String toString(final InventoryAction action, final int flags) {
		return util.toString(action, flags);
	}
}
