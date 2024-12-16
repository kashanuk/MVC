//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DemoMVCPattern {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatobose();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentRollNum("7878");
        controller.updateView();
    }

    private static Student retrieveStudentFromDatobose() {
        Student student = new Student();
        student.setName("Sam");
        student.setRollNo("5757");
        return student;
    }


}

