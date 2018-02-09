package com.company.model;

/**
 *
 * @author santiago.mamani
 */
public class DayVacation {

    private int idEmployee;
    private int vacationInitial;
    private int vacationRemaining;

    public DayVacation(int idEmployee, int vacationInitial, int vacationRemaining) {
        this.idEmployee = idEmployee;
        this.vacationInitial = vacationInitial;
        this.vacationRemaining = vacationRemaining;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public int getVacationInitial() {
        return vacationInitial;
    }

    public int getVacationRemaining() {
        return vacationRemaining;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public void setVacationInitial(int vacationInitial) {
        this.vacationInitial = vacationInitial;
    }

    public void setVacationRemaining(int vacationRemaining) {
        this.vacationRemaining = vacationRemaining;
    }
}
