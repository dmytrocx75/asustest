import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.AfterClass;

public class TestClass {
@BeforeClass
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

@AfterClass
   public static void afterAll(){System.out.print("After all");}
}
