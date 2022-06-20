package Practice.ClassModeling;

import java.util.Date;

public class AirplaneControlSystem
{
    private Date timeDep, timeArr;
    private double duration;
    private final int id;
    private final String airline;
    private String departure, destination;

    public AirplaneControlSystem(Date timeDep, Date timeArr, double duration, int id, String airline, String departure, String destination)
    {
        this.timeDep = timeDep;
        this.timeArr = timeArr;
        this.duration = duration;
        this.id = id;
        this.airline = airline;
        this.departure = departure;
        this.destination = destination;
    }

    public Date getTimeDep()
    {
        return timeDep;
    }

    public void setTimeDep(Date timeDep)
    {
        this.timeDep = timeDep;
    }

    public Date getTimeArr()
    {
        return timeArr;
    }

    public void setTimeArr(Date timeArr)
    {
        this.timeArr = timeArr;
    }

    public double getDuration()
    {
        return duration;
    }

    public void setDuration(double duration)
    {
        this.duration = duration;
    }

    public String getDeparture()
    {
        return departure;
    }

    public void setDeparture(String departure)
    {
        this.departure = departure;
    }

    public String getDestination()
    {
        return destination;
    }

    public void setDestination(String destination)
    {
        this.destination = destination;
    }
}
