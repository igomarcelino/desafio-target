# Desafio Target
Estágio - Ribeirão Preto
<br>
<br>
<br>
<br>
1. Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência. 

IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

Caminho para a solução: [FIBONACCI](https://github.com/igomarcelino/desafio-target/blob/main/src/Fibonacci.java)

#

2. Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre. 

    IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código; 
Caminho para a solução: [Encontrar a Letra na Palavra](https://github.com/igomarcelino/desafio-target/blob/main/src/EncontreALetra.java)

3. Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA); <br>

    
Ao final do processamento, qual será o valor da variável SOMA?<br>

    
        int INDICE = 12, SOMA = 0, K = 1;
        enquanto K < INDICE faça { 
            K = K + 1; SOMA = SOMA + K; 
            
        }
        imprimir(SOMA);
        
        sendo assim 
        no passo 1 k vale 1 e indice 12 ( como 1 e menor que 12) k = k +1 e soma recebe soma + k = k(1+1 = 2) e soma(0+2 = 2)
        no passo 2 k vale 2 e indice 12 ( como 2 e menor que 12) k = k +1 e soma recebe soma + k = k(2+1 = 3) e soma(2+3 = 5)
        no passo 3 k vale 3 e indice 12 ( como 3 e menor que 12) k = k +1 e soma recebe soma + k = k(3+1 = 4) e soma(5+4 = 9)
        no passo 4 k vale 4 e indice 12 ( como 4 e menor que 12) k = k +1 e soma recebe soma + k = k(4+1 = 5) e soma(9+5 = 14)
        no passo 5 k vale 5 e indice 12 ( como 5 e menor que 12) k = k +1 e soma recebe soma + k = k(5+1 = 6) e soma(14+6 = 20)
        no passo 6 k vale 6 e indice 12 ( como 6 e menor que 12) k = k +1 e soma recebe soma + k = k(6+1 = 7) e soma(20+7 = 27)
        no passo 7 k vale 7 e indice 12 ( como 7 e menor que 12) k = k +1 e soma recebe soma + k = k(7+1 = 8) e soma(27+8 = 35)
        no passo 8 k vale 8 e indice 12 ( como 8 e menor que 12) k = k +1 e soma recebe soma + k = k(8+1 = 9) e soma(35+9 = 44)
        no passo 9 k vale 9 e indice 12 ( como 9 e menor que 12) k = k +1 e soma recebe soma + k = k(9+1 = 10) e soma(44+10 = 54)
        no passo 10 k vale 10 e indice 12 ( como 10 e menor que 12) k = k +1 e soma recebe soma + k = k(10+1 = 11) e soma(54+11 = 65)
        no passo 11 k vale 11 e indice 12 ( como 11 e menor que 12) k = k +1 e soma recebe soma + k = k(11+1 = 12) e soma(65+12 = 77)
        no passo 12 k vale 12 e indice 12 ( como 12 nao e menor que 12 o laco e interrompido o ultmo valor de SOMA e 77)
    
SOMA vale: 77  
[caminho para a solucao](https://github.com/igomarcelino/desafio-target/blob/main/src/SOMA.java)

#

4. Descubra a lógica e complete o próximo elemento: 
    <p>  a) 1, 3, 5, 7, _9__ pois (3-1) =2, (5-3)=2 , (7-5)=2 entao os numeros estao sendo acrescentados de 2 em 2 
    <p> b) 2, 4, 8, 16, 32, 64, __128__ pois todos os numeros da sequencia sao multiplos de 2 
    <p> c) 0, 1, 4, 9, 16, 25, 36, __49__    pois os numeros estao sendo somados a uma sequencia de numeros impares  
    <p> d) 4, 16, 36, 64, _100___   pois todas as raizes dao uma sequencia de numeros pares 2, 4 , 6, 8 
    <p> e) 1, 1, 2, 3, 5, 8, _13___ e a sequencia fibonacci 
    <p> f) 2,10, 12, 16, 17, 18, 19, __200__ todos os numeros comecam com a letra d , vi uma vez em uma pegadinha de uma prova


#

5.  Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?   
<br> Resposta
    <p> Ligaria um interruptor e deixaria um tempo para que a lampada esquentasse , desligaria e em uma das 3 salas uma lampada teria que estar quente nisso acharia o interruptor dessa sala . Na segunda ida a sala dos interruptor ja saberia qual pertence a ultima sala que fui ,repetiria o processo de ligar esperar a lampada esquentar e  desligar então iria nas ultimas 2 salas restante sabendo que umas das duas salas tem de ter uma lampada quente, nisso a lampada quente seria do 2 interruptor e a lampada fria do interruptor que eu não realizei o teste



