package com.company.model;

/**
 *
 * @author santiago.mamani
 */
public class VacationCompany {

    private int idVacationCompany;
    private int upToYear;
    private int daysVacation;

    public VacationCompany() {
    }

    public VacationCompany(int idVacationCompany, int upToYear, int daysVacation) {
        this.idVacationCompany = idVacationCompany;
        this.upToYear = upToYear;
        this.daysVacation = daysVacation;
    }

    public int getIdVacationCompany() {
        return idVacationCompany;
    }

    public int getUpToYear() {
        return upToYear;
    }

    public int getDaysVacation() {
        return daysVacation;
    }

    public void setIdVacationCompany(int idVacationCompany) {
        this.idVacationCompany = idVacationCompany;
    }

    public void setUpToYear(int upToYear) {
        this.upToYear = upToYear;
    }

    public void setDaysVacation(int daysVacation) {
        this.daysVacation = daysVacation;
    }
}
