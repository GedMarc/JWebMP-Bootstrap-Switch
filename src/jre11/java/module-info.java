module com.jwebmp.plugins.bootstrapswitch {
	exports com.jwebmp.plugins.bootstrapswitch;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires com.jwebmp.plugins.bootstrap;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.bootstrapswitch.BootstrapSwitchPageConfigurator;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.bootstrapswitch.implementations.BootstrapSwitchExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.bootstrapswitch.implementations.BootstrapSwitchExclusionsModule;

	opens com.jwebmp.plugins.bootstrapswitch to com.fasterxml.jackson.databind, com.jwebmp.core;
}
