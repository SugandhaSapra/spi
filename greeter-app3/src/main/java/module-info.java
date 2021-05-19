module spi.greeter.app.main {
    requires spi.greeter.app.greeter.api.main;
    exports com.core.main;
    uses com.core.api.Greeter;
}
