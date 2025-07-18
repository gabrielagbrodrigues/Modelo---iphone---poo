public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        meuIphone.tocar();
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.pausar();

        meuIphone.ligar("1199999-9999");
        meuIphone.atender();

        meuIphone.exibirPagina("https://dio.me");
        meuIphone.atualizarPagina();
    }
}
