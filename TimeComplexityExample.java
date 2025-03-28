public class TimeComplexityExample {
    public static void main(String[] args) {
        TimeComplexityExample timeComplexityExample = new TimeComplexityExample();

        // Get factorial using For Loop and getting time used
        double forLoopStartTime = System.currentTimeMillis();
        int forLoopSum = timeComplexityExample.factorialUsingForLoop(999999999);
        double forLoopEndTime = System.currentTimeMillis();
        double forLoopTotalTimeTaken = forLoopEndTime - forLoopStartTime;

        System.out.println("************************************************");
        System.out.println("Sum from for Loop --> " + forLoopSum);
        System.out.println("Total Time Take --> " + forLoopTotalTimeTaken + "Milli Seconds");
        System.out.println("************************************************");
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println();

        // Get factorial using For Loop and getting time used
        double formulaStartTime = System.currentTimeMillis();
        int formulaSum = timeComplexityExample.factorialUsingFormula(999999999);
        double formulaEndTime = System.currentTimeMillis();
        double formulaTotalTimeTaken = formulaEndTime - formulaStartTime;

        System.out.println("************************************************");
        System.out.println("Sum from formula --> " + formulaSum);
        System.out.println("Total Time Take --> " + formulaTotalTimeTaken + "Milli Seconds");
        System.out.println("************************************************");
    }

    public int factorialUsingForLoop(int endValue){
        int sum = 0;
        for (int i = 1; i <=endValue; i++){
            sum  += i;
        }

        return sum;
    }

    public int factorialUsingFormula(int endValue){
        return endValue * (endValue + 1)/2;
    }
}
