#Dia 01-100

'''Mergulhando na Aventura da Média Aleatória: Uma Função em Python

Missão: Criar uma função em Python que calcula a média da soma de três números aleatórios.

Regras:
    Utilizar apenas as coisas padrão do Python e suas libs, sem libs externas.
    Sem utilização de funções e libs externas
'''
import random

def media_tres_numeros():
    numeros = [random.randint(1,10000) for _ in range(3)]  # Gera uma lista de 3 números aleatórios
    media = sum(numeros) / 3  # Calcula a média dos números
    return numeros, media  # Retorna tanto os números quanto a média

# Chama a função e imprime os números sorteados e a média
numeros_sorteados, media = media_tres_numeros()
print("Números sorteados:", numeros_sorteados)
print("A média dos três números aleatórios é:", media)