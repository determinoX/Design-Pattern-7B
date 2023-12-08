# Flyweight
## Intent
Use sharing to support large numbers of fine-grained objects efficiently.
## Applicability

Use the Facade pattern when

- The Flyweight pattern's effectiveness depends heavily on how and where it's used. Apply the Flyweight pattern when all of the following are true:

- An application uses a large number of objects.
  
- Storage costs are high because of the sheer quantity of objects.
  
- Most object state can be made extrinsic.
 
- Many groups of objects may be replaced by relatively few shared objects once extrinsic state is removed.
  
- The application doesn't depend on object identity. Since flyweight objects may be shared, identity tests will return true for conceptually distinct objects.
## Structure
![Alt text](https://www.cs.unc.edu/~stotts/GOF/hires/Pictures/flywe050.gif)
