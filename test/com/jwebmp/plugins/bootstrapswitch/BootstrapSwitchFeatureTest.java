package com.jwebmp.plugins.bootstrapswitch;

import com.jwebmp.BaseTestClass;
import org.junit.jupiter.api.Test;

/**
 * @author Marc Magon
 */
public class BootstrapSwitchFeatureTest
		extends BaseTestClass
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
