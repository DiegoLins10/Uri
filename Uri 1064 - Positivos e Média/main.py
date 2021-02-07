a = float(input(""))
b = float(input(""))
c = float(input(""))
d = float(input(""))
e = float(input(""))
f = float(input(""))
vp=0
m =0
t =[a,b,c,d,e,f]
for n in t:
  if n > 0:
    vp = vp + 1
    m = m + (n)
    media = m /vp
print("%d valores positivos"%vp)
print("%.1f"%media)