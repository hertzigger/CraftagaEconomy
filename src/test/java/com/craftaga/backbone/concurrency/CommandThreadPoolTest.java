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
import com.craftaga.craftagaeconomy.commands.CheckBalanceCommand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * description
 *
 * @author Jonathan
 * @since 23/10/13
 */
public class CommandThreadPoolTest {
    /**
     * Test that the same instance is returned
     *
     * @throws Exception
     */
    @Test
    public void testGetInstance() throws Exception {
        CommandThreadPool ctp = CommandThreadPool.getInstance();
        CommandThreadPool ctp1 = CommandThreadPool.getInstance();

        assertEquals(ctp, ctp1);
    }

    /**
     * Tests whether a command added to the queue comes out first
     *
     * @throws Exception
     */
    @Test
    public void testAddSingleItem() throws Exception {
        Command command = new CheckBalanceCommand();
        CommandThreadPool.getInstance().add(command);
        assertEquals(command, CommandThreadPool.getInstance().getNextCommand());
    }

    /**
     * Tests whether items added to the thread pool come out in order
     *
     * @throws Exception
     */
    @Test
    public void testAddMultipleItems() throws Exception {
        Command command = new CheckBalanceCommand();
        Command command1 = new CheckBalanceCommand();
        Command command2 = new CheckBalanceCommand();

        CommandThreadPool.getInstance().add(command).add(command1).add(command2);

        assertEquals(command, CommandThreadPool.getInstance().getNextCommand());
        assertEquals(command1, CommandThreadPool.getInstance().getNextCommand());
        assertEquals(command2, CommandThreadPool.getInstance().getNextCommand());
    }

    public void testAddPriority() throws Exception {

    }
}
