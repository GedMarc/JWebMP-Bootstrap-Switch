package com.jwebmp.plugins.bootstrapswitch.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class BootstrapSwitchExclusionsModule
		implements IGuiceScanModuleExclusions<BootstrapSwitchExclusionsModule>,
				           IGuiceScanJarExclusions<BootstrapSwitchExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-bootstrap-switch-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.bootstrapswitch");
		return strings;
	}
}
