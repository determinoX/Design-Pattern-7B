/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.StructuralPattern.Decorator.LabTaskRG;

/**
 *
 * @author shafq
 */
import GOF.StructuralPattern.Decorator.LabTaskRG.decorators.*;

public class Demo {
    public static void main(String[] args) {
        // Initial data
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        // Creating a chain of decorators and a base component
        DataSourceDecorator encoded = new CompressionDecorator(
                                         new EncryptionDecorator(
                                             new UTF8Decorator(
                                                 new FileDataSource("out/OutputDemo.txt"))));

        // Writing encoded data
        encoded.writeData(salaryRecords);

        // Creating a base component
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        // Displaying original, encoded, and decoded data
        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
