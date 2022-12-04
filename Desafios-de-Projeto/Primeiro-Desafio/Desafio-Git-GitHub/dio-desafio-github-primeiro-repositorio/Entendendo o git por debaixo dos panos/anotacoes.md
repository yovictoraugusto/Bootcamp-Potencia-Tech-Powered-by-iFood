SHA→Algoritmo de Hash Seguro

- Gera um conjunto de caracteres de 40 dígitos únicos
- Forma curta de representar um arquivo

openss1 sha1 texto.txt

---

Blobs

- Armazena o objeto através do tipo, o tamanho e após um \0 mostra que conteúdo guardado
- echo ‘conteudo’ | git hash-object --stdin
- echo -e ‘blob 9\0conteudo’ | openssl sha1

![](/home/victor/Downloads/Untitled.png) 

Trees

- Armazena blob

![](/home/victor/Downloads/tree.png) 

Commits

![](/home/victor/Downloads/commit.png) 

- Aponta para um tree

Uma mudança em um blob reflete até o commit, tornando o git tão seguro

---

Chaves SSH: Comunicação segura e encriptografada entre duas máquinas

Token: