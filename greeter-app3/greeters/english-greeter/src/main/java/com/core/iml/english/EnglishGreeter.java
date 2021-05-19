package com.core.iml.english;

import com.core.api.Greeter;

public class EnglishGreeter implements Greeter {
    @Override
    public String greet(String name) {
        return "Hello " + name + " !";
    }
}
