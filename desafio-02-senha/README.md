# 🔐 Desafio 02 - Validador de Senha Forte

**Nível:** 🌱 Fundamentos  
**Conceitos:** `String` • `while` • `condicionais` • `métodos de String` • `boolean`  
**Tempo estimado:** 40 minutos  
**Dificuldade:** ⭐⭐☆☆☆

---

## 📋 Contexto Real

Você está criando uma conta em um site. O sistema exige que sua senha seja forte, atendendo vários critérios de segurança. O programa deve continuar pedindo até você criar uma senha válida, mostrando quais critérios ainda faltam.

---

## 🎯 Objetivo do Desafio

Criar um programa que valida senha forte com os critérios:

1. Mínimo 8 caracteres
2. Pelo menos 1 letra maiúscula (A-Z)
3. Pelo menos 1 letra minúscula (a-z)
4. Pelo menos 1 número (0-9)
5. Pelo menos 1 caractere especial (!@#$%&\*)

O programa deve:

- Pedir a senha
- Verificar TODOS os critérios
- Mostrar quais critérios faltam
- Repetir até a senha ser válida

---

## 📝 Exemplo de Execução

```
=== CRIAR SENHA FORTE ===
Digite sua senha: abc123

❌ Senha fraca! Problemas encontrados:
- Menos de 8 caracteres (atual: 6)
- Falta letra maiúscula
- Falta caractere especial (!@#$%&*)

Digite sua senha: abcdefgh

❌ Senha fraca! Problemas encontrados:
- Falta letra maiúscula
- Falta número
- Falta caractere especial (!@#$%&*)

Digite sua senha: Abc@12345

✅ Senha forte! Todos os critérios atendidos.
✅ Sua conta foi criada com sucesso!
```

---

## 🪜 Roteiro de Micro-Passos

### 📍 Passo 1: Estrutura básica com loop (5 min)

**O que fazer:**

- Crie a estrutura com Scanner
- Crie um loop `while (true)` para repetir
- Peça a senha
- Por enquanto, apenas mostre a senha e quebre o loop com `break`

```java
// Estrutura esperada:
while (true) {
    // pedir senha
    // mostrar senha
    break; // temporário
}
```

**✅ Checkpoint:** O programa pede senha e mostra? SIM → Próximo!

---

### 📍 Passo 2: Verificar tamanho (5 min)

**O que fazer:**

- Armazene o tamanho da senha em uma variável: `senha.length()`
- Crie uma variável boolean `tamanhoOk`
- Se tamanho >= 8, `tamanhoOk = true`
- Mostre se passou ou não

**Dica:** Use `if (senha.length() >= 8)`

**✅ Checkpoint:** Digite "abc" → deve dizer que é curta. Digite "abcdefgh" → deve passar. Testou? SIM → Próximo!

---

### 📍 Passo 3: Verificar letra maiúscula (8 min)

**O que fazer:**

- Crie boolean `temMaiuscula = false`
- Use um loop `for` para percorrer cada caractere
- Use `Character.isUpperCase(senha.charAt(i))` para verificar
- Se encontrar, mude para `true` e saia do loop com `break`

**Dica:**

```java
for (int i = 0; i < senha.length(); i++) {
    char c = senha.charAt(i);
    if (Character.isUpperCase(c)) {
        temMaiuscula = true;
        break;
    }
}
```

**✅ Checkpoint:** "abc" → false. "Abc" → true. Testou? SIM → Próximo!

---

### 📍 Passo 4: Verificar letra minúscula (5 min)

**O que fazer:**

- Igual ao passo anterior, mas use `Character.isLowerCase(c)`
- Crie `temMinuscula`

**✅ Checkpoint:** "ABC" → false. "Abc" → true. Testou? SIM → Próximo!

---

### 📍 Passo 5: Verificar número (5 min)

**O que fazer:**

- Use `Character.isDigit(c)`
- Crie `temNumero`

**✅ Checkpoint:** "Abc" → false. "Abc1" → true. Testou? SIM → Próximo!

---

### 📍 Passo 6: Verificar caractere especial (7 min)

**O que fazer:**

- Crie uma String com os caracteres especiais: `"!@#$%&*"`
- Use `especiais.indexOf(c) != -1` para verificar se o caractere está nessa string
- Crie `temEspecial`

**Dica:**

```java
String especiais = "!@#$%&*";
if (especiais.indexOf(c) != -1) {
    temEspecial = true;
}
```

**✅ Checkpoint:** "Abc1" → false. "Abc1@" → true. Testou? SIM → Próximo!

---

### 📍 Passo 7: Mostrar problemas encontrados (10 min)

**O que fazer:**

- Após todas as verificações, use `if` para verificar cada critério
- Se algum for `false`, mostre qual problema
- Use `System.out.println("❌ Senha fraca! Problemas:");`

**Exemplo:**

```java
if (!tamanhoOk) {
    System.out.println("- Menos de 8 caracteres (atual: " + senha.length() + ")");
}
if (!temMaiuscula) {
    System.out.println("- Falta letra maiúscula");
}
// ... continuar para todos
```

**✅ Checkpoint:** Testou com senha fraca? Mostra todos os problemas? SIM → Próximo!

---

### 📍 Passo 8: Verificar se passou em tudo (5 min)

**O que fazer:**

- Crie uma condição que verifica se TODOS os booleans são `true`
- Se sim, mostre mensagem de sucesso e saia do loop com `break`
- Se não, continue o loop (peça senha novamente)

```java
if (tamanhoOk && temMaiuscula && temMinuscula && temNumero && temEspecial) {
    System.out.println("✅ Senha forte! Todos os critérios atendidos.");
    break;
}
```

**✅ Checkpoint:** Com senha válida "Abc@1234", sai do loop? SIM → CONCLUÍDO! 🎉

---

## 🧠 Técnica: Comentário Primeiro

```java
public class Main {
    public static void main(String[] args) {
        // 1. Criar Scanner

        // 2. Criar loop infinito

            // 3. Pedir senha

            // 4. Criar variáveis boolean para cada critério

            // 5. Verificar tamanho (>= 8)

            // 6. Percorrer cada caractere verificando:
                // - Tem maiúscula?
                // - Tem minúscula?
                // - Tem número?
                // - Tem especial?

            // 7. Se todos critérios OK → sucesso e sair

            // 8. Senão → mostrar problemas e repetir

        // 9. Fechar Scanner
    }
}
```

---

## 💡 Conceitos Importantes

### 1. Métodos de String

```java
String senha = "Abc@123";
int tamanho = senha.length();          // 7
char primeiro = senha.charAt(0);       // 'A'
```

### 2. Classe Character

```java
char c = 'A';
Character.isUpperCase(c);  // true
Character.isLowerCase(c);  // false
Character.isDigit(c);      // false
```

### 3. Verificar se String contém caractere

```java
String especiais = "!@#$";
if (especiais.indexOf('@') != -1) {  // -1 significa "não encontrou"
    System.out.println("Contém @");
}
```

### 4. Loop While Infinito

```java
while (true) {
    // código
    if (condicao) {
        break;  // sai do loop
    }
}
```

### 5. Operadores Lógicos

```java
if (a && b && c) {  // E lógico: todos devem ser true
if (a || b || c) {  // OU lógico: pelo menos um true
if (!a) {           // NOT lógico: inverte o valor
```

---

## 🚧 Problemas Comuns

| Problema               | Causa                       | Solução                              |
| ---------------------- | --------------------------- | ------------------------------------ | --- | ------ |
| Loop infinito          | Esqueceu o `break`          | Adicione `break` quando senha válida |
| Não encontra maiúscula | Não percorreu toda a string | Use `for` até `senha.length()`       |
| Especial não funciona  | Esqueceu algum caractere    | Verifique a string de especiais      |
| "sempre fraco"         | Condição errada             | Use `&&` (E), não `                  |     | ` (OU) |

---

## ✅ Checklist de Conclusão

- [ ] Loop funciona (pede senha até acertar)
- [ ] Verifica tamanho (mínimo 8)
- [ ] Verifica letra maiúscula
- [ ] Verifica letra minúscula
- [ ] Verifica número
- [ ] Verifica caractere especial
- [ ] Mostra TODOS os problemas encontrados
- [ ] Mostra quantos caracteres tem (no erro de tamanho)
- [ ] Mensagem de sucesso quando senha é forte
- [ ] Scanner está fechado
- [ ] Testei com várias senhas diferentes

---

## 💭 Espaço para Suas Anotações

### 🐛 Onde Travei?

### 💡 O Que Aprendi?

### 🔍 Dúvidas que Ficaram?

### ⏱️ Quanto Tempo Levei?

---

## 🎯 Desafio Extra (Opcional)

1. **Indicador visual:** Mostre ✅ ou ❌ para cada critério
2. **Força da senha:** Calcule pontuação (fraca, média, forte)
3. **Sugestão:** Se senha fraca, sugira uma senha forte aleatória
4. **Mostrar senha:** Adicione opção para mostrar/ocultar senha

---

## 📚 Recursos Úteis

- [Character Class - Oracle](https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html)
- [String Methods](https://www.w3schools.com/java/java_ref_string.asp)
- [Loop While](https://www.w3schools.com/java/java_while_loop.asp)

---

## ➡️ Próximo Desafio

**[Desafio 03 - Lista de Compras](../desafio-03-lista-compras/)**

---

<div align="center">

**"Cada erro que você encontra sozinho vale mais que 10 explicações."**

✅ **Marque este desafio como concluído!**

</div>
