#hello everyone...
ask = input("do you want to take a quick quiz ? ")
if(ask == "yes"):
    print("okk then, let's go !")
    q1 = input("what is the capital of India ? ")
    if(q1 == "new delhi"):
        print("correct !")
    else:
        print("better luck next time :)")
    
    q2 = input("what language do most Indians speak ? ")
    if(q2 == "hindi"):
        print("correct !")
    else:
        print("better luck next time :)")

#now completing the first if statement set....

elif(ask == "no"):
    print("then get out of here !!")
else:
    print("please type yes/no.")