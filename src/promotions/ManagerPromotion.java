package promotions;

import models.Manager;

public class ManagerPromotion implements Promotable
{

    private Manager manager;

    public ManagerPromotion(Manager manager)
    {
        this.manager = manager;
    }


    public void promote()
    {
        double oldBonus = manager.getBonusPercentage();

        manager.setBonusPercentage((oldBonus + 5.0));
    }
}
