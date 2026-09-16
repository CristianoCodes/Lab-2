# compile main program
javac -d out c/*.java

# compile tests
javac -cp "out:junit-4.13.2.jar:hamcrest-core-1.3.jar" -d out u/*.java

# run main program
java -cp out PizzaStore

# run the tests
java -cp "out:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore PizzaFactoryTest