package factory;

@PersistenceHandler
public class MockPersistenceHandler extends AbstractPersistenceHandler {

    private static boolean called = false;
    private static String calledWithDatabaseName;

    public MockPersistenceHandler(String databaseName) {
        super(databaseName);
    }

    public void built(Object object) {
        called = true;
        calledWithDatabaseName = databaseName;
    }

    public static boolean assertCallbackCalledWith(String value) {
        return called && value.equals(calledWithDatabaseName);
    }
}