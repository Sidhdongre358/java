package org.example;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person person1 = new Person("John", 30);
        Person person2 = new Person("Alice", 35);

        // Serialization
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("inputFiles/person.ser"));
        out.writeObject(person1);
        out.writeObject(person2);
        out.close();


        // Deserialization
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("inputFiles/person.ser"));
        Person deserializedPerson = (Person) in.readObject();
        in.close();

        System.out.println("Name: " + deserializedPerson.getName() + ", Age: " + deserializedPerson.getAge());

    }


    // File Handling: Reading and Writing Files

    public static void readFile(String fileLocation) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileLocation));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void writeFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("inputFiles/file.txt"));
        writer.write("Hello, World!");
        writer.newLine();
        for (int i = 0; i < 10; i++) {
            writer.write("this is line number - " + i);
            writer.newLine();
        }

        writer.close();

    }


    // Exception handling
    public static void exceptionHandling() {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
