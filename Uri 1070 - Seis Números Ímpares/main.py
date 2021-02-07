num = int(input())
impares = [n for n in range(num,num+12) if n % 2 != 0]
for n in impares:
    print(n)