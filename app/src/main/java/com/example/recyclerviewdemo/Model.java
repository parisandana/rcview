package com.example.recyclerviewdemo;

public class Model {

    int image;
    String namawisata, alamatwisata, nohpwisata;

    public Model(int image, String namawisata, String alamatwisata, String nohpwisata) {
        this.image = image;
        this.namawisata = namawisata;
        this.alamatwisata = alamatwisata;
        this.nohpwisata = nohpwisata;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNamawisata() {
        return namawisata;
    }

    public void setNamawisata(String namawisata) {
        this.namawisata = namawisata;
    }

    public String getAlamatwisata() {
        return alamatwisata;
    }

    public void setAlamatwisata(String alamatwisata) {
        this.alamatwisata = alamatwisata;
    }

    public String getNohpwisata() {
        return nohpwisata;
    }

    public void setNohpwisata(String nohpwisata) {
        this.nohpwisata = nohpwisata;
    }
}
