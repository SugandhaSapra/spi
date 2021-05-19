package com.core.impl.hindi;

import com.core.api.Greeter;

public class HindiGreeter implements Greeter {
    @Override
    public String greet(String name) {
        return "Namaste " + name + " !";
    }
}
