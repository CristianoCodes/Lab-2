# Compile main program
javac -d out c/*.java

# Compile tests
javac -cp "out:junit-4.13.2.jar:hamcrest-core-1.3.jar" -d out u/*.java

# Run main program
java -cp out PizzaStore

# Run the tests
java -cp "out:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore PizzaFactoryTest