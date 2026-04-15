n = int(input())

escopo = {
    "global": None,
    "local": None
}

def set_global(v):
    global escopo
    escopo['global'] = v

def set_local(v):
    escopo['local'] = v

def read_global():
    print(f"GLOBAL: {escopo['global']}")

def read_local():
    if escopo['local'] is not None:
        print(f"LOCAL: {escopo['local']}")
    else:
        print(f"LOCAL: {escopo['global']}") 

def reset_local():
    escopo['local'] = None

for i in range(n):
    entradaDoUsuario = input()
    partesDoComando = entradaDoUsuario.split()

    comando = partesDoComando[0]

    if comando == "SET_GLOBAL":
        set_global(int(partesDoComando[1]))
    elif comando == "SET_LOCAL":
        set_local(int(partesDoComando[1]))
    elif comando == "READ_GLOBAL":
        read_global()
    elif comando == "READ_LOCAL":
        read_local()
    elif comando == "RESET_LOCAL":
        reset_local()

# saída final
if escopo["local"] is not None:
    print(f"HISTORICO: G={escopo['global']} L={escopo['local']}")
else:
    print(f"HISTORICO: G={escopo['global']} L=NENHUM")
