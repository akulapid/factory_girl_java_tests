package foo;

import factory.MockPersistenceHandler;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.springframework.util.Assert.isInstanceOf;

public class FactorySetupProcessorTest {

    @Test
    public void shouldInstantiateAndSetup() {
        Foo foo = factory.Factory.newFoo().build();
        assertEquals(5, foo.fu);
        assertEquals("bar", foo.bar);
    }

    @Test
    public void shouldInstantiateOverrideSetup() {
        Foo foo = factory.Factory.newFoo().bar("ef").fu(3).build();
        assertEquals(3, foo.fu);
        assertEquals("ef", foo.bar);
    }

    @Test
    public void shouldInstantiateAlias() {
        Foo fu = factory.Factory.newFu().build();
        assertEquals(10, fu.fu);
        assertEquals("bur", fu.bar);
    }

    @Test
    public void shouldCallPersistenceCallbackAfterBuild() {
        factory.Factory.newFoo().create();
        assertTrue(MockPersistenceHandler.assertCallbackCalledWith("mydb"));
    }

    @Test
    public void shouldPersistEachDependency() {
        factory.Factory.newDriver().create();
        List<MockPersistenceHandler.Log> logs = MockPersistenceHandler.logs();
        isInstanceOf(Tag.class, logs.get(0).object);
        isInstanceOf(License.class, logs.get(1).object);
        isInstanceOf(Tag.class, logs.get(2).object);
        isInstanceOf(License.class, logs.get(3).object);
        isInstanceOf(Driver.class, logs.get(4).object);
    }
}
