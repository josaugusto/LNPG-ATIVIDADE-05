n = int(input())

valores = [float(x) for x in input().split()] 

print(f"MIN: {min(valores):.2f}")
print(f"MAX: {max(valores):.2f}")
media = sum(valores) / len(valores)
print(f"MEDIA: {media:.2f}")

if n == 1:
    print("INDEFINIDA")
else:
    variancia = sum((x - media) ** 2 for x in valores) / (len(valores) - 1)
    print(f"VARIANCIA: {variancia:.4f}")

qtdInteiros = 0
for v in valores:
    if v == int(v):
        qtdInteiros+=1

print(f"INTEIROS: {qtdInteiros}")

qtdAcimaMedia = 0
for v in valores:
    if v > media:
        qtdAcimaMedia+=1

print(f"ACIMA_MEDIA: {qtdAcimaMedia}")