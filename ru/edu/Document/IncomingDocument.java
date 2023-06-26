package ru.edu.Document;

import java.time.LocalDate;

public class IncomingDocument extends Document {
    private String sendOfInc;
    private String adrOfInc;
    private String numbOfInc;
    private LocalDate dateOfInc;

    @Override
    public String toString() {
        return "Входящий документ [" +
                "Отправитель = " + sendOfInc +
                ", адресат = " + adrOfInc +
                ", исходящий номер = " + numbOfInc +
                ", исходящая дата регистрации = " + dateOfInc + "]";
    }

    @Override
    public String getName() {
        return ("Входящий");
    }

    public void setSendOfInc(String sendOfInc) {
        this.sendOfInc = sendOfInc;
    }

    public void setAdrOfInc(String adrOfInc) {
        this.adrOfInc = adrOfInc;
    }

    public void setNumbOfInc(String numbOfInc) {
        this.numbOfInc = numbOfInc;
    }

    public void setDateOfInc(LocalDate dateOfInc) {
        this.dateOfInc = dateOfInc;
    }
}
