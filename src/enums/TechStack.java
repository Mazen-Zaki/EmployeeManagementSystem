package enums;

public enum TechStack
{
    JAVA("Java"),
    PYTHON("Python"),
    JAVASCRIPT("JavaScript"),
    TYPESCRIPT("TypeScript"),
    REACT("React"),
    SPRING_BOOT("Spring Boot"),
    DOCKER("Docker"),
    KUBERNETES("Kubernetes"),
    DATABASE("Database"),
    AWS("AWS");

    private final String displayName;

    TechStack(String displayName)
    {
        this.displayName = displayName;
    }

    public String getDisplayName()
    {
        return displayName;
    }
}
