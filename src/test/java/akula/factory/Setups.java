package akula.factory;

import foo.Foo;

@Factory(Foo.class)
@Persistent(databaseName = "mydb")
class FooSetup {

    public int fu() {
        return 5;
    }

    public String bar() {
        return "bar";
    }
}

@Factory(value = Foo.class, name = "Fu")
class FuSetup {

    public int fu() {
        return 10;
    }

    public String bar() {
        return "bur";
    }
}
