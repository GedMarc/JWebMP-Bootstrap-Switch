import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.bootstrapswitch.BootstrapSwitchPageConfigurator;

module com.jwebmp.plugins.bootstrapswitch {
	exports com.jwebmp.plugins.bootstrapswitch;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires com.jwebmp.plugins.bootstrap;

	provides IPageConfigurator with BootstrapSwitchPageConfigurator;

	opens com.jwebmp.plugins.bootstrapswitch to com.fasterxml.jackson.databind,com.jwebmp.core;
}
