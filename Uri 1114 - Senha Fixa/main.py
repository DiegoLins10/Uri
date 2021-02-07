a = int(input(''))
senha = 2002
while (a != senha):
    print("Senha Invalida")
    a = int(input(''))
    if senha == a:
        print('Acesso Permitido')