package model;

import java.util.Date;

public class Booking {
    private String idCar;
    private String idUser;
    private Date timeStart;
    private Date timeEnd;


    public Booking(String idCar, String idUser, Date timeStart, Date timeEnd) {
        this.idCar = idCar;
        this.idUser = idUser;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public Booking() {
    }

    public String getIdCar() {
        return idCar;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public Date getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idCar='" + idCar + '\'' +
                ", idUser='" + idUser + '\'' +
                ", timeStart=" + timeStart +
                ", timeEnd=" + timeEnd +
                '}';
    }
}
