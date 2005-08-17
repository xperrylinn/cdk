/*
 *  $RCSfile$
 *  $Author$
 *  $Date$
 *  $Revision$
 *
 *  Copyright (C) 1997-2005  The Chemistry Development Kit (CDK) project
 *
 *  Contact: cdk-devel@lists.sourceforge.net
 *
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public License
 *  as published by the Free Software Foundation; either version 2.1
 *  of the License, or (at your option) any later version.
 *  All I ask is that proper credit is given for my work, which includes
 *  - but is not limited to - adding the above copyright notice to the beginning
 *  of your source code files, and to any copyright notice that you may distribute
 *  with programs based on this work.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 */
package org.openscience.cdk.controller;

import java.util.Vector;

import org.openscience.cdk.ChemModel;
import org.openscience.cdk.renderer.Renderer2DModel;
import org.openscience.cdk.tools.LoggingTool;

/**
 *  Class that acts on MouseEvents and KeyEvents.
 *
 *@author         steinbeck
 *@author         egonw
 *@cdk.created    2. Mai 2005
 *@cdk.keyword    mouse events
 *@cdk.require    java1.4+
 */
public class Controller2D extends SimpleController2D
{
	/**
	 *  Constructs a controller that performs operations on the AtomContainer when
	 *  actions are detected from the MouseEvents.
	 *
	 *@param  chemModel  Description of the Parameter
	 *@param  r2dm       Description of the Parameter
	 *@param  c2dm       Description of the Parameter
	 */
	public Controller2D(ChemModel chemModel, Renderer2DModel r2dm, Controller2DModel c2dm)
	{
		super(r2dm, c2dm);
		this.chemModel = chemModel;
	}


	/**
	 *  Constructor for the Controller2D object
	 *
	 *@param  chemModel  Description of the Parameter
	 *@param  r2dm       Description of the Parameter
	 */
	public Controller2D(ChemModel chemModel, Renderer2DModel r2dm)
	{
		super(r2dm, new Controller2DModel());
		this.chemModel = chemModel;
	}



}

