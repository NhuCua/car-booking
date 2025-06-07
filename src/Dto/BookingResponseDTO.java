package Dto;

import java.util.Date;

public class BookingResponseDTO {
    private String NameCar;
    private String NameUser;
    private Date timeStart;
    private Date timeEnd;

    public BookingResponseDTO() {
    }

    public BookingResponseDTO(String nameCar, String nameUser, Date timeStart, Date timeEnd) {
        NameCar = nameCar;
        NameUser = nameUser;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public String getNameCar() {
        return NameCar;
    }

    public void setNameCar(String nameCar) {
        NameCar = nameCar;
    }

    public String getNameUser() {
        return NameUser;
    }

    public void setNameUser(String nameUser) {
        NameUser = nameUser;
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
                "NameCar='" + NameCar + '\'' +
                ", NameUser='" + NameUser + '\'' +
                ", timeStart=" + timeStart +
                ", timeEnd=" + timeEnd +
                '}';
    }
}
