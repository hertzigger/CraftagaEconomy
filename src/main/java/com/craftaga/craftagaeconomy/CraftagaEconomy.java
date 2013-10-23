/**
 * CraftagaEconomy Plugin for bukkit
 * Copyright (C) 2013 Craftaga.com <hertzigger@craftaga.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.craftaga.craftagaeconomy;

import com.craftaga.backbone.events.CommandEventFactory;
import com.craftaga.backbone.events.Event;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main entry point for the plugin
 *
 * @author hertzigger
 * @since  20/10/2013
 */

public class CraftagaEconomy extends JavaPlugin {
    public static void main(String[] args)
    {
        System.out.println("Hello World!!!");
    }

    public void onEnable()
    {
        getLogger().info("Craftaga Economy Enabled");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        Event event = CommandEventFactory.getInstance().getEvent(sender, command, label, args);
        if (command.getName().equals("ccon")) {
            getLogger().info("ccon successful");
            return true;
        }
        return false;
    }

    public int getInt()
    {
        return 1;
    }
}
