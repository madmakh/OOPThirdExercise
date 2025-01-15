package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Alexandra", "Germany", "Computer Scienc", 2025, 12000);
        System.out.println(student1.toString());
        Staff staff = new Staff("Allyssa", "Germany", "Heidelberg Private school Center", 5000);
        System.out.println(staff.toString());

    }
}