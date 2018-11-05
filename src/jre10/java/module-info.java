import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.bootstrapswitch.BootstrapSwitchPageConfigurator;
import com.jwebmp.plugins.bootstrapswitch.implementations.BootstrapSwitchExclusionsModule;

module com.jwebmp.plugins.bootstrapswitch {
	exports com.jwebmp.plugins.bootstrapswitch;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires com.jwebmp.plugins.bootstrap;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with BootstrapSwitchPageConfigurator;

	provides IGuiceScanJarExclusions with BootstrapSwitchExclusionsModule;
	provides IGuiceScanModuleExclusions with BootstrapSwitchExclusionsModule;

	opens com.jwebmp.plugins.bootstrapswitch to com.fasterxml.jackson.databind, com.jwebmp.core;
}
