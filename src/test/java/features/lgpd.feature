	# language: pt
  # encoding: utf-8

  Funcionalidade: Acessar o site da Accenture e Aceitar os Cookies do LGPD

    Cenário: Aceite dos cookie do LGPD

Dado que estou no site da Accenture
E aceito os Termos LGPD
Então deve-se fechar a caixa de informações

 
	  Cenário: Verificar os campos de Cookies

Dado que estou no site da Accenture
E aceito os Termos LGPD
Então deve-se fechar a caixa de informações
E clico em configurações de cookie
Então devo ver o item de sua privacidade
E devo ver Cookies estritamente necessárias
E devo ver Cookies Analíticos de Primeira Parte
E devo ver Cookies de Desempenho e Cookies Funcionais
E devo ver Cookies de Publicidade e Redes Sociais 