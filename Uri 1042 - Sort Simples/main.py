a, b, c = [int(x) for x in input().split()]
if (a > b) and (a > c) and (b > c):
    print("%d"%c)
    print("%d"%b)
    print("%d"%a)
elif (b > a) and (b > c) and (c > a):
    print("%d"%a)
    print("%d"%c)
    print("%d"%b)
elif (c > a) and (c > b) and (a > b): 
    print("%d"%b)
    print("%d"%a)
    print("%d"%c)
elif (c > a) and (c > b) and (b > a):
    print("%d"%a)
    print("%d"%b)
    print("%d"%c)
elif (b > a) and (b > c) and (a > c):
    print("%d"%c)
    print("%d"%a)
    print("%d"%b)
elif a > b and a>c and c>b:
    print("%d"%b)
    print("%d"%c)
    print("%d"%a)
    
print("")
print("%d"%a)
print("%d"%b)
print("%d"%c)