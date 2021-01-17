x1, y1 = [float(x) for x in input().split()]
x2, y2 = [float(x) for x in input().split()]
p1 = (x2 - x1)**2
p2 = (y2 - y1)**2
resposta = (p1 + p2)**0.5
print("%.4f"%resposta)