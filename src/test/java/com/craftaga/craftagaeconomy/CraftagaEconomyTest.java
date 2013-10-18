package com.craftaga.craftagaeconomy;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created with IntelliJ IDEA.
 * User: Jonathan
 * Date: 14/09/13
 * Time: 15:43
 * To change this template use File | Settings | File Templates.
 */
public class CraftagaEconomyTest {
    @Test
    public void testGetInt() throws Exception {
        CraftagaEconomy testClass = new CraftagaEconomy();
        assertEquals(1,testClass.getInt());
    }

}
