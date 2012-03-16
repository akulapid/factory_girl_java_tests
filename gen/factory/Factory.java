package factory;

public class Factory {

    public static factory.Foo_GeneratedFactoryProxy newFoo() {
        return factory.Instantiator.createProxy(Foo_GeneratedFactoryProxy.class, "");
    }

    public static factory.Foo_GeneratedFactoryProxy newFu() {
        return factory.Instantiator.createProxy(Foo_GeneratedFactoryProxy.class, "Fu");
    }

}