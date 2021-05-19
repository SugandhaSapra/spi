import com.core.api.Greeter;

import java.util.ServiceLoader;

public class GreeterApp {
    public static void main(String[] args) {
        ServiceLoader.load(Greeter.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .forEach(greeter -> System.out.println(greeter.greet("Alice")));
    }
}
