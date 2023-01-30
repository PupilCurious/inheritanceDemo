public class Main {
    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI();
        krediUI.kredihesapla(new OgretmenKrediManager());
        krediUI.kredihesapla(new TarimKrediManager());
        krediUI.kredihesapla(new AskerKrediManager());
    }
}