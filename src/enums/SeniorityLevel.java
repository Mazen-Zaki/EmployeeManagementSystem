package enums;

public enum SeniorityLevel
{
    JUNIOR("Junior Developer"),
    MID("Mid-Level Developer"),
    SENIOR("Senior Developer");

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
