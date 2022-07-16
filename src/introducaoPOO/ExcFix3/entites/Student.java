package introducaoPOO.ExcFix3.entites;

public class Student {
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;
    public String name;

    public double calcGrade() {
        double sum = this.firstGrade + this.secondGrade + this.thirdGrade;
        
        return sum;
    }

    public String toString() {
        double totalGrade = calcGrade();
        if (totalGrade > 60.00) {
            return String.format("FINAL GRADE = %.2f\nPASS\n", totalGrade);
        } else {
            return String.format("FINAL GRADE = %.2f\nFAILED\n", totalGrade) + String.format("MISSING %.2f POINTS\n", 60 - totalGrade);
        }
    }
}
