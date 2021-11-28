play1 = input("Player 1 : Enter either rock/paper/scissor ")
play2 = input("Player 2 : Enter either rock/paper/scissor ")

if(play1 == "rock") :
    if(play2 == "paper") :
        print("Player 2 wins!")
    elif(play2 == "scissor") :
        print("Player 1 wins!")
    else:
        print("Wrong input")

if(play1 == "paper") :
    if(play2 == "scissor") :
        print("Player 2 wins!")
    elif(play2 == "rock") :
        print("Player 1 wins!")
    else:
        print("Wrong input")
        
if(play1 == "scissor") :
    if(play2 == "rock") :
        print("Player 2 wins!")
    elif(play2 == "paper") :
        print("Player 1 wins!")
    else:
        print("Wrong input")

