# 📚 Desafio 04 - Biblioteca Pessoal (Primeira POO!)

**Nível:** 🌿 POO Essencial  
**Conceitos:** `classes` • `objetos` • `atributos` • `métodos` • `construtores` • `ArrayList<Objeto>`  
**Tempo estimado:** 60 minutos  
**Dificuldade:** ⭐⭐⭐⭐☆

---

## 🎉 PARABÉNS! Este é seu PRIMEIRO desafio POO!

Até agora você trabalhou só com tipos primitivos e Strings. Agora você vai criar suas **próprias classes** e **objetos**! Isso muda tudo! 🚀

---

## 📋 Contexto Real

Você tem vários livros em casa e quer organizar sua biblioteca pessoal. Em vez de ter várias listas separadas (títulos, autores, páginas), você vai criar um objeto `Livro` que agrupa todas essas informações.

---

## 🎯 Objetivo do Desafio

Criar:

1. Uma classe `Livro` com atributos e métodos
2. Um sistema com menu para gerenciar livros
3. Funcionalidades: adicionar, listar, marcar como lido, estatísticas

---

## 📝 Exemplo de Execução

```
=== MINHA BIBLIOTECA ===
1. Adicionar livro
2. Listar todos os livros
3. Listar livros lidos
4. Marcar livro como lido
5. Estatísticas
6. Sair

Escolha: 1
Título: 1984
Autor: George Orwell
Número de páginas: 416
✅ Livro adicionado!

Escolha: 2

--- MEUS LIVROS ---
1. 1984 - George Orwell (416 págs) [NÃO LIDO]
2. O Hobbit - J.R.R. Tolkien (310 págs) [LIDO ✓]
3. Clean Code - Robert Martin (464 págs) [NÃO LIDO]

Escolha: 4
Qual livro marcar como lido? (digite o número): 1
✅ "1984" marcado como lido!

Escolha: 5

📊 ESTATÍSTICAS DA BIBLIOTECA:
📚 Total de livros: 3
✅ Livros lidos: 2 (67%)
📖 Livros para ler: 1 (33%)
📄 Total de páginas: 1190
📖 Páginas lidas: 726
```

---

## 🪜 Roteiro de Micro-Passos

### 🎯 PARTE 1: CRIAR A CLASSE LIVRO

### 📍 Passo 1: Criar arquivo da classe (5 min)

**O que fazer:**

- Crie um novo arquivo chamado `Livro.java` (na mesma pasta do Main.java)
- Crie a estrutura básica da classe (vazia por enquanto)

```java
public class Livro {
    // Aqui vão os atributos

    // Aqui vai o construtor

    // Aqui vão os métodos
}
```

**✅ Checkpoint:** Arquivo criado? Compila sem erro? SIM → Próximo!

---

### 📍 Passo 2: Adicionar atributos (5 min)

**O que fazer:**

- Dentro da classe, adicione os atributos **PRIVADOS**:
  - `String titulo`
  - `String autor`
  - `int numeroPaginas`
  - `boolean lido` (começa como false)

```java
public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean lido;
}
```

**Por que private?** Encapsulamento! Protege os dados.

**✅ Checkpoint:** Atributos criados? SIM → Próximo!

---

### 📍 Passo 3: Criar construtor (8 min)

**O que fazer:**

- Crie um construtor que recebe titulo, autor e numeroPaginas
- Inicialize os atributos com os parâmetros
- Inicialize `lido` como `false`

```java
public Livro(String titulo, String autor, int numeroPaginas) {
    this.titulo = titulo;
    this.autor = autor;
    this.numeroPaginas = numeroPaginas;
    this.lido = false;  // Novo livro começa como não lido
}
```

**O que é `this`?** Diferencia o atributo do parâmetro.

**✅ Checkpoint:** Construtor criado? SIM → Próximo!

---

### 📍 Passo 4: Criar getters (7 min)

**O que fazer:**

- Crie métodos para PEGAR (get) cada atributo
- Como os atributos são private, precisamos de getters

```java
public String getTitulo() {
    return titulo;
}

public String getAutor() {
    return autor;
}

public int getNumeroPaginas() {
    return numeroPaginas;
}

public boolean isLido() {  // Para boolean, usa "is" em vez de "get"
    return lido;
}
```

**✅ Checkpoint:** Getters criados? SIM → Próximo!

---

### 📍 Passo 5: Criar método marcarComoLido() (3 min)

**O que fazer:**

- Crie um método que muda o `lido` para `true`

```java
public void marcarComoLido() {
    this.lido = true;
}
```

**✅ Checkpoint:** Método criado? SIM → Próximo!

---

### 📍 Passo 6: Criar método exibirInformacoes() (7 min)

**O que fazer:**

- Crie um método que imprime as informações do livro
- Mostre se está lido ou não

```java
public void exibirInformacoes() {
    String status = lido ? "[LIDO ✓]" : "[NÃO LIDO]";
    System.out.printf("%s - %s (%d págs) %s\n",
                      titulo, autor, numeroPaginas, status);
}
```

**✅ Checkpoint:** Classe Livro completa! SIM → Próximo!

---

### 🎯 PARTE 2: USAR A CLASSE NO MAIN

### 📍 Passo 7: Criar ArrayList de Livros (5 min)

**No Main.java:**

- Crie `ArrayList<Livro> biblioteca = new ArrayList<>();`
- Note que agora é `ArrayList<Livro>`, não `<String>` ou `<Double>`!

**✅ Checkpoint:** ArrayList criado? SIM → Próximo!

---

### 📍 Passo 8: Criar menu (5 min)

**O que fazer:**

- Crie o menu com 6 opções (igual desafio anterior)
- Use while + switch

**✅ Checkpoint:** Menu funciona? SIM → Próximo!

---

### 📍 Passo 9: Implementar adicionar livro (8 min)

**No case 1:**

```java
System.out.print("Título: ");
String titulo = scanner.nextLine();
System.out.print("Autor: ");
String autor = scanner.nextLine();
System.out.print("Número de páginas: ");
int paginas = scanner.nextInt();
scanner.nextLine();  // Limpar buffer

Livro novoLivro = new Livro(titulo, autor, paginas);
biblioteca.add(novoLivro);
System.out.println("✅ Livro adicionado!");
```

**Olha que mágico!** Você criou um OBJETO! 🎩✨

**✅ Checkpoint:** Consegue adicionar livros? SIM → Próximo!

---

### 📍 Passo 10: Implementar listar todos (7 min)

**No case 2:**

```java
if (biblioteca.isEmpty()) {
    System.out.println("📦 Biblioteca vazia!");
} else {
    System.out.println("\n--- MEUS LIVROS ---");
    for (int i = 0; i < biblioteca.size(); i++) {
        System.out.print((i + 1) + ". ");
        biblioteca.get(i).exibirInformacoes();
    }
}
```

**Olha só!** Chamamos o método do objeto! 🎉

**✅ Checkpoint:** Lista aparece? SIM → Próximo!

---

### 📍 Passo 11: Implementar listar apenas lidos (5 min)

**No case 3:**

- Loop pela biblioteca
- Use `if (livro.isLido())` para filtrar
- Exiba apenas os lidos

**✅ Checkpoint:** Filtra corretamente? SIM → Próximo!

---

### 📍 Passo 12: Implementar marcar como lido (8 min)

**No case 4:**

```java
// Primeiro mostrar lista (reutilize case 2)
System.out.print("Qual livro? (número): ");
int numero = scanner.nextInt();
int indice = numero - 1;

if (indice >= 0 && indice < biblioteca.size()) {
    Livro livro = biblioteca.get(indice);
    livro.marcarComoLido();
    System.out.println("✅ \"" + livro.getTitulo() + "\" marcado como lido!");
} else {
    System.out.println("❌ Número inválido!");
}
```

**✅ Checkpoint:** Marca como lido? SIM → Próximo!

---

### 📍 Passo 13: Implementar estatísticas (10 min)

**No case 5:**

```java
int totalLivros = biblioteca.size();
int livrosLidos = 0;
int totalPaginas = 0;
int paginasLidas = 0;

for (Livro livro : biblioteca) {  // For-each!
    totalPaginas += livro.getNumeroPaginas();
    if (livro.isLido()) {
        livrosLidos++;
        paginasLidas += livro.getNumeroPaginas();
    }
}

int livrosParaLer = totalLivros - livrosLidos;
double percentualLidos = (totalLivros > 0) ? (livrosLidos * 100.0 / totalLivros) : 0;

System.out.println("\n📊 ESTATÍSTICAS:");
System.out.println("📚 Total de livros: " + totalLivros);
System.out.printf("✅ Livros lidos: %d (%.0f%%)\n", livrosLidos, percentualLidos);
System.out.printf("📖 Para ler: %d (%.0f%%)\n", livrosParaLer, 100 - percentualLidos);
System.out.println("📄 Total de páginas: " + totalPaginas);
System.out.println("📖 Páginas lidas: " + paginasLidas);
```

**Novo:** `for (Livro livro : biblioteca)` é o **for-each**, mais elegante!

**✅ Checkpoint:** Estatísticas corretas? SIM → CONCLUÍDO! 🎉🎉🎉

---

## 🧠 Conceitos POO - MUITO IMPORTANTE!

### 1. Classe vs Objeto

```java
// CLASSE = Planta da casa (projeto)
public class Livro {
    private String titulo;
    // ...
}

// OBJETO = Casa construída (instância)
Livro livro1 = new Livro("1984", "Orwell", 416);
Livro livro2 = new Livro("Hobbit", "Tolkien", 310);
```

### 2. Encapsulamento

```java
// ❌ ERRADO - atributos públicos
public String titulo;

// ✅ CERTO - atributos privados + getters
private String titulo;
public String getTitulo() { return titulo; }
```

### 3. Construtor

```java
// Construtor: método especial para criar objetos
public Livro(String titulo, String autor, int paginas) {
    this.titulo = titulo;  // "this" = este objeto
    this.autor = autor;
    this.numeroPaginas = paginas;
    this.lido = false;
}
```

### 4. Métodos do Objeto

```java
// Método que FAZ algo com o objeto
public void marcarComoLido() {
    this.lido = true;
}

// Método que RETORNA algo do objeto
public String getTitulo() {
    return titulo;
}
```

### 5. ArrayList de Objetos

```java
ArrayList<Livro> biblioteca = new ArrayList<>();
biblioteca.add(new Livro("Clean Code", "Martin", 464));

Livro primeiro = biblioteca.get(0);
primeiro.marcarComoLido();  // Chama método do objeto
```

---

## ✅ Checklist de Conclusão

- [ ] Classe Livro criada em arquivo separado
- [ ] Atributos são PRIVATE
- [ ] Construtor inicializa tudo
- [ ] Getters para todos atributos
- [ ] Método marcarComoLido() funciona
- [ ] Método exibirInformacoes() funciona
- [ ] ArrayList é `ArrayList<Livro>`
- [ ] Menu com 6 opções
- [ ] Adicionar livro cria novo objeto
- [ ] Listar todos mostra os livros
- [ ] Listar lidos filtra corretamente
- [ ] Marcar como lido funciona
- [ ] Estatísticas calculam tudo certo
- [ ] Testei com vários livros

---

## 💭 Reflexão POO

### Antes (sem POO):

```java
ArrayList<String> titulos = new ArrayList<>();
ArrayList<String> autores = new ArrayList<>();
ArrayList<Integer> paginas = new ArrayList<>();
ArrayList<Boolean> lidos = new ArrayList<>();
// 4 listas separadas = confuso! 😰
```

### Depois (com POO):

```java
ArrayList<Livro> biblioteca = new ArrayList<>();
// 1 lista de objetos = organizado! 😎
```

---

## 🎯 Desafio Extra

1. **Adicionar setters:** Permitir editar título, autor ou páginas
2. **Data de leitura:** Adicionar atributo `LocalDate dataLeitura`
3. **Avaliação:** Adicionar nota de 1 a 5 estrelas
4. **Gênero:** Adicionar gênero literário (enum)
5. **Buscar:** Procurar livro por título ou autor

---

## ➡️ Próximo Desafio

**[Desafio 05 - Conversor de Moedas](../desafio-05-conversor/)**

---

<div align="center">

**"🎉 PARABÉNS! Você acabou de entrar no mundo da POO!"**

**"Agora você não programa apenas com dados, mas com OBJETOS que têm comportamento!"**

✅ **Marque este desafio como concluído!**

</div>
