package com.kodilla.abstracts.homework;

public abstract class Job {
    private double salary;
    private String position;
    public String[] respList = new String[6];

    public Job(double salary, String position) {
        this.salary = salary;
        this.position = position;
        fillinRespList();
    }

    public double getSalary() {
        return salary;
    }

    public void fillinRespList() {
        respList[0] = "Pracuje minimum 8 godzin dziennie.";
        respList[1] = "Tworzy raporty miesięczne.";
        respList[2] = "Uczestniczy w spotkaniach zespołu.";
        respList[3] = "Sumuje sprzedaż tygodniową.";
        respList[4] = "Kontroluje delegacje pracowników.";
        respList[5] = "Akceptuje listę płac.";
    }

    public String getPosition() {
        return position;
    }
}
