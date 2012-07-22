package akula.factory;

import foo.Driver;
import foo.Instructor;
import foo.License;
import foo.Tag;

@Factory(Driver.class)
@Persistent(databaseName = "mydb")
class DriverSetup {

    public String name() {
        return "test/java/foo";
    }

    public String licenseId(License license) {
        return license.getId();
    }
}

@Factory(License.class)
@Persistent(databaseName = "mydb")
class LicenseSetup {

    public String id() {
        return "123";
    }

    public String tagType(Tag tag) {
        return tag.getType();
    }
}

@Factory(Tag.class)
@Persistent(databaseName = "mydb")
class TagSetup {

    public String type() {
        return "e";
    }
}

@Factory(Instructor.class)
@Persistent(databaseName = "mydb")
class InstructorSetup {

    String name() {
        return "fuu";
    }
}

