# 첫수를 넣으세요  1 Enter
# 끝수를 넣으세요  5 Enter
# 배수를 넣으세요  2 Enter
# 1에서부터 5까지의 2의 배수의 합은 6입니다.

start = int(input("첫수를 넣으세요"))
end = int(input("끝수를 넣으세요"))
num = int(input("배수를 넣으세요"))

sum = 0

for i in range(start, end + 1):
    if i % num == 0:
        sum += i

print("{}에서 {}까지 {}의 배수의 합은 {}입니다.".format(start, end, num, sum))       