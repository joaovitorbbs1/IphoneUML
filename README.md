classDiagram

ReprodutorMusical : +pausar()
ReprodutorMusical : +tocar()
ReprodutorMusical : +selecionarMusica(String nomeDaMusica)

Telefonia : +ligar(String numero)
Telefonia : +atender() 
Telefonia : +iniciarCorreioVoz()

Browser : +exibirPagina(String url)
Browser : +adicionarNovaAba()
Browser : +atualizarPagina()

Browser .. Iphone : Implements
Telefonia .. Iphone : Implements
ReprodutorMusical .. Iphone : Implements

Iphone : +ligarAparelho()
Iphone : +desligarAparelho()j