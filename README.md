# compile the implementation
javac -d out c/*.java

# compile the JUnit tests, with the implementation + JUnit jars on the classpath
javac -cp "out:junit-4.13.2.jar:hamcrest-core-1.3.jar" -d out u/*.java

# run the test class
java -cp "out:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore PizzaFactoryTest