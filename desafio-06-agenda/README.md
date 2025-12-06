# 📇 Desafio 06 - Agenda de Contatos

**Nível:** 🌱 Fundamentos  
**Conceitos:** `classe Contato` • `busca` • `CRUD completo` • `validação`  
**Tempo estimado:** 70 minutos  
**Dificuldade:** ⭐⭐⭐⭐☆

---

## 📋 Contexto Real

Você precisa de uma agenda para organizar seus contatos com nome, telefone e email.

---

## 🎯 Objetivo

Criar sistema completo de CRUD:

- **C**reate (Adicionar)
- **R**ead (Listar/Buscar)
- **U**pdate (Editar)
- **D**elete (Remover)

---

## 📝 Exemplo de Execução

```
=== AGENDA DE CONTATOS ===
1. Adicionar contato
2. Listar todos
3. Buscar contato
4. Editar contato
5. Remover contato
6. Estatísticas
7. Sair

Escolha: 1
Nome: João Silva
Telefone: (11) 99999-9999
Email: joao@email.com
✅ Contato adicionado!

Escolha: 3
Buscar por (1-Nome / 2-Telefone): 1
Digite o nome: João

📞 RESULTADO:
Nome: João Silva
Telefone: (11) 99999-9999
Email: joao@email.com
```

---

## 🪜 Roteiro de Micro-Passos

### 📍 Passo 1: Criar classe Contato (15 min)

**Arquivo Contato.java:**

```java
public class Contato {
    private String nome;
    private String telefone;
    private String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    // Getters
    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }

    // Setters (para edição)
    public void setNome(String nome) { this.nome = nome; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setEmail(String email) { this.email = email; }

    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println();
    }
}
```

**✅ Checkpoint:** Classe criada? SIM → Próximo!

---

### 📍 Passo 2: Criar ArrayList e Menu (10 min)

No Main:

```java
ArrayList<Contato> agenda = new ArrayList<>();
// Menu com 7 opções
```

**✅ Checkpoint:** Estrutura pronta? SIM → Próximo!

---

### 📍 Passo 3: Adicionar contato (10 min)

```java
case 1:
    System.out.print("Nome: ");
    String nome = scanner.nextLine();
    System.out.print("Telefone: ");
    String telefone = scanner.nextLine();
    System.out.print("Email: ");
    String email = scanner.nextLine();

    agenda.add(new Contato(nome, telefone, email));
    System.out.println("✅ Contato adicionado!");
    break;
```

**✅ Checkpoint:** Adiciona? SIM → Próximo!

---

### 📍 Passo 4: Listar todos (8 min)

```java
case 2:
    if (agenda.isEmpty()) {
        System.out.println("📪 Agenda vazia!");
    } else {
        System.out.println("\n=== CONTATOS ===");
        for (int i = 0; i < agenda.size(); i++) {
            System.out.println((i+1) + ".");
            agenda.get(i).exibir();
        }
    }
    break;
```

**✅ Checkpoint:** Lista? SIM → Próximo!

---

### 📍 Passo 5: Buscar contato (15 min)

```java
case 3:
    System.out.println("Buscar por:");
    System.out.println("1. Nome");
    System.out.println("2. Telefone");
    int opcaoBusca = scanner.nextInt();
    scanner.nextLine();

    if (opcaoBusca == 1) {
        System.out.print("Digite o nome: ");
        String busca = scanner.nextLine().toLowerCase();

        boolean encontrou = false;
        for (Contato c : agenda) {
            if (c.getNome().toLowerCase().contains(busca)) {
                c.exibir();
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("❌ Nenhum contato encontrado!");
        }
    } else {
        // Implementar busca por telefone
    }
    break;
```

**Dica:** Use `.toLowerCase()` para busca case-insensitive!

**✅ Checkpoint:** Busca funciona? SIM → Próximo!

---

### 📍 Passo 6: Editar contato (12 min)

```java
case 4:
    // Listar contatos com números
    System.out.print("Qual contato editar? ");
    int indice = scanner.nextInt() - 1;
    scanner.nextLine();

    if (indice >= 0 && indice < agenda.size()) {
        Contato c = agenda.get(indice);

        System.out.println("O que editar?");
        System.out.println("1. Nome");
        System.out.println("2. Telefone");
        System.out.println("3. Email");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.print("Novo nome: ");
                c.setNome(scanner.nextLine());
                break;
            case 2:
                System.out.print("Novo telefone: ");
                c.setTelefone(scanner.nextLine());
                break;
            case 3:
                System.out.print("Novo email: ");
                c.setEmail(scanner.nextLine());
                break;
        }

        System.out.println("✅ Contato atualizado!");
    }
    break;
```

**✅ Checkpoint:** Edita? SIM → Próximo!

---

### 📍 Passo 7: Remover contato (8 min)

Similar ao que você já fez antes - liste e remova por índice.

**✅ Checkpoint:** Remove? SIM → Próximo!

---

### 📍 Passo 8: Estatísticas (7 min)

```java
case 6:
    System.out.println("\n📊 ESTATÍSTICAS:");
    System.out.println("📇 Total de contatos: " + agenda.size());

    int comEmail = 0;
    for (Contato c : agenda) {
        if (!c.getEmail().isEmpty()) {
            comEmail++;
        }
    }

    System.out.println("📧 Com email: " + comEmail);
    System.out.println("📱 Sem email: " + (agenda.size() - comEmail));
    break;
```

**✅ Checkpoint:** Mostra stats? SIM → CONCLUÍDO! 🎉

---

## ✅ Checklist Completo

- [ ] Classe Contato com 3 atributos
- [ ] Getters e Setters
- [ ] CRUD completo (Create, Read, Update, Delete)
- [ ] Busca por nome funciona
- [ ] Busca por telefone funciona
- [ ] Edição funciona (nome, telefone, email)
- [ ] Remoção funciona
- [ ] Estatísticas funcionam
- [ ] Validações (índices, lista vazia)
- [ ] Testei todas funcionalidades

---

## 🎯 Extra

1. **Validar email:** Verificar se tem @
2. **Validar telefone:** Aceitar só números
3. **Favoritos:** Marcar contatos importantes
4. **Aniversário:** Adicionar data de nascimento
5. **Exportar:** Salvar em arquivo .txt

---

## ➡️ Próximo Nível

**Parabéns! Você concluiu o Nível 1! 🎉**

Próximo: **[Nível 2 - POO Essencial](../desafio-07-banco/)**

---

<div align="center">

**"CRUD é a base de 80% dos sistemas reais. Você acabou de dominar isso!"**

✅ **Marque como concluído e comemore! 🎊**

</div>
