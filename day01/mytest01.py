# 앞수를 넣으세요 1 Enter
# 끝수를 넣으세요 10 Enter
# 당신의 수의 합은 55입니다.

sum = 0
start = input("앞수를 넣으세요")
end = input("끝수를 넣으세요")

for i in range(int(start), int(end)+1):
    sum += i

#print("sum", sum)
print("당신의 수의 합은 {}입니다.".format(sum))