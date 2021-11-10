import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class FirstExample {


    @Test
    public void testName() {
   System.out.println("Hello, dear friend!*!");
    }

    @Test
    public void testNumbers() {
        int myNumber1;
        myNumber1=5;

        System.out.println(myNumber1);
        
    }

    @Test
    public void testConcatenation() {
    String s1 ="Never give up ";
        String s2 =" Such a wonderful life";
        String s3=s1+s2;
        System.out.println(s3);

    }

    @Test
    public void testConcatenation2() {
        String messagePrefix = "Never give up -";
        String messageSuffix = " it's such a wonderful life  ";
        int numberForMessage = 5;
        String s3 = messagePrefix + messageSuffix+ numberForMessage;
        System.out.println(s3);
    }

    @Test
    public void testClicks() {
        String messagePrefix = "I clicked ";
        int numberOfclicks=5;
        String messageSuffix=" times end";
        System.out.println(messagePrefix+numberOfclicks+messageSuffix);



    }

    @Test
    public void testBoolean() {
        boolean b = true;
        boolean tobe=false;
        b = tobe||!tobe;

        if (tobe||!tobe) {
            System.out.println(tobe);
        }
    }

    @Test
    public void testIFStatement() {
    boolean isElementVisible=false;
    if (isElementVisible) {
        System.out.println("Click on the Element");
    } else {
        System.out.println("Wait until it will be visible");
    }
    }

    @Test
    public void testArrays() {
        int[] arrayOfIntegers ={1,2,3,4};

//           System.out.println(arrayOfIntegers[0]);
//           System.out.println(arrayOfIntegers[1]);
//           System.out.println(arrayOfIntegers[2]);
//          System.out.println(arrayOfIntegers[3]);

            for (int i=0;i<arrayOfIntegers.length;i++){
                System.out.println(arrayOfIntegers[i]);
            }
        }

    @Test
    public void testMoreNumbers() {
        int numberOfClicks = 5;
        int anotherNumber = 5;

        System.out.println(5 + 6 + anotherNumber + numberOfClicks);
    }

    public void printClickMessage(int firstNumber, int secondNumber) {
        String messagePrefix = "firstNumber value is:";
        String messagePostfix = "secondNumber value is:";
        System.out.println(messagePrefix + firstNumber + "\n" + messagePostfix + secondNumber);
    }

    @Test
    public void testMyMethod() {
        printClickMessage(8,9);
    }

    @Test
    public void testMyMethod002() {
        printClickMessage(523, 6234);
    }

    @Test
    public void testLoginTest() {
        loginStep("tomsmith", "supersecretpassword");
    }

    public void loginStep(String loginValue, String passwordValue){
        System.out.println("I typed login:" + loginValue);
        System.out.println("I typed password:" + passwordValue);
        System.out.println("I clicked login button");
    }

    @Test
    public void testArrays3() {
        int[] arrayOfInts = {1, 2, 3, 4, 5};
        System.out.println(arrayOfInts[2]);
        arrayOfInts[2] = 4;

        System.out.println(arrayOfInts[2]);
    }

    @Test
    public void testForLoop() {
        int[] arrayOfInts = {1, 2, 3, 4, 5};

        for(int i = 1; i < arrayOfInts.length - 1; i++){
            int currentValue = arrayOfInts[i];
            System.out.println(currentValue);
        }
    }

}



