/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.StructuralPattern.Decorator.LabTaskRG;

/**
 *
 * @author shafq
 */
import java.io.UnsupportedEncodingException;

public class UTF8Decorator extends DataSourceDecorator {

    public UTF8Decorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encodeToUTF8(data));
    }

    @Override
    public String readData() {
        return decodeFromUTF8(super.readData());
    }

    private String encodeToUTF8(String data) {
        try {
            return new String(data.getBytes(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            System.out.println("Unsupported Encoding: " + e.getMessage());
            return null;
        }
    }

    private String decodeFromUTF8(String data) {
        try {
            return new String(data.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            System.out.println("Unsupported Encoding: " + e.getMessage());
            return null;
        }
    }
}

