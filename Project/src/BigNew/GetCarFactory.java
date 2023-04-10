package BigNew;

public class GetCarFactory {
    public Car getCar(String carName){

        return switch (carName) {
            case ("HondaCity") -> new HondaCity();
            case ("HondaAmaze") -> new HondaAmaze();
            case ("HyundaiAlcazar") -> new HyundaiAlcazar();
            case ("HyundaiCreta") -> new HyundaiCreta();
            case ("HyundaiVerna") -> new HyundaiVerna();
            case ("KiaCarens") -> new KiaCarens();
            case ("KiaEV6") -> new KiaEV6();
            case ("KiaEV9") -> new KiaEV9();
            case ("MahindraThar") -> new MahindraThar();
            case ("MahindraXUV700") -> new MahindraXUV700();
            case ("MahindraScorpioN") -> new MahindraScorpioN();
            case ("MahindraXUV400EV") -> new Mahindra400EV();
            case ("MarutiSuzukiBaleno") -> new MarutiSuzukiBaleno();
            case ("MarutiSuzukiErtiga") -> new MarutiSuzukiErtiga();
            case ("MarutiSuzukiSwift") -> new MarutiSuzukiSwift();
            case ("MGHector") -> new MGHector();
            case ("MGGloster") -> new MGGloster();
            case ("TataHarrier") -> new TataHarrier();
            case ("TataNexon") -> new TataNexon();
            case ("TataSafari") -> new TataSafari();
            case ("ToyotaFortuner") -> new ToyotaFortuner();
            default -> null;
        };
    }
}


