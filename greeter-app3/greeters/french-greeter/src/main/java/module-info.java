module spi.greeter.app.greeters.french.greeter.main {
    requires spi.greeter.app.greeter.api.main;
    provides com.core.api.Greeter
            with com.core.impl.french.FrenchGreeter;
}
