import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.testng.annotations.Test;

public class SecondONE {
    @Test
    public void testNumbers() {
        int myNumber1;
        myNumber1=5;

        System.out.println(myNumber1);
}

    @Test
    public void testFloat() {
        float FloatValue = 4.5f;
        System.out.println(FloatValue);
    }

    @Test
    public void TwoNumber(){
        int vatiableOne=1;
        int variableTwo=68;
        PrintTwoNumbers(vatiableOne,variableTwo);
    }

    @Test
    public void TwoNumber2() {
        int vatiableOne = 561;
        int variableTwo = 230;
        PrintTwoNumbers(vatiableOne, variableTwo);
    }

        public void PrintTwoNumbers (int FirstParameter, int SecondParameter){
    System.out.println(FirstParameter+ " "+SecondParameter);
}

    @Test
    public void TestBooleans() {
        boolean BooleanVariable = true;
        boolean isFiveGraitherThan4 = 5 > 4;  //true
        if (isFiveGraitherThan4) {
            System.out.println("5>4");
        }
    }

    @Test
    public void TestBooleans2(){
        boolean BooleanVariable=true;
        int AmountOfLinks =5;
        int AmountOfClicks=4;
        boolean isThereAreStillLinksToClick= AmountOfLinks>AmountOfClicks;  //true
        if (isThereAreStillLinksToClick){
            System.out.println("Keep clicking");
        }

    }

    @Test
    public void TestBooleans3() {
        boolean BooleanVariable = true;
        int AmountOfGuest = 5;
        int RoomCapability = 4;
        boolean ifItBeEnoughOneRoom = AmountOfGuest <= RoomCapability;
        if (ifItBeEnoughOneRoom) {
            System.out.println("Enough One room");
        } else {
            System.out.println("Need extra room");
        }
        ;
    }

    @Test
    public void testMoreLogical() {
        int AmountOfLinks =5;
        int AmountOfClicks=5;

        boolean elementOneIsVisible=true;

        boolean isThereAreStillLinksToClick= AmountOfLinks>AmountOfClicks;

        int currentTime=5000;
        int timeSinceTestStarted=3000;

        boolean isThereAreStillSomeTimeToClick=(currentTime-timeSinceTestStarted)>1000;

        if (elementOneIsVisible && isThereAreStillLinksToClick && isThereAreStillSomeTimeToClick){
            System.out.println("Keep Clicking");
        } else {
            System.out.println("Some condition are not met");
        }
    }

    public boolean isThereAreStillSomeTimeToClick (int currentTime, int timeSinceTestStarted) {
        boolean result=false;
        result=(currentTime-timeSinceTestStarted)>1000;
        return result;
}

    @Test
    public void testMoreLogical2() {
        int AmountOfLinks =5;
        int AmountOfClicks=5;

        boolean elementOneIsVisible=true;

        boolean isThereAreStillLinksToClick= AmountOfLinks>AmountOfClicks;

        int currentTime=5000;
        int timeSinceTestStarted=3000;

        boolean isThereAreStillSomeTime=isThereAreStillSomeTimeToClick(currentTime,timeSinceTestStarted);

        if (elementOneIsVisible && isThereAreStillLinksToClick && isThereAreStillSomeTime){
            System.out.println("Keep Clicking");
        } else {
            System.out.println("Some condition are not met");
        }
    }

    @Test
    public void testAboutArrays() {
        int[] arrayOfNumbers ={1,2,3,4,5,6};
        String firstCar = "Volvo";
        String secondCar = "Toyota";
        String thirdCar = "Tesla";
        String[]garage={firstCar,secondCar,thirdCar};
        for (int i=0; i< garage.length; i++){
            System.out.println("Car ["+i+"]="+garage[i]);

        }
        for (String eachCar : garage){
            System.out.println("Car:"+eachCar);
        }
    }

    @Test
    public void testWhile() {
        int i =0;
        while (i<10) {
            System.out.println("While is still on");
            i++;
        }
    }

    @Test
    public void testfor3() {
    String[] cars = {"Volvo", "BMW", "Ford"};
for (String i : cars) {
        System.out.println(i);
    }}

}






