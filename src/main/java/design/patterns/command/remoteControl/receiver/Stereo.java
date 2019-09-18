package design.patterns.command.remoteControl.receiver;

/**
 * 音响
 */
public class Stereo {
    //音量
    private int volume;

    public void on() {
        System.out.println("stereo is turn on");
    }

    public void off() {
        System.out.println("stereo is turn off");
    }

    public void setCd() {
        System.out.println("play with CD");
    }

    public void setDvd() {
        System.out.println("play with DVD");
    }

    public void setRadio() {
        System.out.println("play with Radio");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
