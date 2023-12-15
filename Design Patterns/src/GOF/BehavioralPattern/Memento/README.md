# Memento (Token)
## Intent
Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.
## Applicability

Use the Memento pattern when

* a snapshot of (some portion of) an object's state must be saved so that it can be restored to that state later, and
* a direct interface to obtaining the state would expose implementation details and break the object's encapsulation.

## Structure
![IC](https://www.cs.unc.edu/~stotts/GOF/hires/Pictures/memento.gif)
