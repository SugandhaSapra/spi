module spi.greeter.app.greeters.spanish.greeter.main {
    requires spi.greeter.app.greeter.api.main;
    provides com.core.api.Greeter
            with com.core.impl.spanish.SpanishGreeter;
}
