public class Student {
    int totalCredit;
    int numberOfSubjects;
    double averageOfSeason;

    public Student(int totalCredit, int numberOfSubjects, double averageOfSeason){
        this.totalCredit = totalCredit;
        this.numberOfSubjects = numberOfSubjects;
        this.averageOfSeason = averageOfSeason;
    }

    public static void main(String[] args) {
        //Student student = new Student(46,6, 2.52);
        Student student = new Student(12,2,3.44);


        assert student.totalCredit > 45 : "Student cannot take more then 45 credits.";
        assert student.numberOfSubjects > 10 :"Student cannot take more than 10 subjects";
        assert student.averageOfSeason < 2.5 :"Student has failed. Student's season average must be over 2.5";


    }


}
