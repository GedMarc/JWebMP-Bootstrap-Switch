package za.co.mmagon.jwebswing.plugins.bootstrapswitch;

import za.co.mmagon.jwebswing.base.html.InputRadioType;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.BSComponentFormGroupOptions;

import java.util.Objects;

/**
 * Turn checkboxes and radio buttons into toggle switches. Created by Mattia Larentis, maintained by Emanuele Marchi and Peter Stein with the help of the community.
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
@ComponentInformation(name = "Bootstrap Switch Radio Button", description = "Turn checkboxes    and radio buttons    into toggle switches  ",
		url = "https://github.com/GedMarc/JWebSwing-Bootstrap-Switch")
public class BootstrapSwitchRadioButton extends InputRadioType<BootstrapSwitchRadioButton>
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
	public BootstrapSwitchOptions getOptions()
	{
		return getFeature().getOptions();
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
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getFeature());
	}
}
