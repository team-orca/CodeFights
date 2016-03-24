package deneme.codethebank.com.bank;

/**
 * Created by ASUS on 24.03.2016.
 */
public class Kuyumcu {
    private double Altınlarım=150.0;//Başlangıç altını7
    private double AltınOranım=1000.0;//1 altın kaç lira

    public double altınlarıAl(){
        return this.Altınlarım;
    }
    public void altınlarıArttır(double arttırmaMiktarı){
        Altınlarım +=arttırmaMiktarı;
    }
    public void yeniAltınMiktarı(double yeniAltın){
        Altınlarım = yeniAltın;
    }
    public String tlKarşılıgıNedir(){
        return AltınınStringKarsılıgı() + " altın " + Double.toString(Altınlarım/AltınOranım) + " ₺ eder :)";
    }
    public String AltınınStringKarsılıgı(){
        return Integer.toString((int) Altınlarım);
    }
}
