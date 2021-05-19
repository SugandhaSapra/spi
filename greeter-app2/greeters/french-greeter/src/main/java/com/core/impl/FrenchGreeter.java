package com.core.impl;

import com.core.api.Greeter;

public class FrenchGreeter implements Greeter {
    @Override
    public String greet(String name) {
        return "Bonjour " + name + " !";

    }
}
