a = []
for i in range(5):
    n = int(input())
    a.append(int(n))

l = 0
m = 0
o = 0
p = 0
for j in range(5):
    if a[j] % 2 == 0:
        l += 1
    if a[j] % 2 == 1:
        m += 1
    if a[j] > 0:
        o += 1
    if a[j] < 0:
        p += 1
print('%d valor(es) par(es)'%l)
print("%d valor(es) impar(es)"%m)
print("%d valor(es) positivo(s)"%o)
print("%d valor(es) negativo(s)"%p) 