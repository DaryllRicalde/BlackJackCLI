# BlackjackCLI
A BlackJack game made in Java played through the command line

## Classes
The implementations of the classes are located in src/
#### Main - Program entry point
#### Game - Starts the game and initializes all the key classes
#### Player - The user that will be playing the game 
#### Dealer - The user has to beat the dealer by getting a hand closer to 21
#### Person - The parent class of the Player and the Dealer. Generalizes how both classes needs cards, and must sum up these cards
#### Hand - To represent the cards that the Player/s and Dealer are holding
#### Deck - To hold multiple cards and perform shuffles
#### Card - Represents a card in a normal set of cards (excluding the joker)

## How to play
```
cd src/
javac Main.java
```
