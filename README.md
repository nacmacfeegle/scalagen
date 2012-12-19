scalagen
========

Genetic and evolutionary algorithms in scala.

Welcome to my attempt to create an evolutionary system providing Genetic Algorithms and Genetic Programming
implementations in Scala. I recently took the set of Scala classes at Coursera and have decided to start
building on this in order to get more exposure to the language. Since I have a research background in Evolutionary
Algorithms, it made sense to combine these interests.

Since this is groing to be primarily a learning tool for me, the audience will be quite limited. If I manage to keep
this project active, it will hopefully be of use to some other interested coders / researchers.

### Some aims / goals
* Try to make the best use of the Scala language features as possible. I'm coming at this as a Java developer, so the
code will probably look very Java-like to begin with.
* Focus on TDD: (following the good practices introduced in Odersky's coursera classes).
* Extensibility. Initial GA and GP implementations will be created for sample problems/scenarios.
* Implementation milestones:
** GA: OneMax
** GP: Symbolic regression (training + out-of-sample testing)


### Design notes
GAs and GP have a lot in common and this needs to be considered in the design of the underlying evolutionary engine.
Common areas that make good candidates for base traits / classes:
* Individual
* Initialisation
* Selection
* Crossover
* Mutation
* Fitness function
* Configuration settings
* Statistics utilities
* RNG utilities

