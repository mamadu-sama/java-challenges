# 💱 Desafio 05 - Conversor de Moedas

**Nível:** 🌱 Fundamentos  
**Conceitos:** `métodos estáticos` • `parâmetros` • `retorno` • `organização de código`  
**Tempo estimado:** 40 minutos  
**Dificuldade:** ⭐⭐⭐☆☆

---

## 📋 Contexto Real

Você vai viajar e precisa converter valores entre diferentes moedas. Em vez de fazer todos os cálculos no `main`, você vai criar **métodos reutilizáveis** para cada conversão.

---

## 🎯 Objetivo

Criar métodos para converter entre moedas e um menu interativo que usa esses métodos.

Moedas suportadas:

- Real (BRL)
- Dólar Americano (USD)
- Euro (EUR)
- Libra Esterlina (GBP)

**Cotações fixas (simplificado):**

- 1 USD = 5.00 BRL
- 1 EUR = 5.50 BRL
- 1 GBP = 6.30 BRL

---

## 📝 Exemplo de Execução

```
=== CONVERSOR DE MOEDAS ===
1. Real → Dólar
2. Real → Euro
3. Real → Libra
4. Dólar → Real
5. Euro → Real
6. Libra → Real
7. Sair

Escolha: 1
Valor em Reais: 500.00

💰 R$ 500.00 = US$ 100.00

Escolha: 5
Valor em Euros: 50.00

💰 €50.00 = R$ 275.00
```

---

## 🪜 Roteiro de Micro-Passos

### 📍 Passo 1: Criar métodos de conversão (20 min)

**Antes do método `main`, crie:**

```java
public static double realParaDolar(double reais) {
    return reais / 5.0;
}

public static double realParaEuro(double reais) {
    return reais / 5.5;
}

public static double realParaLibra(double reais) {
    return reais / 6.3;
}

public static double dolarParaReal(double dolares) {
    return dolares * 5.0;
}

public static double euroParaReal(double euros) {
    return euros * 5.5;
}

public static double libraParaReal(double libras) {
    return libras * 6.3;
}
```

**O que é `static`?** Permite chamar o método sem criar objeto!

**✅ Checkpoint:** Métodos criados? Compilam? SIM → Próximo!

---

### 📍 Passo 2: Testar um método (5 min)

**No main, teste:**

```java
double resultado = realParaDolar(500);
System.out.println("R$ 500 = US$ " + resultado);
```

**✅ Checkpoint:** Mostra US$ 100.00? SIM → Próximo!

---

### 📍 Passo 3: Criar menu (10 min)

Igual aos desafios anteriores, crie menu com while + switch.

**✅ Checkpoint:** Menu funciona? SIM → Próximo!

---

### 📍 Passo 4: Implementar cada opção (15 min)

**Exemplo do case 1:**

```java
case 1:
    System.out.print("Valor em Reais: ");
    double reais = scanner.nextDouble();
    double dolares = realParaDolar(reais);
    System.out.printf("\n💰 R$ %.2f = US$ %.2f\n\n", reais, dolares);
    break;
```

Faça o mesmo para os outros 5 cases.

**✅ Checkpoint:** Todas conversões funcionam? SIM → CONCLUÍDO! 🎉

---

## 💡 Conceitos Importantes

### Métodos Estáticos

```java
// Declaração
public static double soma(double a, double b) {
    return a + b;
}

// Uso
double resultado = soma(5, 3);  // Sem criar objeto!
```

### Parâmetros e Retorno

```java
//        ↓ tipo retorno
public static double converter(double valor, double taxa) {
//                              ↑ parâmetros
    return valor * taxa;  // ← retorna resultado
}
```

---

## ✅ Checklist

- [ ] 6 métodos de conversão criados
- [ ] Métodos são `static`
- [ ] Menu com 7 opções
- [ ] Todas conversões funcionam
- [ ] Valores formatados (2 casas)
- [ ] Testei todas as opções

---

## 🎯 Extra

1. Adicionar mais moedas (Yen, Peso, etc)
2. Permitir usuário definir cotações
3. Criar método genérico: `converter(valor, de, para)`

---
