# Javadéx

Projeto feito para o Trabalho Final da disciplina de Programação I da [Universidade Federal da Fronteira Sul - Chapecó/SC](https://cc.uffs.edu.br)

| 🖥️ Vitrine.Dev |     |
| -------------  | --- |
| :sparkles: Nome        | **Javadéx**
| :label: Tecnologias | java, swing, sql, sqlite, regex, netbeans, vscode
| 📄 Tarefa     | https://encr.pw/5vNT6
| 🎓 Curso | https://cc.uffs.edu.br

![](https://i.pinimg.com/originals/74/c2/f0/74c2f0be552806e0b686e1396751f4a9.gif#vitrinedev)

## Detalhes do projeto

Javadéx é um <strong>projeto 100%</strong> em Java que consiste na implementação de uma Pokedéx do Anime Pokémon, utilizando conceitos de Herança, Polimorfismo, Classes Abstratas, arquitetura MVC, NetBeans para Front-end, bibliotecas do SQL, Swing e Regex e Banco de Dados com tabelas relacionadas.

![image](https://user-images.githubusercontent.com/101435037/219979526-e7ab90d8-5da4-49c8-b85c-9a977826af60.png#vitrinedev)

### ▶️ Executando o projeto
Para execução do projeto, basta rodar o arquivo Main.java nas IDE's NetBeans ou VSCode, que está localizado na pasta src.

### 💡 Funcionalidades

#### Pokédex
O programa consiste em uma tela principal Pokédex, na qual possui uma tabela que lista todos Pokémons selvagens salvos no banco de dados e um filtro para melhorar suas buscas.

![image](https://user-images.githubusercontent.com/101435037/219979827-d4a233d5-a526-4cc4-9bd2-e3920ebd927d.png)

#### Detalhes do Pokémon
É possível ver a imagem do Pokémon quando a linha recebe foco, e quando clicada duas vezes, é mostrado os detalhes do Pokémon em questão.

![image](https://user-images.githubusercontent.com/101435037/219979976-b1774116-502f-4c43-8840-55e5a0d48721.png)

#### Adicionar Pokémon Selvagem
Também podemos adicionar novos Pokémons ao precionar o botão "Adicionar Pokémon", que abre uma tela com um pequeno formulário.

![image](https://user-images.githubusercontent.com/101435037/219980121-5c48b8c0-3f02-4b44-9442-c6367abfa3b0.png)

Caso algum Pokémon que não seja os 151 primeiros for registrado, sua imagem será setada com a do MissigNo na tabela da Pokedéx e nos detalhes.

![image](https://user-images.githubusercontent.com/101435037/219980177-8e4412a9-91c2-4cc3-8481-fb1349d9ec04.png)

#### Treinadores
A segunda tela pode ser acessada no botão "Visualizar Treinadores" que também possui funcionalidades semelhantes aos da Pokédex, com filtros e tabela de treinadores.

![image](https://user-images.githubusercontent.com/101435037/219980630-4814c035-23c3-404b-aa4a-d63ddc8da923.png)

#### Imagens dos treinadores
Quando a linha de um treinador é selecionada, sua imagem é informada da mesma forma que a dos Pokémons da tela anterior.

![image](https://user-images.githubusercontent.com/101435037/219980696-985b3fd5-f63f-4ea5-a8a0-141db3eb86cd.png)

Caso algum treinador não tenha o seu nome no package images/trainers, recebe a imagem do Bug Catcher.

![image](https://user-images.githubusercontent.com/101435037/219980735-88649c32-18f7-4295-bf9c-c0d7c063c0d8.png)

#### Cadastro de treinadores
Ao pressionar o botão "Adicionar Treinador", a tela de cadastro é aberta com um pequeno formulário a ser preenchido.

![image](https://user-images.githubusercontent.com/101435037/219980913-e92d6e53-7c60-4df3-a6f3-674ce063b88b.png)

#### Editar um treinador
Para as próximas funcionalidades, é preciso primeiro selecioanr uma linha da tabela para continuar.

![image](https://user-images.githubusercontent.com/101435037/219980990-42acfde0-c131-4511-a9ac-bf0c52ae9734.png)

Selecionando um treinador da lista e apertando no botão "Editar Treinador", podemos mudar sua Região, Idade e Insígnias, além de poder administrar su time com os Pokémons Treinados.

![image](https://user-images.githubusercontent.com/101435037/219981094-0f794426-0fb2-49f4-aaed-1b8bae873c50.png)

#### Vincular Pokémons aos Treinadores
Selecionando um treinador da lista e apertando no botão "Vincular Pokémons aos Treinadores", podemos capturar os Pokémons selvagens que estão disponíveis e torná-los treinados, ou soltar eles na natureza, virando um Pokémon selvagem.

![image](https://user-images.githubusercontent.com/101435037/219981182-7cdbe1a7-473f-464b-bd22-3cb45773cc44.png)

#### Remover Treinador
Ao selecionar um registro da tabela e precissonar o botão Remover Treinador, é excluido seu registro e seus Pokémons treinados se tornam Pokémons selvagens.

## 🤝 Autores

| ![Lucas Smaniotto](https://github.com/lucassmaniotto.png) | ![Valtemir Junior](https://github.com/ValtemirJr.png)    |
| -------------  | --- |
| [Lucas Smaniotto](https://hello-world-lucassmaniotto.vercel.app)     | [Valtemir Junior](https://github.com/ValtemirJr)    |

