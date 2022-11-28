import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JUnit5Examples {

    @BeforeAll
    static void BeforeAll(){
        System.out.println("###  @Test BeforeAll!");
    }

    @AfterAll
    static void AfterAll(){
        System.out.println("###  @Test AfterAll!");
    }


    @BeforeEach
    void beforeEach() {
        System.out.println("###  @Test beforeEach!");
    }

    @AfterEach
    void afterEach(){
        System.out.println("###  @Test afterEach!");
    }

    @Test
    void firstTest() {
        System.out.println("###  @Test firstTest!");
        assertTrue (3>2);
    }

    @Test
    void secondTest() {
        System.out.println("###  @Test secondTest!");
       assertFalse (3>2);
    }


}
