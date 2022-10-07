#!/usr/bin/env python
# coding: utf-8

# In[7]:


def diceGame():
    
    import random ##used for random number selection

    min = 1 ##minimum number on each die.
    
    playGame = input("Want to roll some dice? ")
    
    if playGame == 'yes':
        print()  ##for a space in the text for aesthetic purposes.
        faces = int(input("How many sides on a die? ")) ##choose the number of faces for the die.
        print()
        num_dice = int(input("How many dice? ")) ##choose the number of dice to roll.

        rolls = [] ##list to contain the dice rolls.

        for die in range(num_dice):  ##take the number from num_dice variable above. 
            dice_roll = random.randint(min, faces) ##random number generator between min on die and number of faces of the die.
            rolls.append(dice_roll) ##takes the numbers from dice_roll and adds the random dice roll to the list above - rolls.
            
        print()
        print("You have rolled: " + str(rolls)) ##converts the list rolls to a string, and prints each dice roll.
        print()
        print("Sum of the roll is ", sum(rolls)) ##gives you the sum of your dice rolls.
        print()
        playAgain = input("Would you like to play again? ")
        if playAgain == 'yes':
            return(diceGame()) ##restarts the dice game.
        else:
            print()
            print("Maybe play again anyways? ") ##ends the game.
            print()
            return(diceGame()) ##restarts the dice game.
    else:
        print()
        print("Fine be that way.") ##ends the game.


# In[8]:


diceGame()


# In[ ]:




