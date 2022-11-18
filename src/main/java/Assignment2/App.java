package Assignment2;

import java.time.LocalDate;


public class App  {

    public static void main(String[] args ){

        Person mehrdad = new Person();

        mehrdad.setId(1);
        mehrdad.setFirstName("mehrdad");
        mehrdad.setLastName("mehrdad");
        mehrdad.setEmail("mehrdad.mehrdad@test.se");

        System.out.println(mehrdad.toString());


        Person anna = new Person();

        anna.setId(1);
        anna.setFirstName("Anna");
        anna.setLastName("Hamberg");
        anna.setEmail("anna.test@test.se");

        System.out.println(anna.toString());



        ToDoItem assignmentTask1 = new ToDoItem();

        assignmentTask1.setId(1);
        assignmentTask1.setTitle("assignment 1");
        assignmentTask1.setTaskDescription("todo it assignment part1");
        assignmentTask1.setDeadLine(LocalDate.parse("2022-11-13"));
        assignmentTask1.setDone(false); // boolean value should be true or false
        assignmentTask1.setCreator(mehrdad);

        System.out.println(assignmentTask1.toString());



        ToDoItemTask toDoItemTask = new ToDoItemTask();

        toDoItemTask.setId(1);
        toDoItemTask.setAssigned(true);
        toDoItemTask.setToDoItem(assignmentTask1);
        toDoItemTask.setAssignee(anna);

        System.out.println(toDoItemTask.toString());






    }


}
