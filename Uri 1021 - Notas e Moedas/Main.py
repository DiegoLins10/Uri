n = float(input())

if (0 <= n <= 1000000.00):
  
  cem = n/100
  cin = n%100/50
  vin = n%50/20
  dez = n%100%50%20/10
  cinco = n%10/5
  dois = n%5/2
  um = n%100%50%20%10%5%2/1
  cc = n%1/0.5
  vc = n%0.5/0.25
  dz = n%100%50%20%10%5%2%1%0.5%0.25/0.1
  cincoc = n%100%50%20%10%5%2%1%0.5%0.25%0.1/0.05
  umc = n%100%50%20%10%5%2%1%0.5%0.25%0.1%0.05/0.01+0.01

  print("NOTAS:")
  print("%d nota(s) de R$ 100.00" %cem)
  print("%d nota(s) de R$ 50.00" %cin)
  print("%d nota(s) de R$ 20.00" %vin)
  print("%d nota(s) de R$ 10.00" %dez)
  print("%d nota(s) de R$ 5.00" %cinco)
  print("%d nota(s) de R$ 2.00" %dois)
  print("MOEDAS:")
  print("%d moeda(s) de R$ 1.00" %um)
  print("%d moeda(s) de R$ 0.50" %cc)
  print("%d moeda(s) de R$ 0.25" %vc)
  print("%d moeda(s) de R$ 0.10" %dz)
  print("%d moeda(s) de R$ 0.05" %cincoc)
  print("%d moeda(s) de R$ 0.01" %umc)