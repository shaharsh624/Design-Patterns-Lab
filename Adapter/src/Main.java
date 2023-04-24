import java.util.Scanner;

interface MediaPlayer {
    public void play(String audioType ,String fileName);
}

interface AdvanceMediaPlayer {
    public void playAAC(String audioType, String fileName);
    public void playWAV(String audioType, String fileName);
}

class AACPlayer implements AdvanceMediaPlayer {
    public void playAAC(String audioType, String fileName) {
        System.out.println("Playing " + fileName + "." + audioType);
    }
    public void playWAV(String audioType, String fileName) {}
}

class WAVPlayer implements AdvanceMediaPlayer {
    public void playAAC(String audioType, String fileName) {}
    public void playWAV(String audioType, String fileName) {
        System.out.println("Playing " + fileName + "." + audioType);
    }
}

class MediaAdapter implements MediaPlayer {
    AdvanceMediaPlayer advMusicPlay;

    public MediaAdapter(String audioType){
        if (audioType.equalsIgnoreCase("aac")) {
            advMusicPlay = new AACPlayer();
        } else if (audioType.equalsIgnoreCase("wav")) {
            advMusicPlay = new WAVPlayer();
        }
    }

    public void play (String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("aac")) {
            advMusicPlay.playAAC(audioType, fileName);
        } else if (audioType.equalsIgnoreCase("wav")) {
            advMusicPlay.playWAV(audioType, fileName);
        }
    }
}

class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing " + fileName + "." + audioType);
        }
        else if (audioType.equalsIgnoreCase("aac") || audioType.equalsIgnoreCase("wav")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else {
            System.out.println("Sorry! '" + audioType + "' format not supported");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many files do you have :: ");
        int n = sc.nextInt();

        for (int i=1 ; i<=n ; i++) {
            System.out.print("\nEnter Name of File " + i + " (without extension) :: ");
            String fileName = sc.next();
            System.out.print("Enter Audio Type of file" + i + " :: ");
            String audioType = sc.next();

            audioPlayer.play(audioType, fileName);
        }

        /*
        audioPlayer.play("mp3", "SummerHigh.mp3");
        audioPlayer.play("aac", "Excuses.aac");
        audioPlayer.play("wav", "NoLie.wav");
        audioPlayer.play("avi", "StereoHearts.avi");
        */
    }
}
