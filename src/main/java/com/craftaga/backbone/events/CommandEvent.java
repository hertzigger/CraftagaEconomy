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

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

/**
 * description
 *
 * @author Jonathan
 * @since 23/10/13
 */
public abstract class CommandEvent extends Event {
    protected CommandSender sender;
    protected String label;
    protected String[] args;
    protected Command command;

    protected CommandEvent(int event) {
        super(event);
    }

    public CommandSender getSender() {
        return sender;
    }

    public void setSender(CommandSender sender) {
        this.sender = sender;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String[] getArgs() {
        return args;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
