package factory;

import foo.Foo;
import org.hamcrest.Factory;

@Setup(Foo.class)
@Persistent(databaseName = "mydb")
class FooSetup {

    public int fu() {
        return 5;
    }

    public String bar() {
        return "bar";
    }
}

@Setup(value = Foo.class, name = "Fu")
class FuSetup {

    public int fu() {
        return 10;
    }

    public String bar() {
        return "bur";
    }
}
