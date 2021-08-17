package moduls;

public class NgheNhac {
    String nameBaiHat;
    String nameNgheSy;
    String theLoai;
    String fileMusic;

    public NgheNhac() {
    }

    public NgheNhac(String nameBaiHat, String nameNgheSy, String theLoai, String fileMusic) {
        this.nameBaiHat = nameBaiHat;
        this.nameNgheSy = nameNgheSy;
        this.theLoai = theLoai;
        this.fileMusic = fileMusic;
    }

    public String getNameBaiHat() {
        return nameBaiHat;
    }

    public void setNameBaiHat(String nameBaiHat) {
        this.nameBaiHat = nameBaiHat;
    }

    public String getNameNgheSy() {
        return nameNgheSy;
    }

    public void setNameNgheSy(String nameNgheSy) {
        this.nameNgheSy = nameNgheSy;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getFileMusic() {
        return fileMusic;
    }

    public void setFileMusic(String fileMusic) {
        this.fileMusic = fileMusic;
    }
}
