import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestClass {
@BeforeAll
static void beforeAll(){System.out.print("Before all");}

    @Test
     void test1(){
        System.out.print("Inside test1");
    }
    @Test
    void test2(){
        System.out.print("Inside test2");
    }
/*
    @ParameterizedTest
    @CsvFileSource(resources = "/Users.csv")
    void paramTest(String login, String pass){
   // Assert.assertNotNull(argument);
    System.out.print(login+"\t"+pass+"\n");

    }*/

@AfterAll
    static void afterAll(){System.out.print("After all");}
}
