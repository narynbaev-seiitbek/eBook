package eBook.typeOfBook;

import eBook.BookType;
import eBook.FileInfo;

import java.time.LocalTime;

public class AudioBook implements BookType {

    private FileInfo audioFragment;
    private LocalTime duration;
    private FileInfo audioFile;

    public AudioBook() {
    }

    public AudioBook(FileInfo audioFragment, LocalTime duration, FileInfo audioFile) {
        this.audioFragment = audioFragment;
        this.duration = duration;
        this.audioFile = audioFile;
    }

    public FileInfo getAudioFragment() {
        return audioFragment;
    }

    public void setAudioFragment(FileInfo audioFragment) {
        this.audioFragment = audioFragment;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public FileInfo getAudioFile() {
        return audioFile;
    }

    public void setAudioFile(FileInfo audioFile) {
        this.audioFile = audioFile;
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "audioFragment=" + audioFragment +
                ", duration=" + duration +
                ", audioFile=" + audioFile +
                '}';
    }
}
