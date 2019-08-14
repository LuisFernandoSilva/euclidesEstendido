# euclidesEstendido
A aplicação feita em java, tem como objetivo mostrar o funcionamento do equação criada por euclides dentro da criptografia RSA.
Sendo uma extensão d0 Euclides,  que calcula os coeficientes da identidade de bezout que são números inteiros x e y tal que:
      ax+by=MDC(a,b).
	Útil para quando a e b são coprimos já que x e inverso multiplicativo de a e b o do y,  assim usado na criptografia RSA.
	obedecendo as mesmas regras padrões porem adicionando algumas tais como:
	- se utiliza os coeficientes alem dos remanescentes das divisões euclidianas.
	- o calculo encerra, quando o ultimo divisor com  resto e 0 e 1 entao sabemos que o mdc  e  1.
	- Para se calcular necessita se guardar os valores referentes a (x,y)
e definir valores que tenhamos igualdades básicas validas, Exemplo: (1,0) e (0,1).

Para calcular a chaves que serão usadas no RSA, vamos ter as duas chaves publicas.
Um modulo (n) e um expoente (e) públicos e encontrar um expoente privado (d).
Escolhemos dois números primos, p e q multiplicamos sendo esse resultado o nosso 
modulo publico. Para o Expoente publico usamos esses dois números primos e aplicamos
a função de Totiente ou Euler (p-1) * (q-1)  o resultado aplicado o mdc. 
Tendo os números  que são múltiplos divisores comuns se escolhe um numero primo que
 não seja divisível por num desses encontrados. Com isso temos nosso expoente publico.
Tendo esses dois números vamos aplicar o algoritmo de Euclides Estendido.


