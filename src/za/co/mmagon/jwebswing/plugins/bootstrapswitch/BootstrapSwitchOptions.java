package za.co.mmagon.jwebswing.plugins.bootstrapswitch;

import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 * All the options available for Bootstrap Switch
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
public class BootstrapSwitchOptions extends JavaScriptPart
{
	
	private static final long serialVersionUID = 1L;
	/**
	 * The checkbox state*
	 */
	private Boolean state;
	/**
	 * The checkbox size*
	 */
	private BootstrapSwitchSizes size;
	/**
	 * Animate the switch*
	 */
	private Boolean animate;
	/**
	 * Disable state*
	 */
	private Boolean disabled;
	/**
	 * Readonly state*
	 */
	private Boolean readonly;
	/**
	 * Indeterminate state*
	 */
	private Boolean indeterminate;
	/**
	 * Inverse switch direction*
	 */
	private Boolean inverse;
	/**
	 * Allow this radio button to be unchecked by the user*
	 */
	private Boolean radioAllOff;
	/**
	 * Color of the left side of the switch*
	 */
	private String onColor;
	/**
	 * Color of the right side of the switch*
	 */
	private String offColor;
	/**
	 * Text of the left side of the switch*
	 */
	private String onText;
	/**
	 * Text of the right side of the switch*
	 */
	private String offText;
	/**
	 * Text of the center handle of the switch*
	 */
	private String labelText;
	/**
	 * Width of the left and right sides in pixels*
	 */
	private Integer handleWidth;
	/**
	 * Width of the center handle in pixels*
	 */
	private Integer labelWidth;
	/**
	 * Global class prefix*
	 */
	private String baseClass;
	/**
	 * Container element class(es)*
	 */
	private Integer wrapperClass;
	
	/**
	 * Builds a new switch options
	 */
	public BootstrapSwitchOptions(Input checkbox)
	{
	}
	
	/**
	 * The checkbox state
	 *
	 * @return
	 */
	public Boolean getState()
	{
		return state;
	}
	
	/**
	 * The checkbox state
	 *
	 * @param state
	 *
	 * @return
	 */
	public BootstrapSwitchOptions setState(Boolean state)
	{
		this.state = state;
		return this;
	}
	
	/**
	 * The checkbox size
	 *
	 * @return
	 */
	public BootstrapSwitchSizes getSize()
	{
		return size;
	}
	
	/**
	 * The checkbox size
	 *
	 * @param size
	 *
	 * @return
	 */
	public BootstrapSwitchOptions setSize(BootstrapSwitchSizes size)
	{
		this.size = size;
		return this;
	}
	
	/**
	 * Animate the switch
	 *
	 * @return
	 */
	public Boolean getAnimate()
	{
		return animate;
	}
	
	/**
	 * Animate the switch
	 *
	 * @param animate
	 *
	 * @return
	 */
	public BootstrapSwitchOptions setAnimate(Boolean animate)
	{
		this.animate = animate;
		return this;
	}
	
	/**
	 * Disable state
	 *
	 * @return
	 */
	public Boolean getDisabled()
	{
		return disabled;
	}
	
	/**
	 * Disable state
	 *
	 * @param disabled
	 *
	 * @return
	 */
	public BootstrapSwitchOptions setDisabled(Boolean disabled)
	{
		this.disabled = disabled;
		return this;
	}
	
	/**
	 * Readonly state
	 *
	 * @return
	 */
	public Boolean getReadonly()
	{
		return readonly;
	}
	
	/**
	 * Readonly state
	 *
	 * @param readonly
	 *
	 * @return
	 */
	public BootstrapSwitchOptions setReadonly(Boolean readonly)
	{
		this.readonly = readonly;
		return this;
	}
	
	/**
	 * Indeterminate state
	 *
	 * @return
	 */
	public Boolean getIndeterminate()
	{
		return indeterminate;
	}
	
	/**
	 * Indeterminate state
	 *
	 * @param indeterminate
	 *
	 * @return
	 */
	public BootstrapSwitchOptions setIndeterminate(Boolean indeterminate)
	{
		this.indeterminate = indeterminate;
		return this;
	}
	
	/**
	 * Inverse switch direction
	 *
	 * @return
	 */
	public Boolean getInverse()
	{
		return inverse;
	}
	
	/**
	 * Inverse switch direction
	 *
	 * @param inverse
	 *
	 * @return
	 */
	public BootstrapSwitchOptions setInverse(Boolean inverse)
	{
		this.inverse = inverse;
		return this;
	}
	
	/**
	 * Allow this radio button to be unchecked by the user
	 *
	 * @return
	 */
	public Boolean getRadioAllOff()
	{
		return radioAllOff;
	}
	
	/**
	 * Allow this radio button to be unchecked by the user
	 *
	 * @param radioAllOff
	 *
	 * @return
	 */
	public BootstrapSwitchOptions setRadioAllOff(Boolean radioAllOff)
	{
		this.radioAllOff = radioAllOff;
		return this;
	}
	
	/**
	 * Color of the left side of the switch
	 *
	 * @return
	 */
	public String getOnColor()
	{
		return onColor;
	}
	
	/**
	 * Color of the left side of the switch
	 *
	 * @param onColor
	 *
	 * @return
	 */
	public BootstrapSwitchOptions setOnColor(String onColor)
	{
		this.onColor = onColor;
		return this;
	}
	
	/**
	 * Color of the right side of the switch
	 *
	 * @return
	 */
	public String getOffColor()
	{
		return offColor;
	}
	
	/**
	 * Color of the right side of the switch
	 *
	 * @param offColor
	 *
	 * @return
	 */
	public BootstrapSwitchOptions setOffColor(String offColor)
	{
		this.offColor = offColor;
		return this;
	}
	
	/**
	 * Text of the left side of the switch
	 *
	 * @return
	 */
	public String getOnText()
	{
		return onText;
	}
	
	/**
	 * Text of the left side of the switch
	 *
	 * @param onText
	 *
	 * @return
	 */
	public BootstrapSwitchOptions setOnText(String onText)
	{
		this.onText = onText;
		return this;
	}
	
	/**
	 * Text of the right side of the switch
	 *
	 * @return
	 */
	public String getOffText()
	{
		return offText;
	}
	
	/**
	 * Text of the right side of the switch
	 *
	 * @param offText
	 *
	 * @return
	 */
	public BootstrapSwitchOptions setOffText(String offText)
	{
		this.offText = offText;
		return this;
	}
	
	/**
	 * Text of the center handle of the switch
	 *
	 * @return
	 */
	public String getLabelText()
	{
		return labelText;
	}
	
	/**
	 * Text of the center handle of the switch
	 *
	 * @param labelText
	 *
	 * @return
	 */
	public BootstrapSwitchOptions setLabelText(String labelText)
	{
		this.labelText = labelText;
		return this;
	}
	
	/**
	 * Width of the left and right sides in pixels
	 *
	 * @return
	 */
	public Integer getHandleWidth()
	{
		return handleWidth;
	}
	
	/**
	 * Width of the left and right sides in pixels
	 *
	 * @param handleWidth
	 *
	 * @return
	 */
	public BootstrapSwitchOptions setHandleWidth(Integer handleWidth)
	{
		this.handleWidth = handleWidth;
		return this;
	}
	
	/**
	 * Width of the center handle in pixels
	 *
	 * @return
	 */
	public Integer getLabelWidth()
	{
		return labelWidth;
	}
	
	/**
	 * Width of the center handle in pixels
	 *
	 * @param labelWidth
	 *
	 * @return
	 */
	public BootstrapSwitchOptions setLabelWidth(Integer labelWidth)
	{
		this.labelWidth = labelWidth;
		return this;
	}
	
	/**
	 * Global class prefix
	 *
	 * @return
	 */
	public String getBaseClass()
	{
		return baseClass;
	}
	
	/**
	 * Global class prefix
	 *
	 * @param baseClass
	 *
	 * @return
	 */
	public BootstrapSwitchOptions setBaseClass(String baseClass)
	{
		this.baseClass = baseClass;
		return this;
	}
	
	/**
	 * Container element class(es)
	 *
	 * @return
	 */
	public Integer getWrapperClass()
	{
		return wrapperClass;
	}
	
	/**
	 * Container element class(es)
	 *
	 * @param wrapperClass
	 *
	 * @return
	 */
	public BootstrapSwitchOptions setWrapperClass(Integer wrapperClass)
	{
		this.wrapperClass = wrapperClass;
		return this;
	}
}
