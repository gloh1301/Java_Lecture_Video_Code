package week_3_methods;

public class StringFormatting {
    public static void main(String[] args) {
        String college = "MCTC";
        String className = "Java Programming";
        int classCode = 2545;
        int credits = 6;
        double averageGrade = 84.545345;
        boolean isOnline = true;

        System.out.println("This class code is " + classCode);

        System.out.println("This class code is " + classCode + " " + className + ". It is taught at "
        + college + ". It is " + credits + " credits, the average grade is " + averageGrade
                + "%. Is it online? " + isOnline + ". ");

        // %d = int
        // %s = String or anything else
        // %f = double
        // \n = newline
        System.out.printf("This class code is %d %s. It is taught at %s. It is %d credits, the average " +
                "grade is %.2f%%. Is it online? %s.\n",
                classCode, className, college, credits, averageGrade, isOnline);
    }
}
