/* $RCSfile$
 * $Author$    
 * $Date$    
 * $Revision$
 * 
 * Copyright (C) 2003-2007  The Chemistry Development Kit (CDK) project
 * 
 * Contact: cdk-devel@lists.sourceforge.net
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA. 
 * 
 */
package org.openscience.cdk.test.math;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.openscience.cdk.math.MathTools;
import org.openscience.cdk.test.CDKTestCase;

/**
 * @cdk.module test-standard
 */
public class MathToolsTest extends CDKTestCase {

    public MathToolsTest(String name) {
        super(name);
    }

    public void setUp() {}

    public static Test suite() {
        return new TestSuite(MathToolsTest.class);
    }
    
    public void testMax_arraydouble() {
        double[] doubles = { 2.0, 1.0, 3.0, 5.0, 4.0};
        assertEquals(5.0, MathTools.max(doubles), 0.001);
    }
    
    public void testMin_arraydouble() {
    	double[] doubles = { 2.0, 1.0, 3.0, 5.0, 4.0};
        assertEquals(1.0, MathTools.min(doubles), 0.001);
    }
    
    public void testMax_arrayint() {
        int[] ints = { 1, 2, 3, 4, 5};
        assertEquals(5, MathTools.max(ints));
    }
    
    public void testMin_arrayint() {
        int[] ints = { 1, 2, 3, 4, 5};
        assertEquals(1, MathTools.min(ints));
    }
    
    public void testIsEven_int() {
        assertTrue(MathTools.isEven(2));
        assertTrue(MathTools.isEven(208));
    }
    
    public void testIsOdd_int() {
        assertTrue(MathTools.isOdd(1));
        assertTrue(MathTools.isOdd(3));
        assertTrue(MathTools.isOdd(209));
    }
    
}
