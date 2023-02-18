
# Problem Solving Challenge

The project contains an implementation of the challenge sheet using both Java and Go, test cases written for both projects. The algorithims and techniques used for both projects are the same with only small semantic differences depending on each languages's details.

The questions that do not require coding the solution will be here in the next section.

For the palindrome questions I am handling the following strings as valid palindromes as they read the same way backwards and forwards

A man, a plan, a canal – Panama\
no lemon, no melon\
taco cat\
never odd or even


## Theoretical Questions

### Question 7

1- Fill Container B until it is full (3 Litres) from the source\
2- Fill Container A with the 3 litres in Container B\
3- Fill Container B with 3 litres again from the source\
4- Fill Container A until it is full with the water in Container B ( At this point there will be 5 litres A and 1 in B )\
5- Return the water in A to the source until it is empty again\
6- Fill A with the 1 liter in B\
7- Fill B until it is full with 3 litres from the source\
8- Fill A with all the water in B now the water in A will be exactly 4 litres


### Question 8


For both the Java and Go implementations hashing is being made use of to keep track of duplicates

Runtime Complextity = O(N)
Space Complextity = O(N)



## Setup Guide

### Java ###

This is a maven java project with unit tests included for all the answers. The main package contains the answers and the tests are in the test package

src/main/ and src/test

To run the tests you can either use Maven if it is installed or the Maven Wrapper in the project

First navigate to the java directory

Maven:
```
mvn test

```


Maven wrapper:
```
./mvnw test

```

Or using your IDE the tests are located in the tests package



### Go ###

The answers are located in the questions folder and the tests are in the tests folder

To run the tests navigate to the go directory and run 

```
go mod tidy

go mod vendor

go test ./tests -v

```

Or using your IDE the tests are located in the tests folder
