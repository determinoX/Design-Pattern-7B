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
public class SmartImage implements Image {

    private String fileName;
    private RealImage realImage;
    private int referenceCount;

    public SmartImage(String fileName) {
        this.fileName = fileName;
        this.referenceCount = 0;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }

        referenceCount++;
        realImage.display();
    }

    public void release() {
        referenceCount--;
        if (referenceCount == 0) {
            realImage = null;
        }
    }
}

