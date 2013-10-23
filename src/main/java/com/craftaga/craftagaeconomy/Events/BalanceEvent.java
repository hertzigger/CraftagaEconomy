package com.craftaga.craftagaeconomy.Events;

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

import com.craftaga.backbone.events.CommandEvent;
import com.craftaga.backbone.events.Event;
import com.craftaga.craftagaeconomy.commands.CheckBalanceCommand;
import org.bukkit.command.CommandSender;

/**
 * description
 *
 * @author Jonathan
 * @since 23/10/13
 */
public class BalanceEvent extends CommandEvent {

    public BalanceEvent()
    {
        super(Event.EVENT_CHECK_BALANCE);
        this.commands.add(new CheckBalanceCommand());
    }
}
