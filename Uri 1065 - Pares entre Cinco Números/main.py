a = int(input(""))
b = int(input(""))
c = int(input(""))
d = int(input(""))
e = int(input(""))
if a%2 == 0:
    n1 = 1
else:
    n1 = 0
if b%2 == 0:
    n2 = 1
else:
    n2 = 0
if c%2 == 0:
    n3 = 1
else:
    n3 = 0
if d%2 == 0:
    n4 = 1 
else:
    n4 = 0
if e%2 == 0:
    n5 =  1
else:
    n5 = 0

soma = n1 + n2 + n3 + n4 + n5
print('%d valores pares'%soma)