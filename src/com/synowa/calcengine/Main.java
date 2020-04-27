package com.synowa.calcengine;

public class Main {

    public static void main(String[] args) {
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length]; //this one and these three above we call parallel arrays
        //double val1 = 100.0d;
        //double val2 = 50.0d;
        //double result;
        //char opCode = 'a';
        //char opCode = 'd';


        for(int i = 0; i < opCodes.length; i++) {
            if (opCodes[i] == 'a')
                results[i] = leftVals[i]   + rightVals[i];
            else if (opCodes[i] == 's')
                results[i] = leftVals[i] - rightVals[i];
            else if (opCodes[i] == 'd') {
                results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;//(it means result = if val2 non eqals zero than go ahead and devide val1/val2 otherwise (":") return zero)


        /* basic form
        if ( opCode == 'a')
            result = val1 + val2;
        else if (opCode == 's')
            result = val1 - val2;
        else if (opCode == 'd') {
            result = val2 != 0.0d ? val1 / val2 : 0.0d;//(it means result = if val2 non eqals zero than go ahead and devide val1/val2 otherwise (":") return zero)

                    /* to be sure ur not deviding by zero
        or
        else if (opCode == 'd')
            if val2 != 0.0d
            result = val1 / val2;
            else
                result = 0.0d
         */
        /* to be sure ur not deviding by zero
        or
        else if (val2 != 0.0d && opCode == 'd')
        result = val1 / val2;

         else if (opCode == 'm')
            result = val1 * val2;

        else {
                //System.out.println("Error - invalid opCode");
                //result = 0.0d;
                //if I leave it like here it's gonna print out 0.0m because without the brackets else only do the first line after itself, so with char opCode = 'd' instead of 2.0 we'll get 0.0
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                }
         }
         */

            } else if (opCodes[i] == 'm')
                results[i] = leftVals[i] * rightVals[i];
        else {
                //System.out.println("Error - invalid opCode");
                //result = 0.0d;
                //if I leave it like here it's gonna print out 0.0m because without the brackets else only do the first line after itself, so with char opCode = 'd' instead of 2.0 we'll get 0.0
                System.out.println("Error - invalid opCode");
                results[i] = 0.0d;
            }
        }
        for (double theResult : results){
            System.out.println("result = ");
            System.out.println(theResult);
        }

        //System.out.println(result);


    }
}
