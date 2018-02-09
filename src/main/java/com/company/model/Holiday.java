package com.company.model;

/**
 *
 * @author santiago.mamani
 */
public class Holiday {

    private int idHoliday;
    private String nameHoliday;
    private String dateHoliday;

    public Holiday() {
    }

    public Holiday(int idHoliday, String nameHoliday, String dateHoliday) {
        this.idHoliday = idHoliday;
        this.nameHoliday = nameHoliday;
        this.dateHoliday = dateHoliday;
    }

    public int getIdHoliday() {
        return idHoliday;
    }

    public String getNameHoliday() {
        return nameHoliday;
    }

    public String getDateHoliday() {
        return dateHoliday;
    }

    public void setIdHoliday(int idHoliday) {
        this.idHoliday = idHoliday;
    }

    public void setNameHoliday(String nameHoliday) {
        this.nameHoliday = nameHoliday;
    }

    public void setDateHoliday(String dateHoliday) {
        this.dateHoliday = dateHoliday;
    }
}
