package za.co.mmagon.jwebswing.plugins.bootstrapswitch;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;

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
    public BootstrapSwitchFeature(ComponentHierarchyBase component)
    {
        super("BootstrapSelectFeature", component);
    }

    @Override
    protected void assignFunctionsToComponent()
    {
        addQuery(getComponent().getJQueryID() + "bootstrapSwitch(" + getOptions() + ");" + getNewLine());
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
            setOptions(new BootstrapSwitchOptions());
        }
        return super.getOptions();
    }

}
