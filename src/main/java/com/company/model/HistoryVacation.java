package com.company.model;

/**
 *
 * @author santiago.mamani
 */
public class HistoryVacation {

    private int idEmployee;
    private String startDate;
    private String endDate;
    private String reason;
    private int quantityDay;

    public HistoryVacation(int idEmployee, String startDate, String endDate, String reason, int quantityDay) {
        this.idEmployee = idEmployee;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reason = reason;
        this.quantityDay = quantityDay;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getReason() {
        return reason;
    }

    public int getQuantityDay() {
        return quantityDay;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setQuantityDay(int quantityDay) {
        this.quantityDay = quantityDay;
    }
}
