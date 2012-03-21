package factory;

import foo.Driver;
import foo.Instructor;
import foo.License;
import foo.Tag;

@Setup(Driver.class)
@Persistent(databaseName = "mydb")
class DriverSetup {

    public String name() {
        return "foo";
    }

    public String licenseId(License license) {
        return license.getId();
    }
}

@Setup(License.class)
@Persistent(databaseName = "mydb")
class LicenseSetup {

    public String id() {
        return "123";
    }

    public String tagType(Tag tag) {
        return tag.getType();
    }
}

@Setup(Tag.class)
@Persistent(databaseName = "mydb")
class TagSetup {

    public String type() {
        return "e";
    }
}

@Setup(Instructor.class)
@Persistent(databaseName = "mydb")
class InstructorSetup {

    String name() {
        return "fuu";
    }
}

