package za.co.mmagon.jwebswing.plugins.bootstrapswitch;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.base.html.Input;

/**
 * @author Marc Magon
 */
public class BootstrapSwitchOptionsTest
{
	
	public BootstrapSwitchOptionsTest()
	{
	}
	
	@Test
	public void testSomeMethod()
	{
		Input toCheckInput = new Input<>();
		BootstrapSwitchOptions bso = new BootstrapSwitchOptions(toCheckInput);
		bso.setInverse(true);
		System.out.println(bso);
	}
	
}
