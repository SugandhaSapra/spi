package com.core.main;

import com.core.api.Greeter;

import java.util.ServiceLoader;

public class GreeterApp {
    public static void main(String[] args) {
        Class<Greeter> service = Greeter.class;
        ModuleLayer moduleLayer = service.getModule().getLayer();
        ServiceLoader.load(moduleLayer, service)
                .stream()
                .map(ServiceLoader.Provider::get)
                .forEach(greeter -> System.out.println(greeter.greet("Alice")));
    }
}
