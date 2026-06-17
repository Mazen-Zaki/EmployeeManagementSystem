package promotions;

import enums.SeniorityLevel;
import models.Developer;

import static enums.SeniorityLevel.*;

public class DeveloperPromotion implements Promotable
{
    private Developer tempDev;


    public DeveloperPromotion(Developer tempDev)
    {
        this.tempDev = tempDev;
    }


    @Override
    public void promote() {
        switch (tempDev.getSeniorityLevel()) {
            case JUNIOR -> tempDev.setSeniorityLevel(MID);
            case MID -> tempDev.setSeniorityLevel(SENIOR);
            case SENIOR -> System.out.println("Already at maximum seniority. Promotion rejected.");
        }
    }

}
