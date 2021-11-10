import org.testng.Assert;
import org.testng.annotations.Test;

public class StudentTest {
    @Test
    public void testName() {
        String testParamOne = "Victor";
        String testParamTwo = "Goltsov";
        Student StudentOne = new Student(testParamOne,testParamTwo);
        StudentOne.PrintName();
        StudentOne.Graduate();
        //boolean isNameCorrect = StudentOne.Name.contentEquals("VictOR");
        //Assert.assertTrue(isNameCorrect); //- correct for Case sensitive example
        Assert.assertEquals(StudentOne.Name, "Victor");
    }
    @Test
    public void testName2() {
        String testParamOne = "Ivan";
        String testParamTwo = "Goltcov";
        Student StudentOne = new Student(testParamOne,testParamTwo);
        StudentOne.PrintName();
        StudentOne.Graduate();
        StudentOne.FailClass();
                //boolean isNameCorrect = StudentOne.Name.contentEquals("VictOR");
        //Assert.assertTrue(isNameCorrect); //- correct for Case sensitive example
        String ExpectedName="Ivan";
        Assert.assertEquals(StudentOne.Name,ExpectedName);
    }


}

