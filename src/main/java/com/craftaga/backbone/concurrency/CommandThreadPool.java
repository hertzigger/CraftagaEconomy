package com.craftaga.backbone.concurrency;

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

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * The command thread pool regulates the thread commands from packages such as com.craftaga.*.commands
 * balancing atomic operations over an optimum amount of threads for the system it is running on
 *
 * @author Jonathan
 * @since 23/10/13
 */
public class CommandThreadPool {
    private static final CommandThreadPool INSTANCE = new CommandThreadPool();

    private ConcurrentLinkedDeque<Command> commandDeque;

    private CommandThreadPool()
    {
        commandDeque = new ConcurrentLinkedDeque<Command>();
    };

    public static CommandThreadPool getInstance() {
        return INSTANCE;
    }

    public CommandThreadPool add(Command command)
    {
        commandDeque.offerLast(command);
        return this;
    }

    public CommandThreadPool addPriority(Command command)
    {
        commandDeque.offerFirst(command);
        return this;
    }

    protected Command getNextCommand()
    {
        return commandDeque.poll();
    }
}
