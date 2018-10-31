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

import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.forms.groups.BSComponentFormGroupOptions;
import com.jwebmp.plugins.bootstrap.forms.groups.sets.BSFormCheckInput;

import java.util.Objects;

/**
 * Turn checkboxes and radio buttons into toggle switches. Created by Mattia Larentis, maintained by Emanuele Marchi and Peter Stein with the help of the community.
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
@ComponentInformation(name = "Bootstrap Switch Check Box",
		description = "Turn checkboxes    and radio buttons    into toggle switches  ",
		url = "https://github.com/GedMarc/JWebMP-Bootstrap-Switch")
public class BootstrapSwitchCheckBox
		extends BSFormCheckInput<BootstrapSwitchCheckBox>
{


	/**
	 * The feature for this select
	 */
	private BootstrapSwitchFeature feature;

	/*
	 * Constructs a new BootstrapSwitchCheckBox
	 */
	public BootstrapSwitchCheckBox()
	{
		addFeature(getFeature());
		setChecked(true);
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
	public BootstrapSwitchCheckBox setFeature(BootstrapSwitchFeature feature)
	{
		this.feature = feature;
		return this;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void preConfigure()
	{
		super.preConfigure();
		getClasses().add(BSComponentFormGroupOptions.Form_Control);

	}

	@Override
	public BootstrapSwitchOptions getOptions()
	{
		return getFeature().getOptions();
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
		if (!(o instanceof BootstrapSwitchCheckBox))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		BootstrapSwitchCheckBox that = (BootstrapSwitchCheckBox) o;
		return Objects.equals(getFeature(), that.getFeature());
	}
}
