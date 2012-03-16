package factory;

public class Foo_GeneratedFactoryProxy extends foo.Foo {

    private factory.AbstractPersistenceHandler persistenceHandler;

    public Foo_GeneratedFactoryProxy(factory.AbstractPersistenceHandler persistenceHandler) {
        this.persistenceHandler = persistenceHandler;
    }

    public Foo_GeneratedFactoryProxy fu(int fu) {
        setFu(fu);
        return this;
    }

    public Foo_GeneratedFactoryProxy bar(java.lang.String bar) {
        setBar(bar);
        return this;
    }

    public Foo_GeneratedFactoryProxy id(int id) {
        setId(id);
        return this;
    }

    public foo.Foo build() {
        return (foo.Foo) this;
    }

    public foo.Foo create() {
        foo.Foo object = build();
        if (persistenceHandler == null)
            throw new factory.PersistenceHandlerMissingException("No persistence handlers found.");
        persistenceHandler.built(object);
        return object;
    }
}

@factory.__SetupForProxy(Foo_GeneratedFactoryProxy.class)
class Foo_GeneratedFactoryProxy_Setup {
}
