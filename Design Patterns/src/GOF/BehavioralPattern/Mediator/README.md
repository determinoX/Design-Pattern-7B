# Mediator
## Intent
Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.
## Applicability
Use the Mediator pattern when

* a set of objects communicate in well-defined but complex ways. The resulting interdependencies are unstructured and difficult to understand.

* reusing an object is difficult because it refers to and communicates with many other objects.

* a behavior that's distributed between several classes should be customizable without a lot of subclassing.
## Structure
![Med](https://www.cs.unc.edu/~stotts/GOF/hires/Pictures/mediator.gif)
