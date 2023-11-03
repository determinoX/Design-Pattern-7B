/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.ChainOfResponsibility;

/**
 *
 * @author FA20-BSE-042
 */
public class DatabaseLogger extends AbstractLogger{
      public DatabaseLogger(int level){
      this.level = level;
      }
    @Override
    protected void write(String message) {
        System.out.println("DatabaseLogger::Logger: "+ message); //To change body of generated methods, choose Tools | Templates.
    }
    
}
