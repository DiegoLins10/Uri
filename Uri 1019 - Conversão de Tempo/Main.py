N = int(input(""))
horas = N // 3600
sl = N%3600
minutos = sl // 60 
segundos = sl%60
print('{}:{}:{}'.format(horas, minutos, segundos))