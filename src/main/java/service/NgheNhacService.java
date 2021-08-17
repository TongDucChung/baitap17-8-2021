package service;

import moduls.NgheNhac;

import java.util.ArrayList;

public class NgheNhacService {
    public ArrayList<NgheNhac>list=new ArrayList<>();
    public NgheNhacService(){

    }
    public void save(NgheNhac ngheNhac){
        list.add(ngheNhac);
    }
}
