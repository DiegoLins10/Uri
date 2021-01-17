idade = int(input(""))
anos = idade / 365 
meses = idade % 365 / 30
dias = idade % 365 % 30
print("%d ano(s)"%anos)
print("%d mes(es)"%meses)
print("%d dia(s)"%dias)