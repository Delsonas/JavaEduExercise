package ru.edu;

import java.time.LocalDate;

public class TaskDocument extends Document {
    private LocalDate dateOfTask;
    private LocalDate termOfTask;
    private String respOfTask;
    private String signOfTask;
    private String ctrlOfTask;

    @Override
    public String toString() {
        return "Поручение [" +
                "Дата выдачи = " + dateOfTask +
                ", срок исполнения =" + termOfTask +
                ", ответственный исполнитель = " + respOfTask +
                ", признак контрольности = " + signOfTask +
                ", контролер = " + ctrlOfTask + "]";
    }

    @Override
    public String getName() {
        return ("Поручение");
    }

    public void setDateOfTask(LocalDate dateOfTask) {
        this.dateOfTask = dateOfTask;
    }

    public void setTermOfTask(LocalDate termOfTask) {
        this.termOfTask = termOfTask;
    }

    public void setRespOfTask(String respOfTask) {
        this.respOfTask = respOfTask;
    }

    public void setSignOfTask(String signOfTask) {
        this.signOfTask = signOfTask;
    }

    public void setCtrlOfTask(String ctrlOfTask) {
        this.ctrlOfTask = ctrlOfTask;
    }
}

