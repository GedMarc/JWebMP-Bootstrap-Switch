package za.co.mmagon.jwebswing.plugins.bootstrapswitch;

import za.co.mmagon.jwebswing.base.html.InputCheckBoxType;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;

/**
 * Turn checkboxes and radio buttons into toggle switches. Created by Mattia Larentis, maintained by Emanuele Marchi and Peter Stein with the help of the community.
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
@ComponentInformation(name = "Bootstrap Switch Check Box", description = "Turn checkboxes    and radio buttons    into toggle switches  ",
        url = "https://github.com/GedMarc/JWebSwing-Bootstrap-Switch")
public class BootstrapSwitchCheckBox extends InputCheckBoxType<BootstrapSwitchCheckBox>
{

    private static final long serialVersionUID = 1L;
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

    @Override
    public void preConfigure()
    {
        super.preConfigure();
        if (!BootstrapPageConfigurator.isBootstrap4())
        {
            getAttributes().remove("form-control");
        }
        else if (BootstrapPageConfigurator.isBootstrap4())
        {
            getAttributes().remove("form-control");
        }
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
    public BootstrapSwitchOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
