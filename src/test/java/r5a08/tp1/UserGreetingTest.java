package r5a08.tp1;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserGreetingTest {
    @Test
    public void should_return_correct_greeting_message() {
        UserGreeting greeting = new UserGreeting();

        String actual = greeting.formatGreeting("Long");
        assertEquals("Bonjour, Long", actual);
    }

    @Test
    public void should_return_exception_when_name_empty() {
        UserGreeting greeting = new UserGreeting();
        assertThrows(UserGreetingFailureException.class, () -> greeting.formatGreeting(""));
    }

    @Test
    public void should_return_exception_when_name_too_long() {
        UserGreeting greeting = new UserGreeting();
        assertThrows(UserGreetingFailureException.class, () -> greeting.formatGreeting("DaoVietLongggg"));
    }

    @Test
    public void should_return_exception_when_name_contain_special_char() {
        UserGreeting greeting = new UserGreeting();
        assertThrows(UserGreetingFailureException.class, () -> greeting.formatGreeting("Long123"));
    }
}