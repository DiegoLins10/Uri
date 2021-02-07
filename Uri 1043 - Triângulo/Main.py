A, B, C = [float(x) for x in input().split()]
if abs(B - C) < A < (B + C) and (A - C) < B < (A + C) and (A - B) < C < (A + B):
    perimetro = A + B + C
    print("Perimetro = %.1f"%perimetro)
else:
    area = (((A + B) / 2) * C)
    print("Area = %.1f"%area)