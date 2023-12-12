import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    Task task = new Task(123);

    @Test
    public void testMatches() {
        boolean expected = false;
        boolean actual = task.matches("Аул");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetId() {
        int expected = 123;
        int actual = task.getId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testHashCode() {
        int expected = 154;
        int actual = task.hashCode();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldEqualsIfSameObject() {
        boolean expected = true;
        boolean actual = task.equals(task);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotEqualsIfNull() {
        boolean expected = false;
        boolean actual = task.equals(null);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotEqualsId() {
        Task newTask = new Task(657);
        boolean expected = false;
        boolean actual = task.equals(newTask);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldEqualId() {
        Task newTask = new Task(123);
        boolean expected = true;
        boolean actual = task.equals(newTask);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotEqualsWithOtherClass() {
        String[] subtasks = {""};
        Epic newClass = new Epic(123, subtasks);
        boolean expected = false;
        System.out.println(newClass.getClass());
        boolean actual = task.equals(newClass);
        Assertions.assertEquals(expected, actual);
    }
}
