a,b,c= [float(x) for x in input().split()]
pi=3.14159
tri=(a*c)/2
circ=pi*c**2
trap=(a+b)*c/2
quad=b**2
reta=a*b
print('TRIANGULO: %.3f'%tri)
print('CIRCULO: %.3f'%circ)
print('TRAPEZIO: %.3f'%trap)
print('QUADRADO: %.3f'%quad)
print('RETANGULO: %.3f'%reta)