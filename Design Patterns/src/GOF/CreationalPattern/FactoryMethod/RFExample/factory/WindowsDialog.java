/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.CreationalPattern.FactoryMethod.RFExample.factory;

/**
 *
 * @author FA20-BSE-042
 */

import GOF.CreationalPattern.FactoryMethod.RFExample.buttons.Button;
import GOF.CreationalPattern.FactoryMethod.RFExample.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
