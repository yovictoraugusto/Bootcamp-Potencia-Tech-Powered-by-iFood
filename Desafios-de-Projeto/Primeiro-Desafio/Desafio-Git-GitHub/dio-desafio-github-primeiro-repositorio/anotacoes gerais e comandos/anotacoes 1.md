git config —lis

- Origin é apenas um apelido para não ficar colocando o link toda hora

![](/home/victor/Downloads/Untitled1.png)

```
git remote add origin https://github.com/yovictoraugusto/livro-receitas.git
git branch -M main
git push -u origin main
```

Primeiro cria o repositorio no GitHub e depois da git clone

- touch→cria um arquivo


PASSO A PASSO:

- git add *
    - Ou git add nome_arquivo
- git commit -m “mensagem”
- git push -u origin main
- Victor
- Token
- PRONTO!

---
13/10
Quando duas máquinas tentam atualizar o código na ms linha o GitHub dá a permissão para que haja a escolha manualmente

- git pull origin master
- git status
- git add *
- git commit -m ‘resolve conflitos’
- git push origin master

---
gitignore: usado para ignorar alguns trechos
## Anotações - Conceitos Branches

Branches?

- Bifurcação do ramo principal, uma nova funcionalidade
- “Galho”
- Depois pode unir com o main, fundir as bifurcações
- commit -m merge

Main ou master

- Dois nomes de branches

```bash
touche arquivo-teste.md

git status

git add .

git commit -m "adicionando arquivo teste"

git remote -v
	(sem respostas)

git remote add origin git@github.com:yovictoraugusto/teste-branche.git

git remote -v
	(com resposta)

git pull origin main
	(da um erro devido já haver um commit no GitHub)

git branch
	(cria uma ramificação)

git push origin master
	(gera um commit,porém vai ter duas branches no GitHub)

```

---

tag Head

- Aponta para o último commit em um branch, um pontado

[Visualizing Git](https://git-school.github.io/visualizing-git/)

```bash
git checkout -b nova-branc
	(cria uma branch e a partir desse ponto os
	commit serão realizados nela- VE CODIGO ABAIXO)

git checkout master
	(Volta para a branch master(principal))

git merge nova-branch
	Junta a nova-brang com a master
```

---

```bash
git checkout -b nova-funcionalidade
	(usado para se movimentar, sair da branch main)
	-b: significa branch

echo > arquivo2.txt

git status

git checkout main

//git branch -d novafuncionalidade
	//Apaga a branch novafuncionalidade

git checkout nova-funcionalidade

git add *

git commit -m "Adiciona arquivo 2 na branch nova"

git push origin nova-funcionalidade
```

uma branch nova leva todos os arquivos da branch q ela se originou para depois pode se fundir

```bash
git merge nova-funcionalidade
	Usado par unir as branch

git checkout .
	removerá todas as modificações para o último commi
	Apenas se não foir realizado git add

git reset
	Desfaz o git add

git branch
	Lista branches

```

[Comandos do Git que você precisa conhecer - Parte 1](https://www.treinaweb.com.br/blog/comandos-do-git-que-voce-precisa-conhecer-parte-1)

Comandos git

```bash
rm -rf nome-diretorio
```

---

## Anotações - Visualização de histórico

- Stash é um stop temporário

```bash
git checkout nova-funcionalidade
	Fui para a branch

git branch -m funcionalidade
	mudei o nome

git checout main

git branch -m funcionalidade nova-funcionalidade
	Fui para a main e de lá mudei o nome

git checkout -b nova-funcionalidade
```

```bash
git checkout -b funcao

git stash save "Teste"
	Cria uma "pasta" como os arquivos que voce estava trabalhando

git stash list
	Mostra todos os stash

echo > arquivo6.txt

git add *

git stash
	Tira o contexto e aponta para o ulitmo commit

git stash pop 1
	Pego os arquivos so stash para usar novamente

git stash clear
	Limpa o stash
```

---

- Git log: Para visualizar o histórico
- E→cancela a visualização do log
- git log nome_diretorio
    - Filtra por diretorio
- git log READ.md
    - Log do arquivo
- git log --oneline
    - Traz o log de modo resumida
- git log --graph
    - Traz de modo “gráfico”
- gitk
    - Abre um app com uma visão mais gráfica (windows)
    - Para Linux: GitKraken, SourceTree
    
    ---

## Anotações - Como reverter commits

Pode resultar em destruição de commit

git revert x git reset

```bash
git reset 8fs7lxc1
	reverter pelo hash de um commit

git reset HEAD~1
	orientando pela HEAD
	A head sempre está no último commit valido
	Esse comando significa: Olhe onde a Head está
	...e move um para atrás

git reset --soft HEAD~1
	Volta para o ponto antes do commit a depois 
	...do add *
	Também funciona se omitir HEAD~1

git reset --mixed
	Move pra Working dir. antes do git add *

git reset --hard
	Apaga tudo, não move para um estado anterior
	Apaga tudo 

git reset --force
	

git restore --staged
	Em teste o comando ainda
```

---

```bash
git revert
	Pode usar HEAD ou hash
	manipula apenas o commit
	Faz o reverso do commit, se adiciona uma linha
	...ele tira, se cria um arquivo, ele apaga o 
	...arquivo
	Para esse ele cria um novo commit

```

---

Quando for realizado com um commit que já sofreu push vai dar erro, para arrumar temos que dar um pull, em seguida resolver os conflitos para então realizar o push