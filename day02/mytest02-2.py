# 1~9까지의 수 중에서 3가지를 랜덤 중복없이 출력하시오
import random

#방법2
arr9 = [1, 2, 3, 4, 5, 6, 7, 8, 9]
arr3 = []

while True:
    rnd = int(random.random() * 9)
    if arr9[rnd] == -1:
        pass
    else:
        arr3.append(arr9[rnd])
        arr9[rnd] = -1
    if len(arr3) >= 3:
        break
    
print(arr3)        
    

# while True:
#
#     ran1 = int(random.random() * 9 + 1)
#     ran2 = int(random.random() * 9 + 1)
#     ran3 = int(random.random() * 9 + 1)
#
#     if ran1 != ran2 and ran1 != ran3 and ran2 != ran3: break
#
# print(ran1,ran2,ran3)



    