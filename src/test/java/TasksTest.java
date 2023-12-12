import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {
    SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

    String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
    Epic epic = new Epic(55, subtasks);

    Meeting meeting = new Meeting(
            555,
            "Выкатка 3й версии приложения",
            "Приложение НетоБанка",
            "Во вторник после обеда"
    );

    @Test
    public void shouldFindMatchInTitle() {
        boolean expected = true;
        boolean actual = simpleTask.matches("дит");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMatchInSubtasks() {
        boolean expected = true;
        boolean actual = epic.matches("леб");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMatchInTopic() {
        boolean expected = true;
        boolean actual = meeting.matches("катка");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMatchInProject() {
        boolean expected = true;
        boolean actual = meeting.matches("Банка");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFindMatchInTitle() {
        boolean expected = false;
        boolean actual = simpleTask.matches("дети");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFindMatchInSubtasks() {
        boolean expected = false;
        boolean actual = epic.matches("хлеб");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFindMatchInTopic() {
        boolean expected = false;
        boolean actual = meeting.matches("самолет");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFindMatchInProject() {
        boolean expected = false;
        boolean actual = meeting.matches("Софт");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetTitle() {
        String expected = "Позвонить родителям";
        String actual = simpleTask.getTitle();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetSubtasks() {
        String[] expected = {"Молоко", "Яйца", "Хлеб"};
        String[] actual = epic.getSubtasks();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetTopic() {
        String expected = "Выкатка 3й версии приложения";
        String actual = meeting.getTopic();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetProject() {
        String expected = "Приложение НетоБанка";
        String actual = meeting.getProject();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetStart() {
        String expected = "Во вторник после обеда";
        String actual = meeting.getStart();
        Assertions.assertEquals(expected, actual);
    }
}
