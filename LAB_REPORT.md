1. The lab objective was to build a pizza factory using a Java factory pattern. Also, to create an interesting scenario for running the pizza factory. I had to do all of this while following the Liskov principle.

2. There are 5 files dedicated to pizza types (4 toppings and one for invalid inputs). While the main Pizza file handles the general dialogue, the invidual files will use Override to create their own individual preparation dialogues (InvalidPizza will instantly end the program without outputting more, as there is no pizza to be made). If no input is detected, the program will call that out, then end. PizzaFactory handles the switch based on the user input, which is obtained from PizzaStore.

3. I wanted to make each dialogue unique depending on which pizza type you picked, and I wanted to add special dialogues for when you either input nothing or when you input something that is not an option.

4. My tests verify that the factory creates the correct pizza type for each of the four valid pizza options. I also included tests for null input because these cases require different behavior from the expected pizza orders.

5. I managed to get through this lab much better than the first one. I made sure to use the Liskov principle, which I think I ended up using as I should. It was very fun for me to work on, and I can't wait to see what more we can do in this class. I'm also starting to remember Java again, as I am more used to C++.

6. Just like in the first lab, I didn't use AI. I tried not to use the AI results too, only using YouTube videos and Stack Overflow. When I was figuring out how to implement my methods to have separate outputs for an empty input and an input that wasn't an option, I was struggling super hard. With some Google searches, I was able to figure out how to implemente these features while still following the Liskov principle.