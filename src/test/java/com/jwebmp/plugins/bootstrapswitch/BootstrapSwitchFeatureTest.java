package com.jwebmp.plugins.bootstrapswitch;

import org.junit.jupiter.api.Test;

/**
 * @author Marc Magon
 */
public class BootstrapSwitchFeatureTest

{

	public BootstrapSwitchFeatureTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		BootstrapSwitchFeature bsf = new BootstrapSwitchFeature(new BootstrapSwitchRadioButton());
		bsf.getOptions()
		   .setBaseClass("fa fa-bell-o");
		System.out.println(bsf.renderJavascript());
	}
}
