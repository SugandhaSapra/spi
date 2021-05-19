package com.core.impl;

import com.core.api.Greeter;

public class HindiGreeter implements Greeter {
    @Override
    public String greet(String name) {
        return "Namaste " + name + " !";
    }
}
