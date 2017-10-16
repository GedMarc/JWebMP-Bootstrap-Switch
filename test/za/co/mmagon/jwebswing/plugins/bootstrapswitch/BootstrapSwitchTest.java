package za.co.mmagon.jwebswing.plugins.bootstrapswitch;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.BSForm;

/**
 * @author Marc Magon
 */
public class BootstrapSwitchTest extends BaseTestClass
{
	
	public BootstrapSwitchTest()
	{
	}
	
	@Test
	public void testSomeMethod()
	{
		BootstrapSwitchCheckBox bs = new BootstrapSwitchCheckBox();
		bs.getOptions().setDisabled(true);
		System.out.println(bs.toString(true));
	}
	
	@Test
	public void testSomeMethod2()
	{
		BootstrapSwitchCheckBox bs = new BootstrapSwitchCheckBox();
		bs.setChecked(true);
		bs.getOptions().setDisabled(true);
		System.out.println(bs.toString(true));
	}
	
	@Test
	public void testRadioButton()
	{
		BootstrapSwitchRadioButton bs = new BootstrapSwitchRadioButton();
		bs.getOptions().setAnimate(true);
		System.out.println(bs.toString(true));
	}
	
	@Test
	public void testRadioButtonJS()
	{
		BootstrapSwitchRadioButton bs = new BootstrapSwitchRadioButton();
		bs.getOptions().setAnimate(true);
		System.out.println(bs.renderJavascript());
	}
	
	@Test
	public void testJavaScript()
	{
		BootstrapSwitchCheckBox bs = new BootstrapSwitchCheckBox();
		bs.getOptions().setDisabled(true);
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
		Page p = getInstance();
		BSForm form = new BSForm();
		BootstrapSwitchCheckBox bs = new BootstrapSwitchCheckBox();
		p.getOptions().setDynamicRender(false);
		p.getBody().add(form);
		form.add(bs);
		System.out.println(p.toString(true));
	}
}
