import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestClass {
@BeforeAll
public static void beforeAll(){System.out.print("Before all");}

    @Test
   public   void test1(){
        System.out.print("Inside test1");
    }
    @Test
  public   void test2(){
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
   public static void afterAll(){System.out.print("After all");}
}
