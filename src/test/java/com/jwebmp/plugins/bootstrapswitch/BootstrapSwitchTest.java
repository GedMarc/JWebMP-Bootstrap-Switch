/*
 * Copyright (C) 2017 Marc Magon
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

package com.jwebmp.plugins.bootstrapswitch;

import com.jwebmp.Page;
import com.jwebmp.plugins.bootstrap.forms.BSForm;
import org.junit.jupiter.api.Test;

/**
 * @author Marc Magon
 */
public class BootstrapSwitchTest

{

	public BootstrapSwitchTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		BootstrapSwitchCheckBox bs = new BootstrapSwitchCheckBox();
		bs.getOptions()
		  .setDisabled(true);
		System.out.println(bs.toString(true));
	}

	@Test
	public void testSomeMethod2()
	{
		BootstrapSwitchCheckBox bs = new BootstrapSwitchCheckBox();
		bs.setChecked(true);
		bs.getOptions()
		  .setDisabled(true);
		System.out.println(bs.toString(true));
	}

	@Test
	public void testRadioButton()
	{
		BootstrapSwitchRadioButton bs = new BootstrapSwitchRadioButton();
		bs.getOptions()
		  .setAnimate(true);
		System.out.println(bs.toString(true));
	}

	@Test
	public void testRadioButtonJS()
	{
		BootstrapSwitchRadioButton bs = new BootstrapSwitchRadioButton();
		bs.getOptions()
		  .setAnimate(true);
		System.out.println(bs.renderJavascript());
	}

	@Test
	public void testJavaScript()
	{
		BootstrapSwitchCheckBox bs = new BootstrapSwitchCheckBox();
		bs.getOptions()
		  .setDisabled(true);
		System.out.println(bs.renderJavascript());
	}

	@Test
	public void testAngular()
	{
		BootstrapSwitchCheckBox bs = new BootstrapSwitchCheckBox();
		bs.bind("angular.variable");
		bs.setName("Name");
		System.out.println(bs.toString(true));
	}

	@Test
	public void testHtml()
	{
		Page p = new Page();
		BSForm form = new BSForm();
		BootstrapSwitchCheckBox bs = new BootstrapSwitchCheckBox();
		p.getOptions()
		 .setDynamicRender(false);
		p.getBody()
		 .add(form);
		form.add(bs);
		System.out.println(p.toString(true));
	}
}
