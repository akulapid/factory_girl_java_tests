package factory;

import java.util.ArrayList;
import java.util.List;

@PersistenceHandler
public class MockPersistenceHandler extends AbstractPersistenceHandler {

    private static boolean called = false;
    private static String calledWithDatabaseName;
    private static List<Log> logs;

    public class Log {
        public Object object;

        public Log(Object object) {
            this.object = object;
        }
    }

    public MockPersistenceHandler(String databaseName) {
        super(databaseName);
        calledWithDatabaseName = databaseName;
        logs = new ArrayList<Log>();
    }

    public void persist(Object object) {
        called = true;
        logs.add(new Log(object));
    }

    public static boolean assertCallbackCalledWith(String value) {
        return called && value.equals(calledWithDatabaseName);
    }

    public static List<Log> logs() {
        return logs;
    }
}