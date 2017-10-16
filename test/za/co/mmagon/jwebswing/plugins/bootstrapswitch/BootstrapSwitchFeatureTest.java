package za.co.mmagon.jwebswing.plugins.bootstrapswitch;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;

/**
 * @author Marc Magon
 */
public class BootstrapSwitchFeatureTest extends BaseTestClass
{
	
	public BootstrapSwitchFeatureTest()
	{
	}
	
	@Test
	public void testSomeMethod()
	{
		BootstrapSwitchFeature bsf = new BootstrapSwitchFeature(new BootstrapSwitchRadioButton());
		bsf.getOptions().setBaseClass("fa fa-bell-o");
		System.out.println(bsf.renderJavascript());
	}
}
