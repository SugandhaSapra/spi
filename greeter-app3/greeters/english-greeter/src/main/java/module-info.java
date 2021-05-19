module spi.greeter.app.greeters.english.greeter.main {
    requires spi.greeter.app.greeter.api.main;
    provides com.core.api.Greeter
            with com.core.iml.english.EnglishGreeter;

}
