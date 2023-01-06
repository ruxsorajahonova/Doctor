package Doktor;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private String cilinicName;
    private String adress;

    private List<Doktor> doctors=new ArrayList<>();

    public Clinic(){}

    public Clinic(String cilinicName, String adress) {
        this.cilinicName = cilinicName;
        this.adress = adress;

    }

    public String getCilinicName() {
        return cilinicName;
    }

    public void setCilinicName(String cilinicName) {
        this.cilinicName = cilinicName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<Doktor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doktor> doctors) {
        this.doctors = doctors;
    }

    public void addDoktorInClinic(Doktor doktor){
        getDoctors().add(doktor);
        System.out.println("doktor saqlandi");
    }
}
