X, Y = [int(x) for x in input().split()]
while (X != Y):
    if X > Y:
        print('Decrescente')
        X, Y = [int(x) for x in input().split()]
    elif Y > X:
        print('Crescente')
        X, Y = [int(x) for x in input().split()]