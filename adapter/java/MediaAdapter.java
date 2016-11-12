public class MediaAdapter implements MediaPlayer {
    private OldMediaPlayer oldMediaPlayer;
    private String mediaType;

    public MediaAdapter(String mediaType) {
        this.mediaType = mediaType;
        if (mediaType.equalsIgnoreCase("vlc")) {
            oldMediaPlayer = new VlcPlayer();
        }else if (mediaType.equalsIgnoreCase("mp4")) {
            oldMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String fileName) {
        if (this.mediaType.equalsIgnoreCase("vlc")) {
            oldMediaPlayer.playVlc(fileName);
        } else if (this.mediaType.equalsIgnoreCase("mp4")) {
            oldMediaPlayer.playMp4(fileName);
        }
    }
}