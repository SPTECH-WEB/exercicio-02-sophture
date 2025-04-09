🧩 Padrões de Projeto Utilizados
Durante o desenvolvimento deste projeto, eu utilizei os padrões Strategy e Adapter com o objetivo de organizar melhor o código, facilitar a manutenção.

🎯 Strategy – Cálculo de Frete
O padrão Strategy foi aplicado para permitir diferentes formas de calcular o frete, dependendo da modalidade escolhida pelo usuário (Expressa, Econômica ou Terceirizada). Ao invés de usar vários if no código, eu criei uma interface comum chamada CalculadoraFreteStrategy, e depois fiz três classes diferentes que implementam essa interface com suas próprias regras de cálculo.

Dessa forma, eu consigo escolher qual estratégia usar de forma dinâmica, com base no que foi informado na requisição. Se no futuro eu quiser adicionar uma nova forma de entrega, posso só criar uma nova classe e injetar no sistema, sem precisar alterar o que já existe.

🔌 Adapter – Integração com API Externa
Já o padrão Adapter foi essencial para integrar uma transportadora terceirizada que possui uma estrutura de API diferente da que o sistema utiliza internamente. Para resolver isso, eu criei um adaptador que traduz os métodos da transportadora externa para o padrão que o sistema entende.

Com isso, eu consigo usar a API externa sem precisar mexer no resto do código. Isso me dá mais liberdade para fazer futuras alterações ou trocar de API, se necessário, apenas atualizando o adaptador.