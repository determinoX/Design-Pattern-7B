/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.CreationalPattern.FactoryMethod.Wikipedia.code1;

/**
 *
 * @author FA20-BSE-042
 */

public class PersonFactory {
    public IPerson getPerson(PersonType type) {
        switch (type) {
            case Rural:
                return new Villager();
            case Urban:
                return new CityPerson();
            default:
                throw new UnsupportedOperationException("Invalid PersonType");
        }
    }
}
