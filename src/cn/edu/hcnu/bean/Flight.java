package cn.edu.hcnu.bean;

public class Flight {
    private  String id;
    private  String planeType;
    private  String seatsNo;
    private String totalSeatsNum;
    private  String  departureAirport;
    private  String destinationAirport;
    private  String departureTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getSeatsNo() {
        return seatsNo;
    }

    public void setSeatsNo(String seatsNo) {
        this.seatsNo = seatsNo;
    }

    public String getTotalSeatsNum() {
        return totalSeatsNum;
    }

    public void setTotalSeatsNum(String totalSeatsNum) {
        this.totalSeatsNum = totalSeatsNum;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}
