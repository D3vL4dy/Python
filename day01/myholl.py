import random

com = ""
mine = input("홀/짝을 입력하세요")
result = ""

rnd = random.random()
if rnd > 0.5:
    com = "홀"
elif rnd <= 0.5:
    com = "짝"

if rnd > 0.5:
    com = "홀"
elif rnd <= 0.5:
    com = "짝"

if com == mine:
    result = "이김"
else:
    result = "짐"

print("com", com)
print("mine", mine)
print("result", result)