public class StudentManager {
    private StudentRecord[] studentRecords;

    public StudentManager() {
        // Initialize the array of student records using StudentRecordGenerator
        this.studentRecords = StudentRecordGenerator.generateRandomRecords();
    }

    // Method to display the contents of studentRecords
    public void displayStudentRecords() {
        System.out.println("Student Records:");
        for (StudentRecord record : studentRecords) {
            System.out.println(record);
        }
    }

    /*
     * TODO
     * Program the StudentManager class, designing and modifying it from the given file:
     * a.	Show the name and score for each of the subjects on the screen.
     * b.	Compute the average score for the student and print it out on the screen.
     * c.	Handle appropriate exceptions.
     * d.	Output a file named "results.txt" including the data from (a) and (b).
     */

    // Main method for testing
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.displayStudentRecords();
    }
}
