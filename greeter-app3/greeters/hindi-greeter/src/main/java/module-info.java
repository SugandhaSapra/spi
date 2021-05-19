module spi.greeter.app.greeters.hindi.greeter.main {
    requires spi.greeter.app.greeter.api.main;
    provides com.core.api.Greeter
            with com.core.impl.hindi.HindiGreeter;
}
