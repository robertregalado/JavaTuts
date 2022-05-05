public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom(); //instantiate a SimpleDotCom object
        // make an int array for the location of the dot com (3 consecutive ints out of a possible 7).
        int[] locations = {2,3,4};
        // invoke the setter method on the dot com.
        dot.setLocationCells(locations);

        // make a fake user guess
        String userGuess = "2";
        // invoke the checkYourself()
        // method on the dot Com object, and pass it the fake guess.
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";
        if (result.equals("hit")) {
            // if the fake guess (2) gives back a "hit", it's working
            testResult = "passed";
        }
        //print out the test result (passed or failed)
        System.out.println(testResult);
    }
    
}
