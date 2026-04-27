# Calculadora de Materiais para Obra Residencial

**Aviso:** Professor, eu fiz um read me para ficar bonitinho e explicativo, não sei se teria algum problema.

Esse aqui é o meu projeto em Java usando Spring Boot para calcular a quantidade de materiais da obra. Ele modela a planta da casa e tem os endpoints que foram pedidos no desafio.

### Como ficou a estrutura:
- **PlantaBaixa, Parede, Pilar, Esquadria:** Modelam a casa como um grafo (sendo parede a aresta e pilar o vértice).
- **Endpoint 1 (`/api/engenharia/calc-fundacao`):** Recebe as medidas e retorna o volume de concreto das vigas.
- **Endpoint 2 (`/api/engenharia/calc-tijolos`):** Retorna quantos tijolos precisa pra levantar a parede, já tirando a área do buraco das portas e janelas.

O arquivo com os resultados do teste estão no `PDF_YURI_RESULTADO.pdf` aqui mesmo na pasta.
