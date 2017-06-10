package za.co.mmagon.jwebswing.plugins.bootstrapswitch;

import org.junit.Test;
import za.co.mmagon.BaseTestClass;

/**
 *
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
        BootstrapSwitchFeature bsf = new BootstrapSwitchFeature(getInstance().getBody());
        bsf.getOptions().setBaseClass("fa fa-bell-o");
        System.out.println(bsf.renderJavascript());
    }
}
