# 🛠️ Git Commands Cheat Sheet

## 📊 Comandos Básicos

| Comando | O que faz | Exemplo | Observação |
|--------|----------|--------|-----------|
| git init | Inicia um repositório | git init | Cria a pasta .git |
| git clone | Clona um repositório | git clone <url> | Baixa projeto remoto |
| git add | Adiciona arquivos | git add . | Prepara para commit |
| git commit | Salva alterações | git commit -m "mensagem" | Cria um commit |
| git push | Envia para o remoto | git push origin main | Sobe código |
| git pull | Atualiza do remoto | git pull origin main | Fetch + merge |
| git fetch | Busca dados do remoto | git fetch origin main | Não aplica mudanças |
| git merge | Junta branches | git merge dev | Pode gerar conflitos |
| git checkout | Troca branch/arquivo | git checkout main | Pode ser substituído por switch |
| git switch | Troca branch | git switch main | Forma mais moderna |
| git branch | Lista/cria branch | git branch nova-branch | Gerencia branches |
| git status | Mostra estado | git status | Muito usado |
| git log | Histórico de commits | git log | Lista commits |

---

## 🔧 Comandos de Reset e Limpeza

| Comando | O que faz | Exemplo | Observação |
|--------|----------|--------|-----------|
| git reset --soft | Desfaz commit (mantém alterações) | git reset --soft HEAD~1 | Mantém no stage |
| git reset --mixed | Remove do stage | git reset --mixed HEAD~1 | Padrão |
| git reset --hard | Apaga tudo | git reset --hard HEAD~1 | ⚠️ Perigoso |
| git clean -fd | Remove arquivos não rastreados | git clean -fd | Remove arquivos e pastas |
| git clean -fx | Remove tudo (inclusive ignorados) | git clean -fx | ⚠️ Muito destrutivo |

---

## 🌐 Remote (GitHub)

| Comando | O que faz | Exemplo | Observação |
|--------|----------|--------|-----------|
| git remote add origin | Conecta ao remoto | git remote add origin <url> | "origin" é padrão |
| git remote -v | Lista remotos | git remote -v | Mostra URLs |
| git push -u origin main | Primeiro push | git push -u origin main | Define upstream |

---

## 🔠 Flags (Abreviações)

| Flag | Significado | Explicação |
|------|------------|-----------|
| -m | message | Define mensagem do commit |
| -u | upstream | Define branch padrão remoto |
| -f | force | Força execução |
| -d | delete / directory | Remove diretórios |
| -b | branch | Cria nova branch |
| -x | ignored | Inclui arquivos ignorados |
| --soft | suave | Mantém alterações |
| --mixed | padrão | Remove do stage |
| --hard | destrutivo | Apaga tudo |

---

## 🔀 Branch

| Comando | O que faz | Exemplo |
|--------|----------|--------|
| git branch | Lista branches | git branch |
| git branch nova | Cria branch | git branch nova |
| git checkout -b nova | Cria e troca | git checkout -b nova |
| git switch -c nova | Cria e troca (moderno) | git switch -c nova |
| git merge branch | Junta branch | git merge dev |

---

## ⚠️ Erros Comuns

### ❌ error: src refspec main does not match any
**Motivo:** ainda não existe commit

**Solução:**
```bash
git add .
git commit -m "primeiro commit"
git push -u origin main
