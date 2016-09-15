package hellorest;

public class Hello implements IHello {
    @Override
    public String sayHello(String name) {
        return "Hello: " + name;
    }
}
