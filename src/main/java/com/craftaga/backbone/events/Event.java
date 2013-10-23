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

import com.craftaga.backbone.commands.Command;

import java.util.LinkedList;
import java.util.List;

/**
 * description
 *
 * @author Jonathan
 * @since 23/10/13
 */
public abstract class Event implements BackboneEvent {
    public static final int EVENT_CHECK_BALANCE = 1;

    protected int event;
    protected LinkedList<Command> commands;

    protected Event(int event)
    {
        this.event = event;
        commands = new LinkedList<Command>();
    }

    @Override
    public List<Command> getCommands() {
        return commands;
    }
}
