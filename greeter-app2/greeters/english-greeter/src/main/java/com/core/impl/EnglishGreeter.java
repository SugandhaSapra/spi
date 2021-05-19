package com.core.impl;

import com.core.api.Greeter;

public class EnglishGreeter implements Greeter {
    @Override
    public String greet(String name) {
        return "Hello " + name + " !";
    }
}
