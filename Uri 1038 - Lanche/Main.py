A, B = [int(x) for x in input().split()]
if A == 1:
    cachorro = 4.00 * B
    print("Total: R$ %.2f"%cachorro)
elif A == 2:
    Xsalada = 4.50 * B 
    print("Total: R$ %.2f"%Xsalada)
elif A == 3:
    Xbacon = 5.00 * B 
    print("Total: R$ %.2f"%Xbacon)
elif A == 4:
    torrada = 2.00 * B 
    print("Total: R$ %.2f"%torrada)
elif A == 5:
    refri = 1.50 * B
    print("Total: R$ %.2f"%refri)