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

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Testing the main entry points for the application
 *
 * @author hertzigger
 * @since  20/10/2013
 */
public class CraftagaEconomyTest {
    @Test
    public void testGetInt() throws Exception {
        CraftagaEconomy testClass = new CraftagaEconomy();
        assertEquals(1,testClass.getInt());
    }

}
