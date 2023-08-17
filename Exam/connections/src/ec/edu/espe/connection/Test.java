/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.connection;

/**
 *
 * @author Oswaldo Tipan
 */
public class Test {
    
    int age;
    int id;
    String name;

    public Test( int id, int age, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{"
                + "\"Id\":\"" + id + "\","
                + "\"Name\":\"" + name + "\","
                + "\"Age\":" + age + "}";
    }

}
