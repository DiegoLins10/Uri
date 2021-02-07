salario = float(input(""))
if salario >= 0 and salario <= 400.00:
    A = salario * 0.15
    newB = A + salario
    print("Novo salario: %.2f"%newB)
    print("Reajuste ganho: %.2f"%A)
    print("Em percentual: 15 %")
elif salario >= 400.01 and salario <= 800.00:
    C = salario * 0.12
    newC = C + salario
    print("Novo salario: %.2f"%newC)
    print("Reajuste ganho: %.2f"%C)
    print("Em percentual: 12 %")
elif salario >= 800.01 and salario <= 1200.00:
    D = salario * 0.10
    newD = D + salario
    print("Novo salario: %.2f"%newD)
    print("Reajuste ganho: %.2f"%D)
    print("Em percentual: 10 %")
elif salario >= 1200.01 and salario <= 2000.00:
    E = salario * 0.07
    newE = E + salario 
    print("Novo salario: %.2f"%newE)
    print("Reajuste ganho: %.2f"%E)
    print("Em percentual: 7 %")
elif salario > 2000.01:
    F = salario * 0.04
    newF = F + salario
    print("Novo salario: %.2f"%newF)
    print("Reajuste ganho: %.2f"%F)
    print("Em percentual: 4 %")