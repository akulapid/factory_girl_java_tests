package factory;

import foo.Driver;
import foo.License;
import foo.Tag;

@Setup(Driver.class)
@Persistent(databaseName = "mydb")
class DriverSetup {

    public String name() {
        return "foo";
    }
}

@Setup(License.class)
@Persistent(databaseName = "mydb")
class LicenseSetup {

    public String id() {
        return "123";
    }
}

@Setup(Tag.class)
@Persistent(databaseName = "mydb")
class TagSetup {

    public String type() {
        return "e";
    }
}

