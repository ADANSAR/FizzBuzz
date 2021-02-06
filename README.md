## FizzBuzz

The FizzBuzz problem is a classic test given in coding interviews.

The task is simple: Print integers 1 to N, but print “...Fizz...” if an
integer is divisible by 3, “...Buzz...” if an integer is divisible by 5,
and both if an integer is divisible by both 3 and 5.


# Structure

```

FizzBuzzCombe
|____resources
| |____spring
|
|____src
| |____main
| | |____java
| | | |____com
| | | | |____fizzbuzz
| | | | | |____impl
| | | | | | |____parameters
| | | | | | | |____DefaultFizzBuzzMaxParameter.java
| | | | | | |____ApplicationContextHolder.java
| | | | | | |____Main.java
| | | | | | |____StandardFizzBuzz.java
| | | | | |____interfaces
| | | | | | |____parameters
| | | | | | | |____DefaultFizzBuzzMaxParameter.java
| | | | | | |____FizzBuzz.java
| | | | | |____model
| | | | | | |____FizzBuzzObject.java
| | | | | |____utils
| | | | | | |____Constants.java
| |____test
| | |____java
| | | |____FizzBuzzTest.java
| | | |____TestConstants.java
|
|____pom.xml
|____README.md

# Installation

##### Prerequisites

  - Jdk >= 1.8.

##### Compilation

1- The application can be run using the main class : com.fizzbuzz.impl.Main.

2- To run the tests :

```sh
$ mvn test
```

3- To build the application :

```sh
$ mvn build
```
