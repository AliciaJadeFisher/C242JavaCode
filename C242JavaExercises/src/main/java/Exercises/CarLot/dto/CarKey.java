package Exercises.CarLot.dto;

public class CarKey {
    private String VIN;
    private boolean laserCut;

    public CarKey(String VIN, boolean laserCut)
    {
        this.VIN = VIN;
        this.laserCut = laserCut;
    }

    public String getVIN()
    {
        return VIN;
    }

    public void setVIN(String VIN)
    {
        this.VIN = VIN;
    }

    public boolean isLaserCut()
    {
        return laserCut;
    }

    public void setLaserCut(boolean laserCut)
    {
        this.laserCut = laserCut;
    }
}
