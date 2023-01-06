package Doktor;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Clinic> clinics=new ArrayList<>();//aninimous obekti
        List<Doktor> doctors=new ArrayList<>();
        Clinic clinic=new Clinic();//polymorphidsm obekti
        Doktor doktor=new Doktor();

        int step=-1;
        while(step!=0){
            System.out.println("0=>exit, 1=>addDoctor, 2=>addClinic, 3=>addDoctorInClinic, 4=>getDoctor, 5=>getClinic, 6=>editClinic, 7=>editDoctor, 8=>deleteClinic, 9=>deleteDoctor");
            step= scanner.nextInt();
            switch(step){
                case 0:
                    break;
                case 1:
                    System.out.println("Ismingizni kiriting");
                    String name=scanner.next();
                    System.out.println("familiyanigizni kiriting");
                    String surname=scanner.next();
                    System.out.println("yoshingizni kiriting");
                    int age=scanner.nextInt();
                    System.out.println("Mutaxasisligingizni kiriting");
                    String specialist=scanner.next();
                    doctors.add(new Doktor(name,surname,age,specialist));
                    System.out.println("succesfully saved doctor");
                    break;
                case 2:
                    System.out.println("Kilnika nomini kiriting");
                    String clinicName=scanner.next();
                    System.out.println("Klinikani manzilini kiriting");
                    String adress=scanner.next();
                    clinics.add(new Clinic(clinicName,adress));
                    System.out.println("succesfully saved clinic");
                    break;
                case 3:
                    getDoctorList(doctors);
                    System.out.println("doktorni tanlang");
                    int chooseDoctor=scanner.nextInt();
                    getClinicList(clinics);
                    System.out.println("klinikani tanlang");
                    int chooseClinic=scanner.nextInt();
                    clinics.get(chooseClinic-1).addDoktorInClinic(doctors.get(chooseDoctor-1));
                    break;
                case 4:
                    getDoctorList(doctors);
                    break;
                case 5:
                    getClinicList(clinics);
                    break;
                case 6:
                    getClinicList(clinics);
                    System.out.println("klinikani tanlang");
                    int chooseClinc= scanner.nextInt();
                    int tr=0;
                    for (Clinic clinic1:clinics) {
                        tr++;
                        if(chooseClinc==tr){
                            String oldName=clinic1.getCilinicName();
                            System.out.println("Yangi klinika nomini kiriting");
                            String newName = scanner.next();
                            clinic1.setCilinicName(newName);
                            System.out.println("tahrirlandi "+oldName+" "+newName+"ga");
                        }
                    }
                    break;
                case 7:
                    getDoctorList(doctors);
                    System.out.println("doktorni tanlang");
                    int choseDoctor=scanner.nextInt();
                    int tar=0;
                    for (Doktor doktor1:doctors){
                        tar++;
                        if(choseDoctor==tar){
                            String oldDoctorName= doktor1.getName();
                            System.out.println("Doktorni yangi nomini kiriting");
                            String newDoctorName=scanner.next();
                            doktor1.setName(newDoctorName);
                            System.out.println("tahrirlandi "+oldDoctorName+" "+newDoctorName+"ga");
                        }
                    }
                    break;
                case 8:
                    getClinicList(clinics);
                    System.out.println("klinikani tanlang");
                    int choseClinic=scanner.nextInt();
                    clinics.remove(choseClinic-1).getCilinicName();
                    System.out.println("o'chirildi");
                    break;
                case 9:
                    getDoctorList(doctors);
                    System.out.println("doktorni tanlang");
                    int choseDoctors= scanner.nextInt();
                    doctors.remove(choseDoctors-1).getName();
                    System.out.println("o'chirildi");
                    break;


            }
        }
    }
    public static void getDoctorList(List<Doktor>doctors){
        int tr=0;
        for (Doktor doktor:doctors) {
            tr++;
            System.out.println(tr+"."+doktor.getName());

        }
    }

    public static void getClinicList(List<Clinic>clinics){
        int tr=0;
        for (Clinic clinic:clinics) {
            tr++;
            System.out.println(tr+" "+clinic.getCilinicName());
        }

    }

}
