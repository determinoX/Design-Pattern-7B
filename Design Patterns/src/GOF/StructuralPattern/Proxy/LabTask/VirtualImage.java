/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.StructuralPattern.Proxy.LabTask;

/**
 *
 * @author FA20-BSE-042
 */
public class VirtualImage implements Image {

    private String fileName;
    private RealImage realImage;

    public VirtualImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

