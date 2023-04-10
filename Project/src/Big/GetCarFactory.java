package Big;

public class GetCarFactory {
    public Car getCar(String carName){

        return switch (carName) {
            case ("HondaCity") -> new HondaCity();
            case ("HyundaiAlcazar") -> new HyundaiAlcazar();
            case ("HyundaiCreta") -> new HyundaiCreta();
            case ("HyundaiVerna") -> new HyundaiVerna();
            case ("KiaCarens") -> new KiaCarens();
            case ("MahindraThar") -> new MahindraThar();
            case ("MahindraXUV700") -> new MahindraXUV700();
            case ("MarutiSuzukiBaleno") -> new MarutiSuzukiBaleno();
            case ("MarutiSuzukiErtiga") -> new MarutiSuzukiErtiga();
            case ("MarutiSuzukiSwift") -> new MarutiSuzukiSwift();
            case ("MGHector") -> new MGHector();
            case ("TataHarrier") -> new TataHarrier();
            case ("TataNexon") -> new TataNexon();
            case ("TataSafari") -> new TataSafari();
            case ("ToyotaFortuner") -> new ToyotaFortuner();
            default -> null;
        };
    }
}


