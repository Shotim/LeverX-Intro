public class Task {
    private final String id;
    private final String title;
    private final TaskType type;
    private final LocalDate createdOn;
    private boolean done;
    private Set<String> tags = new HashSet<>();
    private LocalDate dueTo;
}