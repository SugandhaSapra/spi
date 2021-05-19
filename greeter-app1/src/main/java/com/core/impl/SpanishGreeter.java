package com.core.impl;

import com.core.api.Greeter;

public class SpanishGreeter implements Greeter {
    @Override
    public String greet(String name) {
        return "Hola " + name + " !";
    }
}
