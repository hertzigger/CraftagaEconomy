package com.craftaga.backbone.events;

/*
 * *
 *  * CraftagaEconomy Plugin for bukkit
 *  * Copyright (C) 2013 Craftaga.com <hertzigger@craftaga.com>
 *  *
 *  * This program is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * This program is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

import com.craftaga.craftagaeconomy.Events.BalanceEvent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

/**
 * description
 *
 * @author Jonathan
 * @since 23/10/13
 */
public class CommandEventFactory {

    private static final CommandEventFactory INSTANCE = new CommandEventFactory();

    private CommandEventFactory() {};

    public static CommandEventFactory getInstance() {
        return INSTANCE;
    }

    public Event getEvent(CommandSender sender, Command command, String label, String[] args)
    {
        CommandEvent event = null;

        if(command.equals("ccBalance")) {
            event = new BalanceEvent();
            event.setSender(sender);
            event.setLabel(label);
            event.setArgs(args);
            event.setCommand(command);
        }

        return event;
    }
}
