# 가위/바위/보 를 선택하세요 가위 Enter
# 나 : 가위
# 컴 : 바위
# 결과 : 졌습니다.
import random

com = ""
user = input("가위/바위/보를 입력하세요")
rnd = random.random() * 3

if rnd == 0:
    com = "가위"
elif rnd == 1:
    com = "바위"
else:
    com = "보"

if (user == "가위" and com == "보") or (user == "바위" and com == "가위") or (user == "보" and com == "바위"):
    print("user", user)
    print("com", com)
    print("이겼습니다.")
elif (user == "가위" and com == "바위") or (user == "바위" and com == "보") or (user == "보" and com == "가위"):
    print("user", user)
    print("com", com)
    print("졌습니다.")
else:
    print("user", user)
    print("com", com)
    print("비겼습니다.")

#result =""
#if com == "가위" and user == "가위": result = "비김"
#if com == "가위" and user == "바위": result = "이김"
#if com == "가위" and user == "보": result = "짐"
