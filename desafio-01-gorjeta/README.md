# 🧮 Desafio 01 - Calculadora de Gorjeta

**Nível:** 🌱 Fundamentos  
**Conceitos:** `Scanner` • `operações matemáticas` • `printf` • `formatação`  
**Tempo estimado:** 30 minutos  
**Dificuldade:** ⭐☆☆☆☆

---

## 📋 Contexto Real

Você foi jantar com amigos em um restaurante. A conta chegou e vocês precisam dividir o valor entre todos, incluindo a gorjeta. Para não errar nas contas, você decide criar um programa que faça isso automaticamente.

---

## 🎯 Objetivo do Desafio

Criar um programa que:

1. Pergunte o valor total da conta
2. Pergunte quantas pessoas vão dividir
3. Pergunte qual percentual de gorjeta (10%, 15% ou 20%)
4. Calcule e mostre:
   - Valor da gorjeta
   - Total com gorjeta
   - Quanto cada pessoa vai pagar

---

## 📝 Exemplo de Execução

```
=== CALCULADORA DE GORJETA ===
Valor da conta: R$ 150.00
Número de pessoas: 5
Gorjeta (10, 15 ou 20%): 15

--- RESULTADO ---
Subtotal: R$ 150.00
Gorjeta (15%): R$ 22.50
Total: R$ 172.50
Cada pessoa paga: R$ 34.50
```

---

## 🪜 Roteiro de Micro-Passos (Siga EXATAMENTE essa ordem)

### ⚠️ REGRA DE OURO

**Teste cada passo ANTES de passar pro próximo!**

---

### 📍 Passo 1: Criar a estrutura básica (2 min)

**O que fazer:**

- Crie a classe `Main` com o método `main`
- Imprima apenas o título do programa

**Código esperado:**

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== CALCULADORA DE GORJETA ===");
    }
}
```

**✅ Checkpoint:** Rode o programa. Apareceu o título? SIM → Próximo passo!

---

### 📍 Passo 2: Pedir o valor da conta (3 min)

**O que fazer:**

- Importe o `Scanner`
- Crie um objeto Scanner
- Peça o valor da conta
- Por enquanto, apenas mostre o valor digitado

**Dica:** Use `nextDouble()` para receber números decimais

**✅ Checkpoint:** Digite um valor. O programa mostrou o que você digitou? SIM → Próximo!

---

### 📍 Passo 3: Pedir número de pessoas (2 min)

**O que fazer:**

- Peça quantas pessoas vão dividir
- Mostre o número digitado

**Dica:** Use `nextInt()` para números inteiros

**✅ Checkpoint:** Digite um número. Funcionou? SIM → Próximo!

---

### 📍 Passo 4: Pedir percentual de gorjeta (2 min)

**O que fazer:**

- Pergunte a gorjeta (10, 15 ou 20)
- Armazene em uma variável inteira
- Mostre o valor

**✅ Checkpoint:** O programa aceita o número? SIM → Próximo!

---

### 📍 Passo 5: Calcular a gorjeta (5 min)

**O que fazer:**

- Calcule o valor da gorjeta: `valorConta * (gorjeta / 100.0)`
- **ATENÇÃO:** Use `100.0` (com ponto) para não dar divisão inteira
- Mostre o resultado

**Dica:** Crie uma variável `valorGorjeta` para armazenar

**✅ Checkpoint:** Se conta = 100 e gorjeta = 10%, deve dar R$ 10.00. Deu certo? SIM → Próximo!

---

### 📍 Passo 6: Calcular total (3 min)

**O que fazer:**

- Some `valorConta + valorGorjeta`
- Armazene em uma variável `total`
- Mostre o resultado

**✅ Checkpoint:** Total = conta + gorjeta? SIM → Próximo!

---

### 📍 Passo 7: Calcular por pessoa (3 min)

**O que fazer:**

- Divida `total / numeroPessoas`
- Armazene em `porPessoa`
- Mostre o resultado

**✅ Checkpoint:** Se total = 110 e pessoas = 5, deve dar 22. Conferiu? SIM → Próximo!

---

### 📍 Passo 8: Formatar a saída (10 min)

**O que fazer:**

- Use `System.out.printf("%.2f", valor)` para formatar com 2 casas decimais
- Organize a saída como no exemplo
- Adicione linhas separadoras

**Dica:** `%.2f` formata números decimais com 2 casas

**✅ Checkpoint:** A saída ficou bonita como no exemplo? SIM → CONCLUÍDO! 🎉

---

## 🧠 Técnica: Comentário Primeiro

**ANTES de escrever código, escreva isso:**

```java
public class Main {
    public static void main(String[] args) {
        // 1. Criar Scanner

        // 2. Pedir valor da conta

        // 3. Pedir número de pessoas

        // 4. Pedir % de gorjeta

        // 5. Calcular valor da gorjeta

        // 6. Calcular total (conta + gorjeta)

        // 7. Calcular quanto cada um paga

        // 8. Mostrar tudo formatado

        // 9. Fechar Scanner
    }
}
```

**Agora preencha UM comentário por vez!**

---

## 💡 Conceitos Importantes

### 1. Scanner

```java
import java.util.Scanner;  // No topo do arquivo

Scanner sc = new Scanner(System.in);
double valor = sc.nextDouble();  // Para decimais
int numero = sc.nextInt();        // Para inteiros
sc.close();                       // Sempre feche no final
```

### 2. Formatação de Números

```java
System.out.printf("R$ %.2f\n", 150.5);  // R$ 150.50
System.out.printf("Total: %.2f\n", 23.456);  // Total: 23.46
```

### 3. Divisão de Decimais

```java
int gorjeta = 10;
double resultado = valorConta * (gorjeta / 100);     // ❌ ERRADO! Dá 0
double resultado = valorConta * (gorjeta / 100.0);   // ✅ CERTO!
```

---

## 🚧 Problemas Comuns e Soluções

| Problema            | Causa              | Solução                        |
| ------------------- | ------------------ | ------------------------------ |
| Gorjeta dá sempre 0 | Divisão inteira    | Use `100.0` em vez de `100`    |
| Erro ao ler decimal | Vírgula vs ponto   | Java usa ponto: `150.50`       |
| Números estranhos   | Sem formatação     | Use `printf("%.2f", valor)`    |
| Scanner não fecha   | Esqueceu `close()` | Adicione `sc.close()` no final |

---

## ✅ Checklist de Conclusão

Antes de marcar como concluído, verifique:

- [✅] Código compila sem erros
- [✅] Aceita entrada do usuário (conta, pessoas, gorjeta)
- [✅] Calcula gorjeta corretamente
- [✅] Calcula total corretamente
- [✅] Calcula valor por pessoa corretamente
- [✅] Formata valores com 2 casas decimais
- [✅] Saída está organizada e legível
- [✅] Scanner foi fechado com `close()`
- [✅] Testei com diferentes valores
- [✅] Código está comentado (pelo menos os principais passos)

---

## 💭 Espaço para Suas Anotações

### 🐛 Onde Travei?

_[Escreva aqui onde teve dificuldade]_

### 💡 O Que Aprendi?

_[Registre seus aprendizados]_

### 🔍 Dúvidas que Ficaram?

_[Anote para pesquisar depois]_

### ⏱️ Quanto Tempo Levei?

_[Registre para acompanhar evolução]_

---

## 🎯 Desafio Extra (Opcional)

Se terminou rápido, tente adicionar:

1. **Validação:** Só aceite gorjetas de 10, 15 ou 20%
2. **Loop:** Pergunte se quer calcular outra conta
3. **Desconto:** Adicione opção de cupom de desconto

---

## 📚 Recursos Para Estudar

- [Scanner em Java - Oracle Docs](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)
- [Printf em Java](https://www.baeldung.com/java-printstream-printf)
- [Operadores Matemáticos](https://www.w3schools.com/java/java_operators.asp)

---

## ➡️ Próximo Desafio

Quando concluir este, vá para: **[Desafio 02 - Validador de Senha](../desafio-02-senha/)**

---

<div align="center">

**"Cada linha de código que você escreve sozinho vale mais que 100 linhas que você lê."**

✅ **Marque este desafio como concluído no README principal!**

</div>
