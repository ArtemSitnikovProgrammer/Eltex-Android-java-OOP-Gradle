/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ru.eltex;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws IOException {

        User user = new User(1, "Ivan");
        System.out.println(user);

        ObjectMapper mapper = new ObjectMapper(); // create once, reuse

        //mapper.writeValue(new File("result.json"), user);

        System.out.println(mapper.readValue(new File("result.json"), User.class));
    }
}
