import java.util.*;

class Parked_CarOwner_Details{
    String ownerName;
    String carModel;
    String carNO;
    String ownerAddress;
    Long owerMobileNo;

    Parked_CarOwner_Details(String ownerName,String carModel,String carNO,String ownerAddress){
        this.ownerName=ownerName;
        this.carModel=carModel;
        this.carNO=carNO;
        this.ownerAddress=ownerAddress;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarNO() {
        return carNO;
    }

    public void setCarNO(String carNO) {
        this.carNO = carNO;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

}