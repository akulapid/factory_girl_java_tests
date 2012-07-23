package akula.factory;

import foo.Patient;

@Factory(Patient.class)
@Persistent(databaseName = "mydb")
class PatientSetup {

    public String name() {
        return "foobar";
    }
}

