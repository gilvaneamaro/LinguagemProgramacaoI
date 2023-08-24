# Teste de Mesa dos exercicios

* Exercicio 06 - Cálculo da Área do Retângulo

| Passo | `base` | `altura` | `area`       | Saída                                |
|-------|--------|----------|--------------|--------------------------------------|
| 1     | -      | -        | -            | -                                    |
| 2     | -      | -        | -            | -                                    |
| 3     | 5.0    | -        | -            | -                                    |
| 4     | 5.0    | 8.0      | 5.0 * 8.0    | -                                    |
| 5     | 5.0    | 8.0      | 40.0         | "A área do retângulo é 40.00"        |

Neste teste, estamos acompanhando o estado das variáveis `base`, `altura` e `area`. A área do retângulo é calculada multiplicando-se a `base` pela `altura`, e o resultado é formatado para impressão. No exemplo, a base é 5.0 e a altura é 8.0, resultando em uma área de 40.0. A mensagem "A área do retângulo é 40.00" é impressa.


* Exercício 07 - Cálculo de Dias Vividos

| Passo | `anos` | `meses` | `dias` | `totalDias`        | Saída                                  |
|-------|--------|---------|--------|-------------------|----------------------------------------|
| 1     | -      | -       | -      | -                 | -                                      |
| 2     | -      | -       | -      | -                 | -                                      |
| 3     | 25     | -       | -      | -                 | -                                      |
| 4     | 25     | 6       | -      | -                 | -                                      |
| 5     | 25     | 6       | 15     | 15 + 6 * 30 + 25 * 365 | -                                  |
| 6     | 25     | 6       | 15     | 21555             | "Essa pessoa já viveu 21555 dias."     |

Neste teste de mesa, estamos acompanhando o estado das variáveis `anos`, `meses`, `dias` e `totalDias`, bem como as operações realizadas no código. O código calcula o total de dias vividos considerando que 1 mês possui 30 dias e 1 ano possui 365 dias. No exemplo, a pessoa tem 25 anos, 6 meses e 15 dias, resultando em um total de 21555 dias vividos. A mensagem "Essa pessoa já viveu 21555 dias." é impressa.

* Exercício 09 - Reajuste Salarial

| Passo | `salario` | `reajuste` | Novo Valor do `salario` | Saída                                           |
|-------|-----------|------------|-------------------------|-------------------------------------------------|
| 1     | -         | -          | -                       | -                                               |
| 2     | -         | -          | -                       | -                                               |
| 3     | 2500.00   | -          | -                       | -                                               |
| 4     | 2500.00   | 10.0       | -                       | -                                               |
| 5     | 2500.00   | 10.0       | 2500.00 + 2500.00 * (10.0/100) | -                                    |
| 6     | 2500.00   | 10.0       | 2750.00                 | "O valor do novo salário será de R$2750.0"       |

Acompanhando as variáveis `salario`, `reajuste` e o novo valor de `salario`. O código calcula o novo salário após aplicar um reajuste percentual ao valor original. No exemplo, o salário é R$2500.00 e o reajuste é de 10.0%, resultando em um novo salário de R$2750.00. A mensagem "O valor do novo salário será de R$2750.0" é impressa.

* Exercício 19 - Comparação de Valores Inteiros

| Passo | `valorA` | `valorB` | Condição    | Saída                                   |
|-------|----------|----------|-------------|-----------------------------------------|
| 1     | -        | -        | -           | -                                       |
| 2     | -        | -        | -           | -                                       |
| 3     | 7        | -        | -           | -                                       |
| 4     | 7        | 12       | 7 > 12      | -                                       |
| 5     | 7        | 12       | false       | "O maior valor inserido foi 12"         |

Como o valor de `valorA` (7) não é maior do que `valorB` (12), o código entra no bloco `else` e imprime "O maior valor inserido foi 12".

* Exercício 31 - Verificação de Triângulo

| Passo | `a` | `b` | `c` | Condição                                       | Saída                                   |
|-------|-----|-----|-----|------------------------------------------------|-----------------------------------------|
| 1     | -   | -   | -   | -                                              | -                                       |
| 2     | -   | -   | -   | -                                              | -                                       |
| 3     | 3   | -   | -   | -                                              | -                                       |
| 4     | 3   | 4   | -   | -                                              | -                                       |
| 5     | 3   | 4   | 5   | 3 < 4 + 5 && 4 < 3 + 5 && 5 < 3 + 4           | -                                       |
| 6     | 3   | 4   | 5   | true                                           | "É possível formar um triângulo"        |

Como os valores fornecidos (3, 4 e 5) satisfazem a condição de que a soma de quaisquer dois lados é maior que o terceiro lado, o código imprime "É possível formar um triângulo".

* Exercício 48 - Cálculo de Média de Provas

| Passo | `p1` | `p2` | `media`    | Saída                                 |
|-------|------|------|------------|---------------------------------------|
| 1     | -    | -    | -          | -                                     |
| 2     | -    | -    | -          | -                                     |
| 3     | 7.5  | -    | -          | -                                     |
| 4     | 7.5  | 9.0  | (7.5 + 9.0) / 2 | -                             |
| 5     | 7.5  | 9.0  | 16.5 / 2   | "A média das provas foi 8.25"        |

O código calcula a média das notas das provas `p1` e `p2`. No exemplo, as notas são 7.5 e 9.0, resultando em uma média de 8.25. A mensagem "A média das provas foi 8.25" é impressa.

* Exercício 82 - Multiplicação de Vetor por Valor

| Passo | `vectA`                  | `vectM`                  | `x`  | Saída                                                                      |
|-------|--------------------------|--------------------------|------|----------------------------------------------------------------------------|
| 1     | [null, null, ..., null] | [null, null, ..., null] | -    | -                                                                          |
| 2     | [null, null, ..., null] | [null, null, ..., null] | -    | -                                                                          |
| 3     | [3, null, ..., null]    | [null, null, ..., null] | -    | -                                                                          |
| 4     | [3, 5, ..., null]       | [null, null, ..., null] | -    | -                                                                          |
| 5     | [3, 5, ..., 10]         | [null, null, ..., null] | -    | -                                                                          |
| 6     | [3, 5, ..., 10]         | [null, null, ..., null] | 2    | -                                                                          |
| 7     | [3, 5, ..., 10]         | [null, null, ..., null] | 2    | "Os valores do vetor A multiplicado por 2 serão:"                        |
| 8     | [3, 5, ..., 10]         | [6, 10, ..., 20]         | 2    | "Os valores do vetor A multiplicado por 2 serão:" 6 10 ... 20            |

Neste teste de mesa, acompanhamos os vetores `vectA` e `vectM`, o valor de `x` e as operações realizadas no código. O código pede 10 valores para preencher o vetor `vectA`, e então pede um valor `x`. Em seguida, multiplica cada elemento de `vectA` por `x` e armazena os resultados em `vectM`. Finalmente, o código imprime os valores de `vectM` multiplicados por `x`. No exemplo, com o vetor `vectA` contendo [3, 5, ..., 10] e `x` sendo 2, o vetor resultante `vectM` será [6, 10, ..., 20]. A mensagem "Os valores do vetor A multiplicado por 2 serão: 6 10 ... 20" é impressa.

* Exercicio 83 - Impressão Reversa de Números

| Passo | `vect`                        | Saída                                        |
|-------|------------------------------|----------------------------------------------|
| 1     | [null, ..., null]            | -                                            |
| 2     | [null, ..., null]            | -                                            |
| 3     | [5, ..., null]               | -                                            |
| 4     | [5, 10, ..., null]           | -                                            |
| 5     | [5, 10, ..., 20]             | -                                            |
| 6     | [5, 10, ..., 20]             | "Os 20 elementos em ordem reversa seria:"   |
| 7     | [5, 10, ..., 20]             | 20                                           |
| 8     | [5, 10, ..., 20]             | 19                                           |
| ...   | ...                          | ...                                          |
| 26    | [5, 10, ..., 20]             | 1                                            |
| 27    | [5, 10, ..., 20]             | "Os 20 elementos em ordem reversa seria:"   |
| 28    | [5, 10, ..., 20]             | 20                                           |
| 29    | [5, 10, ..., 20]             | 19                                           |
| ...   | ...                          | ...                                          |
| 47    | [5, 10, ..., 20]             | 1                                            |

O código pede 20 números para preencher o vetor `vect`, e depois imprime esses números em ordem reversa. No exemplo, com o vetor `vect` contendo [5, 10, ..., 20], o programa imprime cada elemento na ordem inversa, de 20 a 5.

* Exercicio 84 - Soma de Elementos de Vetores

| Passo | `tamanho` | `vectA`             | `vectB`             | `vectSoma`          | Saída                                                                                     |
|-------|-----------|---------------------|---------------------|---------------------|-------------------------------------------------------------------------------------------|
| 1     | -         | [null, ..., null]   | [null, ..., null]   | [null, ..., null]   | -                                                                                         |
| 2     | -         | [null, ..., null]   | [null, ..., null]   | [null, ..., null]   | -                                                                                         |
| 3     | 5         | [null, ..., null]   | [null, ..., null]   | [null, ..., null]   | -                                                                                         |
| 4     | 5         | [5, ..., null]      | [null, ..., null]   | [null, ..., null]   | -                                                                                         |
| 5     | 5         | [5, 10, ..., null]  | [null, ..., null]   | [null, ..., null]   | -                                                                                         |
| 6     | 5         | [5, 10, ..., 20]    | [null, ..., null]   | [null, ..., null]   | -                                                                                         |
| 7     | 5         | [5, 10, ..., 20]    | [5, ..., null]      | [null, ..., null]   | -                                                                                         |
| 8     | 5         | [5, 10, ..., 20]    | [5, 10, ..., null]  | [null, ..., null]   | -                                                                                         |
| 9     | 5         | [5, 10, ..., 20]    | [5, 10, ..., 25]    | [null, ..., null]   | -                                                                                         |
| 10    | 5         | [5, 10, ..., 20]    | [5, 10, ..., 25]    | [10, 20, ..., 45]   | -                                                                                         |
| 11    | 5         | [5, 10, ..., 20]    | [5, 10, ..., 25]    | [10, 20, ..., 45]   | "A soma de cada elemento do vetor A com o vetor B seria:"                              |
| 12    | 5         | [5, 10, ..., 20]    | [5, 10, ..., 25]    | [10, 20, ..., 45]   | 10                                                                                        |
| 13    | 5         | [5, 10, ..., 20]    | [5, 10, ..., 25]    | [10, 20, ..., 45]   | 20                                                                                        |
| ...   | ...       | ...                 | ...                 | ...                 | ...                                                                                       |
| 21    | 5         | [5, 10, ..., 20]    | [5, 10, ..., 25]    | [10, 20, ..., 45]   | 45                                                                                        |

O código pede um tamanho para os vetores `vectA` e `vectB`, preenche esses vetores com valores fornecidos pelo usuário e calcula a soma de cada elemento correspondente entre os vetores, armazenando os resultados em `vectSoma`. Finalmente, o código imprime os valores de `vectSoma`. No exemplo, com os vetores `vectA` e `vectB` contendo [5, 10, ..., 20] e [5, 10, ..., 25] respectivamente, a saída será a soma de cada par de elementos, resultando em [10, 20, ..., 45].

* Exercicio 24 - Cálculo de Salário Total de Vendedor

| Passo | `salarioFixo` | `vendas` | `comissao`  | `salarioTotal` | Saída                                             |
|-------|---------------|----------|-------------|----------------|---------------------------------------------------|
| 1     | -             | -        | -           | -              | -                                                 |
| 2     | -             | -        | -           | -              | -                                                 |
| 3     | 1500.00       | -        | -           | -              | -                                                 |
| 4     | 1500.00       | 3000.00  | -           | -              | -                                                 |
| 5     | 1500.00       | 3000.00  | 0.03 * 1500.00 | -              | -                                                 |
| 6     | 1500.00       | 3000.00  | 45.00       | -              | -                                                 |
| 7     | 1500.00       | 3000.00  | 45.00       | 1500.00 + 45.00 | -                                                 |
| 8     | 1500.00       | 3000.00  | 45.00       | 1545.00        | "O salário total do vendedor é: 1545.0"           |

O código calcula a comissão de acordo com o valor das vendas, considerando 3% até R$ 1.500,00 e 5% para o excedente, e soma essa comissão ao salário fixo para obter o salário total. No exemplo, com um salário fixo de R$ 1500.00 e vendas de R$ 3000.00, a comissão é calculada como R$ 45.00, resultando em um salário total de R$ 1545.00. A mensagem "O salário total do vendedor é: 1545.0" é impressa.

