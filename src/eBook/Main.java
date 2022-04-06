package eBook;

public class Main {

    public static void main(String[] args) {

        FileInfo fileInfo = new FileInfo("image1.png", "12mb",FileType.IMAGE);
        FileInfo fileInfo2 = new FileInfo("audio.mp3", "50mb",FileType.AUDIO_FILE);
        FileInfo fileInfo3 = new FileInfo("ebook.pdf", "45mb",FileType.PDF);
    }
}
