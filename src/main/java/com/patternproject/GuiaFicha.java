/*
 * Aqui servirá apenas como um guia para explicar como é feito e preenchido cada campo da ficha de jogador
 * além de mostrar como isso é traduzido neste projeto e como relacionar ao banco de dados
 * 
 * PRIMEIRA SETOR - Informacoes Basicas
 * o primeiro campo preenchido sera o de nome do personagem, seguido da classe e da raça, seguido do antecedente
 * passando para o alinhamento e por fim, terminando a primeira secção com o nivel e o xp
 * 
 * SEGUNDO SETOR - Caracteristicas
 * Caracteristicas sao divididas em 6: Força, Destreza, Constituição, Inteligência, Sabedoria e Carisma
 * terá a opção de ser feito de 3 formas: rolagem, determinio ou mesclagem.
 * Na rolagem será rolado 4d6 e retirado o menor numero para somar o resto, para cada campo sera feito 1 vez
 * No determinio será permitido ao usuário escolher onde colocar os valores 15, 14, 13, 12, 10 e 8.
 * Na mesclagem sera feito a rolagem, porém o usuário ira decidir onde cada rolagem ira ser inserida.
 * de acordo com a tabela será determinado qual será o modificador de cada caracteristica (segue tabela):
 * 
 *   3   = -4
 *  4-5  = -3
 *  6-7  = -2
 *  8-9  = -1
 * 10-11 =  0
 * 12-13 = +1
 * 14-15 = +2
 * 16-17 = +3
 * 18-19 = +4
 * 20-21 = +5
 * 
 * TERCEIRO SETOR - Pericias
 */