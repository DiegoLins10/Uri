P1,quantidade1,valor1 = [float(x) for x in input().split()]
P2,quantidade2,valor2 = [float(x) for x in input().split()]
Total = (valor1*quantidade1) + (valor2*quantidade2)
print("VALOR A PAGAR: R$ %.2f"%Total)