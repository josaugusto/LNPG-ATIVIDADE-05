a = int(input())
b = int(input())
c = int(input())

primeiroResultado = a + b * c
print(f"{primeiroResultado}")
segundoResultado = a * b + b * c
print(f"{segundoResultado}")

if b != 0:
    divisaoInteira = a // b // c
    print(f"INTEIRO: {divisaoInteira}")
    divisaoReal = a / b / c
    print(f"REAL: {divisaoReal:.4f}")
else:
    print("INDEFINIDO")
    print("INDEFINIDO")

if primeiroResultado > 0:
    print("POSITIVO")
elif primeiroResultado < 0:
    print("NEGATIVO")
else:
    print("ZERO")