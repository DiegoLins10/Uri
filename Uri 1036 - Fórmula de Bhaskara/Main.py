A, B, C = [float(x) for x in input().split()]
if A == 0.0 or (B**2 - 4 * A * C ) < 0:
    print("Impossivel calcular")
else:
    y1 = (- B + (B ** 2 - 4 * A * C) ** (1/2) )/(2 * A)
    print("R1 = %.5f"%y1)
    y2 = (- B - (B ** 2 - 4 * A * C) ** (1/2) )/(2 * A)
    print("R2 = %.5f"%y2)