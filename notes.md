# Week 1
## Setup
- Installation includes JDK and sbt installation only
- `sbt about` shows the version being used

## Notes
- project and modules same as Java
- Scala worksheet sounds similar to IPython notebooks, but are different
    - not sure what these are yet
- scala classes seem similar to java classes 
- I tried creating a class with a main method but didn't work
- created an object inside a package that extends `App` class from Scala and whatever was written inside would run.
- `build.sbt` contains build info like version of scala used etc.
    - can also be used while opening an existing project, like we open pom files
- using the terminal to run projects
    - sbt contains an REPL that takes commands like `clean`, etc.
- SBT uses same directory structure as maven
- can run Scala interpreter inside SBT interpreter by typing `console` when in SBT REPL
- common commands in SBT REPL:
    - `compile` can be used to compile code
    - `run` runs all objects
    - `clean`
    - `test` runs all tests

## Terminology
- `sbt`: Scala build tool
    - interactive
    - parallel

