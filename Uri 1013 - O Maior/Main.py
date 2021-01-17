A, B, C= [int(x) for x in input().split()]
MaiorAB = (A + B + abs(A - B)) / 2
MaiorAB = (C + MaiorAB + abs(MaiorAB - C)) / 2
print("%d eh o maior"%MaiorAB)