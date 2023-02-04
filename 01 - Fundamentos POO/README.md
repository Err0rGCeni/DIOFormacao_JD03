# Fundamentos da Programação Orientada a Objetos com Java

## Conceito

- **Baixo Nível**: Linguagens mais próximas da interpretação da Máquina (C,Assembly);
- **Alto Nível**: Linguagens que disponibilizam uma proposta de sintaxe mais próxima da interpretação humana (C++, Java, JS, etc.);

- **Programação Estruturada**: Visa melhorar clareza, qualidade e tempo de desenvolvimento, fazendo uso extensivo de construções de fluxo de controle (if / then / else) e repetição (while / for), estruturas de bloco e sub-rotinas.
  - Algoritmos com estruturas sequenciais denominados de procedimentos lineares.
- **Programação Orientada a Objetos**: Abstração do mundo real, objetos com dados na forma de campos (atributos) e códigos na forma de procedimentos (metodos).

## Classes

Toda a estrutura de código na linguagem Java é distribuído em arquivos com extensão **.java** denominados de **classe**.

- Class, Identity, States (atributos), Behavior (métodos), New.

- Classe de Modelo (**model**): Classes que representem estrutura de domínio da aplicação (Cliente, Pedido, Nota, ...).
- Classe de Serviço (**service**): Classes que contém regras de negócio e validação do sistema.
- Classe de Repositório (**repository**): Classes que contém uma integração com banco de dados.
- Classe de Controle (**controller**): Classes que possuem a finalidade de disponibilizar alguma comunicação externa à aplicação (http web / wwebservices).
- Classe Utilitária (**util**): Classe que contém recursos comuns à toda aplicação.

## Pacotes

Os pacotes são subdiretórios a partir da pasta src do projeto, onde estão localizadas as classes da linguagem e novas que forem criadas. Todas as classes devem estar em um pacote.

Convenção para uma empresa chamada **Power Soft**:

- Comercial: com.powersoft
- Governamental: gov.powersoft
- Código Aberto: org.powersoft

Quando uma classe está organizada por pacotes, ela passa a ter duas identificações:  nome qualificado (endereçamento + nome) e nome simples: `com.controle.acesso.model` + `.Usuario`

A localização de uma classe é definida pela palavra reservada `package`. Logo, uma classe só contém uma definição de package no arquivo, sempre na primeira linha do código.

Para a utilização de uma classe existente em outro pacote, deve-se realizar sua importação `import`.

    package

    import ...
    import ...

    public class MinhaClasse {
        ...
    }

## Visibilidade

Três palavras reservadas e um conceito default (sem palavra reservada):

- `public`: Qualquer outro pacote pode visualizar os recursos.
- `protected`: Qualquer outro pacote pode visualizar os recursos, ou apenas subclasses fora do pacote.
- `private`: Apenas a classe pode acessar.
- `default`: Restringe a visibilidade por pacotes.

## Getters e Setters

- **Getter**: Retorna o valor do atributo especificado.
- **Setter**: Define outro novo valor para o atributo especificado.

Seguindo a conveção Java Beans, uma classe que contém uma estrutura de estados deve seguir as regras:

- Atributos precisam ter o modificador de acesso `private`;
- Com atributos somente a nível de classe, precisa-se dos métodos getX e setX (`public`);

## Construtores

Nome deverá ser igual ao nome da classe, sem retorno. Ao instanciar um objeto, passa-se os atributos iniciais como parâmetros.

## Enums

Tipo especial de classe onde os **objetos** são previamente criados, imutáveis e disponíveis por toda aplicação. Exemplos:

- Grau de Escolaridade: Analfabeto, Fundamental, ...
- Estado Civil: Solteiro, Casado, ...
- Estados Brasileiros: São Paulo, Piauí, ...

      // Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
      public enum EstadoBrasileiro {
        SAO_PAULO ("SP","São Paulo"),
        RIO_JANEIRO ("RJ", "Rio de Janeiro"),
        PIAUI ("PI", "Piauí"),
        MARANHAO ("MA","Maranhão") ;
        
        private String nome;
        private String sigla;
        
        private EstadoBrasileiro(String sigla, String nome) {
          this.sigla = sigla;
          this.nome = nome;
        }
        public String getSigla() {
          return sigla;
        }
        public String getNome() {
          return nome;
        }
        public String getNomeMaiusculo() {
          return nome.toUpperCase();
        }
        
      }

## [UML](https://glysns.gitbook.io/java-basico/programacao-orientada-a-objetos/uml)

> Linguagem de Modelagem Unificada ou UML, é uma notação, que possibilita a representação gráfica do projeto.
