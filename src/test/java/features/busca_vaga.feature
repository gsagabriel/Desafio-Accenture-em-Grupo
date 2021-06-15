	# language: pt
  # encoding: utf-8
  
  Funcionalidade: Acessar a lista de carreiras da accenture

	Cenário: Procurando uma vaga
	   
	   		Dado que eu estou no site da accenture
				E clico no meu Carreiras
				E clico em procure vagas
				E digito no campo busca “desenvolvedor”
        E clico no botão procurar
        Então devo encontrar vaga para programadores