from random import random

def myrandom():
    rnd = random()
    if rnd > 0.5:
        return 1
    else:
        return 0
    
rnd = myrandom()
print("rnd", rnd)