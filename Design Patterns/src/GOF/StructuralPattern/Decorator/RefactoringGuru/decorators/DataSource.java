/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.StructuralPattern.Decorator.RefactoringGuru.decorators;

/**
 *
 * @author shafq
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
