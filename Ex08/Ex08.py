k = int(input())

valores = []

valores = [int(x) for x in input().split()[:k]]

real = float(input())

print(f"SOMA_BRUTA: {sum(valores)}")
print(f"SOMA_ESCALADA: {sum(valores) * real:.2f}")

xorCheck = 0

for valor in valores:
    xorCheck^=valor

print(f"XOR_CHECK: {xorCheck}")

media = sum(valores) // k
print(f"MEDIA_INT: {media}")

qtdAcimaMedia = 0
primeiro = True

print("ACIMA_MEDIA:", end=" ")

for valor in valores:
    if valor > media:
        if not primeiro:
            print(" ", end="")
        print(valor, end="")
        primeiro = False
        qtdAcimaMedia += 1

if (qtdAcimaMedia == 0):
    print("NENHUM", end="")

print()

if xorCheck == 0:
    print("STATUS: OK")
else:
    print(f"STATUS: ERRO {xorCheck}")