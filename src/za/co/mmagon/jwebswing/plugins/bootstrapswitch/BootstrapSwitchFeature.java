package za.co.mmagon.jwebswing.plugins.bootstrapswitch;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.html.Input;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * Creates toast messages
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
public class BootstrapSwitchFeature extends Feature<BootstrapSwitchOptions, BootstrapSwitchFeature>
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new BootstrapSwitchFeature
	 */
	public BootstrapSwitchFeature(BootstrapSwitchCheckBox component)
	{
		super("BootstrapSelectFeature", component);
	}

	/*
	 * Constructs a new BootstrapSwitchFeature
	 */
	public BootstrapSwitchFeature(BootstrapSwitchRadioButton component)
	{
		super("BootstrapSelectFeature", component);
	}


	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().getJQueryID() + "bootstrapSwitch(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}

	/**
	 * Returns the options
	 *
	 * @return
	 */
	@Override
	public BootstrapSwitchOptions getOptions()
	{
		if (super.getOptions() == null)
		{
			setOptions(new BootstrapSwitchOptions((Input) getComponent()));
		}
		return super.getOptions();
	}

}
