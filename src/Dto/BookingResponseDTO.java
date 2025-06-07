package Dto;

import java.util.Date;

public class BookingResponseDTO {
    private String idCar;
    private String idName;
    private String nameCar;
    private String nameUser;
    private Date timeStart;
    private Date timeEnd;

    public BookingResponseDTO() {
    }

    public BookingResponseDTO(String idCar, String idName, String nameCar, String nameUser, Date timeStart, Date timeEnd) {
        this.idCar = idCar;
        this.idName = idName;
        this.nameCar = nameCar;
        this.nameUser = nameUser;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public String getIdCar() {
        return idCar;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
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
        return "BookingResponseDTO{" +
                "idCar='" + idCar + '\'' +
                ", idName='" + idName + '\'' +
                ", nameCar='" + nameCar + '\'' +
                ", nameUser='" + nameUser + '\'' +
                ", timeStart=" + timeStart +
                ", timeEnd=" + timeEnd +
                '}';
    }
}
