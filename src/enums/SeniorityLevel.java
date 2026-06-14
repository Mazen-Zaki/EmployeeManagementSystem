package enums;

public enum SeniorityLevel
{
    JUNIOR("Junior"),
    MID("Mid-Level"),
    SENIOR("Senior");

    private final String displayName;

    SeniorityLevel(String displayName)
    {
        this.displayName = displayName;
    }

    public String getDisplayName()
    {
        return displayName;
    }
}
