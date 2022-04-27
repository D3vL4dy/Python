# 출력하고 싶은 단수를 입력하세요 6 Enter
# 6*1=6
# 6*2=6
# ...

num = int(input("출력하고 싶은 단수를 입력하세요"))

for i in range(1, 10):
    #print(num, "*", i, "=", num*i)
    print("{}*{}={}".format(num, i, num*i))

