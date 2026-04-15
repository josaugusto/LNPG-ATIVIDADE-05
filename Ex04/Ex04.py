valores = []

numeroDeValores = int(input())

for _ in range(numeroDeValores):
    valor = input()

    if valor == "True":
        valor = True
    elif valor == "False":
        valor = False
    else:
        try:
            valor = int(valor)
        except:
            try:
                valor = float(valor)
            except:
                continue  # ignora valores inválidos

    valores.append(valor)

soma = 0

for valor in valores:
    if isinstance(valor, bool):
        print(f"bool: {valor} (int={int(valor)})")
    elif isinstance(valor, int):
        print(f"int: {valor}")
        soma += valor
    elif isinstance(valor, float):
        print(f"float: {valor}")
        soma += valor

print(f"SOMA: {soma:.2f}")
