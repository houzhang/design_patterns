public class Mp4Player implements OldMediaPlayer {

    @Override
    public void playVlc(String fileName) {}

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}