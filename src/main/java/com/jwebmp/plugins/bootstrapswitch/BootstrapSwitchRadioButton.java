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

import com.jwebmp.core.base.html.inputs.InputRadioType;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.forms.groups.BSComponentFormGroupOptions;

import java.util.Objects;

/**
 * Turn checkboxes and radio buttons into toggle switches. Created by Mattia Larentis, maintained by Emanuele Marchi and Peter Stein with
 * the help of the community.
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
@ComponentInformation(name = "Bootstrap Switch Radio Button",
		description = "Turn checkboxes    and radio buttons    into toggle switches  ",
		url = "https://github.com/GedMarc/JWebMP-Bootstrap-Switch")
public class BootstrapSwitchRadioButton
		extends InputRadioType<BootstrapSwitchRadioButton>
{

	private static final long serialVersionUID = 1L;
	/**
	 * The feature for this select
	 */
	private BootstrapSwitchFeature feature;

	/*
	 * Constructs a new BootstrapSwitch
	 */
	public BootstrapSwitchRadioButton()
	{
		addFeature(getFeature());
	}

	/**
	 * Returns the feature for this component
	 *
	 * @return
	 */
	public BootstrapSwitchFeature getFeature()
	{
		if (feature == null)
		{
			feature = new BootstrapSwitchFeature(this);
		}
		return feature;
	}

	/**
	 * Sets the feature for this bootstrap drop down
	 *
	 * @param feature
	 *
	 * @return
	 */
	public BootstrapSwitchRadioButton setFeature(BootstrapSwitchFeature feature)
	{
		this.feature = feature;
		return this;
	}

	@Override
	public void preConfigure()
	{
		super.preConfigure();
		getAttributes().remove(BSComponentFormGroupOptions.Form_Control.toString());
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getFeature());
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof BootstrapSwitchRadioButton))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		BootstrapSwitchRadioButton that = (BootstrapSwitchRadioButton) o;
		return Objects.equals(getFeature(), that.getFeature());
	}

	@Override
	public BootstrapSwitchOptions getOptions()
	{
		return getFeature().getOptions();
	}
}
