public class Iphone implements ReprodutorMusical, Telefonia, Browser{

    public void ligarAparelho(){
        System.out.println("Ligando aparelho...");
    }

    public void desligarAparelho(){
        System.out.println("Desligando aparelho...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada!");
    }

    @Override
    public void selecionarMusica(String nomeDaMusica) {
        System.out.println("Tocando a música "+ nomeDaMusica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para "+ numero);
    }

    @Override
    public void atender() {
        System.out.println("Alô?");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Gravando mensagem...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página WEB...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba criada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualiada!");
    }
}
