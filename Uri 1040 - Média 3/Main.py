N1, N2, N3, N4 = [float(x) for x in input().split()]
media = ((N1*2) + (N2*3) + (N3*4) + (N4*1)) / 10
print("Media: %.1f"%media)
if media >= 7.0:
    print("Aluno aprovado.")
elif media < 5.0:
    print("Aluno reprovado.")
elif media >= 5.0 and media <= 6.9:
    print("Aluno em exame.")
    notaE = float(input(""))
    print("Nota do exame: %.1f"%notaE)
    M2 = (media + notaE) / 2 
    if M2 >= 5.0:
        print("Aluno aprovado.")
        print("Media final: %.1f"%M2)
    else:
        print("Aluno reprovado.")
        print("Media final: %.1f"%M2)