# 🛒 Desafio 03 - Lista de Compras de Mercado

**Nível:** 🌱 Fundamentos  
**Conceitos:** `ArrayList` • `switch case` • `menu interativo` • `loop` • `manipulação de listas`  
**Tempo estimado:** 50 minutos  
**Dificuldade:** ⭐⭐⭐☆☆

---

## 📋 Contexto Real

Você vai ao mercado e precisa de um sistema para gerenciar sua lista de compras. O programa deve permitir adicionar itens com preços, remover itens, ver a lista completa e calcular o total que vai gastar.

---

## 🎯 Objetivo do Desafio

Criar um menu interativo com as opções:

1. Adicionar item (nome + preço)
2. Remover item
3. Mostrar lista completa
4. Calcular total
5. Sair

Usar **duas ArrayLists**: uma para nomes dos itens e outra para preços.

---

## 📝 Exemplo de Execução

```
=== LISTA DE COMPRAS ===
1. Adicionar item
2. Remover item
3. Ver lista
4. Calcular total
5. Sair

Escolha uma opção: 1

Nome do item: Arroz
Preço: R$ 25.50
✅ Item adicionado!

Escolha uma opção: 1

Nome do item: Feijão
Preço: R$ 8.90
✅ Item adicionado!

Escolha uma opção: 3

--- MINHA LISTA ---
1. Arroz - R$ 25.50
2. Feijão - R$ 8.90
3. Leite - R$ 4.50

Escolha uma opção: 4

💰 Total: R$ 38.90
📦 Total de itens: 3

Escolha uma opção: 2

Qual item remover? (digite o número): 2
✅ Feijão removido!

Escolha uma opção: 5

👋 Até logo! Boa compra!
```

---

## 🪜 Roteiro de Micro-Passos

### 📍 Passo 1: Criar as ArrayLists (5 min)

**O que fazer:**

- Importe `java.util.ArrayList`
- Crie duas ArrayLists no início do `main`:
  - `ArrayList<String> nomes = new ArrayList<>();`
  - `ArrayList<Double> precos = new ArrayList<>();`
- Não precisa do Scanner ainda, apenas teste criando as listas

**✅ Checkpoint:** Código compila? SIM → Próximo!

---

### 📍 Passo 2: Criar menu básico (10 min)

**O que fazer:**

- Crie um loop `while (true)`
- Dentro do loop, mostre o menu
- Peça a escolha do usuário (1 a 5)
- Use `switch (opcao)` com 5 cases
- Por enquanto, cada case apenas imprime "Você escolheu X"
- No case 5, use `break` para sair do loop

**Dica:** Use `System.out.println("\n=== MENU ===")` para separar

**✅ Checkpoint:** Menu aparece? Consegue escolher opções? Case 5 sai? SIM → Próximo!

---

### 📍 Passo 3: Implementar "Adicionar item" (10 min)

**O que fazer:**

- No `case 1:`
- Peça o nome do item (use `scanner.nextLine()`)
- Peça o preço (use `scanner.nextDouble()`)
- **IMPORTANTE:** Após `nextDouble()`, adicione `scanner.nextLine()` vazio para limpar o buffer
- Adicione nas listas: `nomes.add(nome)` e `precos.add(preco)`
- Mostre mensagem de sucesso

**ATENÇÃO ao bug do Scanner:**

```java
double preco = scanner.nextDouble();
scanner.nextLine();  // ← OBRIGATÓRIO! Limpa a quebra de linha
```

**✅ Checkpoint:** Consegue adicionar itens? SIM → Próximo!

---

### 📍 Passo 4: Implementar "Ver lista" (10 min)

**O que fazer:**

- No `case 3:`
- Verifique se a lista está vazia: `if (nomes.isEmpty())`
- Se vazia, mostre "📦 Lista vazia!"
- Senão, use um loop `for` de 0 até `nomes.size()`
- Mostre: `(i+1) + ". " + nomes.get(i) + " - R$ " + precos.get(i)`

**Dica para formatar:**

```java
System.out.printf("%d. %s - R$ %.2f\n", i+1, nomes.get(i), precos.get(i));
```

**✅ Checkpoint:** Lista mostra os itens formatados? SIM → Próximo!

---

### 📍 Passo 5: Implementar "Calcular total" (8 min)

**O que fazer:**

- No `case 4:`
- Crie uma variável `double total = 0`
- Use um loop `for` para percorrer a lista de preços
- Some cada preço: `total += precos.get(i)`
- Mostre o total formatado
- Mostre também quantos itens tem: `nomes.size()`

**✅ Checkpoint:** Total está correto? Soma todos os preços? SIM → Próximo!

---

### 📍 Passo 6: Implementar "Remover item" (12 min)

**O que fazer:**

- No `case 2:`
- Primeiro, mostre a lista (reutilize o código do case 3 ou chame ele)
- Peça o número do item a remover
- **VALIDAÇÃO:** Verifique se o número é válido (entre 1 e tamanho da lista)
- Remova das DUAS listas:
  - `nomes.remove(indice)`
  - `precos.remove(indice)`
- **ATENÇÃO:** O usuário digita de 1 a N, mas a lista começa em 0!

**Dica:**

```java
int numero = scanner.nextInt();
int indice = numero - 1;  // Converte de 1-based para 0-based

if (indice >= 0 && indice < nomes.size()) {
    String itemRemovido = nomes.get(indice);
    nomes.remove(indice);
    precos.remove(indice);
    System.out.println("✅ " + itemRemovido + " removido!");
} else {
    System.out.println("❌ Item inválido!");
}
```

**✅ Checkpoint:** Remove o item certo? Valida número inválido? SIM → Próximo!

---

### 📍 Passo 7: Melhorar o case 5 (sair) (3 min)

**O que fazer:**

- No `case 5:`
- Mostre uma mensagem de despedida
- Use `return;` para sair (melhor que break)
- Antes de sair, feche o Scanner

**✅ Checkpoint:** Sai do programa corretamente? SIM → Próximo!

---

### 📍 Passo 8: Adicionar case default (2 min)

**O que fazer:**

- Após todos os cases, adicione `default:`
- Mostre "❌ Opção inválida! Digite de 1 a 5."

**✅ Checkpoint:** Testa com número inválido (ex: 9)? Mostra erro? SIM → CONCLUÍDO! 🎉

---

## 🧠 Técnica: Comentário Primeiro

```java
public class Main {
    public static void main(String[] args) {
        // 1. Criar Scanner

        // 2. Criar duas ArrayLists (nomes e preços)

        // 3. Loop infinito do menu
        while (true) {
            // 4. Mostrar menu

            // 5. Ler opção

            // 6. Switch com 5 cases:

                // Case 1: Adicionar
                    // - Pedir nome
                    // - Pedir preço
                    // - Adicionar nas duas listas

                // Case 2: Remover
                    // - Mostrar lista
                    // - Pedir número
                    // - Validar
                    // - Remover das duas listas

                // Case 3: Ver lista
                    // - Loop mostrando todos itens

                // Case 4: Total
                    // - Somar todos preços
                    // - Mostrar total e quantidade

                // Case 5: Sair
                    // - Fechar scanner
                    // - Sair com return

                // Default:
                    // - Opção inválida
        }
    }
}
```

---

## 💡 Conceitos Importantes

### 1. ArrayList - Criar e Usar

```java
import java.util.ArrayList;

ArrayList<String> lista = new ArrayList<>();
lista.add("Item");              // Adiciona
lista.get(0);                   // Pega elemento no índice 0
lista.remove(0);                // Remove do índice 0
lista.size();                   // Tamanho da lista
lista.isEmpty();                // Verifica se está vazia
```

### 2. Switch Case

```java
switch (opcao) {
    case 1:
        // código
        break;
    case 2:
        // código
        break;
    default:
        // quando nenhum case corresponde
}
```

### 3. Bug do Scanner (MUITO IMPORTANTE!)

```java
// ❌ ERRADO - vai pular a próxima leitura de texto
double preco = scanner.nextDouble();
String nome = scanner.nextLine();  // PULA!

// ✅ CERTO - limpa o buffer
double preco = scanner.nextDouble();
scanner.nextLine();  // Limpa o \n
String nome = scanner.nextLine();  // Agora funciona!
```

### 4. Índices: Usuário vs Programa

```java
// Usuário vê:        1, 2, 3, 4
// ArrayList usa:     0, 1, 2, 3
// Por isso:
int numero = scanner.nextInt();
int indice = numero - 1;  // Converte
lista.remove(indice);
```

---

## 🚧 Problemas Comuns

| Problema                | Causa                              | Solução                                          |
| ----------------------- | ---------------------------------- | ------------------------------------------------ |
| Pula a leitura de texto | Bug do Scanner                     | `scanner.nextLine()` após `nextDouble()`         |
| Remove item errado      | Não converteu 1-based para 0-based | `indice = numero - 1`                            |
| "Index out of bounds"   | Índice inválido                    | Validar antes: `if (i >= 0 && i < lista.size())` |
| Loop infinito sem sair  | `break` não sai do while           | Use `return;` em vez de `break`                  |
| Listas desalinhadas     | Removeu de uma lista só            | Remova das DUAS listas                           |

---

## ✅ Checklist de Conclusão

- [ ] Menu aparece e funciona
- [ ] Opção 1: adiciona item com nome e preço
- [ ] Opção 2: remove item (com validação)
- [ ] Opção 3: mostra lista formatada
- [ ] Opção 4: calcula e mostra total
- [ ] Opção 5: sai do programa
- [ ] Default: trata opção inválida
- [ ] Lista vazia é tratada (não quebra)
- [ ] Preços formatados com 2 casas decimais
- [ ] Remoção remove das DUAS listas
- [ ] Bug do Scanner resolvido
- [ ] Testei várias operações seguidas

---

## 💭 Espaço para Suas Anotações

### 🐛 Onde Travei?

### 💡 O Que Aprendi?

### 🔍 Dúvidas que Ficaram?

### ⏱️ Quanto Tempo Levei?

---

## 🎯 Desafio Extra (Opcional)

1. **Editar item:** Adicione opção para editar nome ou preço
2. **Ordenar:** Ordene lista por nome ou preço
3. **Buscar:** Procure item pelo nome
4. **Salvar:** Salve lista em arquivo (avançado)
5. **Categorias:** Adicione categorias (frutas, carnes, etc)

---

## 📚 Recursos Úteis

- [ArrayList - Oracle](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)
- [Switch Statement](https://www.w3schools.com/java/java_switch.asp)
- [Scanner Buffer Problem](https://www.geeksforgeeks.org/why-is-scanner-skipping-nextline-after-use-of-other-next-functions/)

---

## ➡️ Próximo Desafio

**[Desafio 04 - Biblioteca Pessoal](../desafio-04-biblioteca/)** (Primeira POO!)

---

<div align="center">

**"ArrayList é seu novo melhor amigo. Trate-o bem!"**

✅ **Marque este desafio como concluído!**

</div>
