public class ProjectFunder {
    private List<Project> projects;
    private int nextProjectToBeFunded;

    public ProjectFunder() {
        projects = new ArrayList<>();
        nextProjectToBeFunded = 0;
    }

    public void addProject(Project project) {
        if (!projects.contains(project)) {
            projects.add(project);
        }
    }

    public int applyFunds(int amount) {
        if (nextProjectToBeFunded == projects.size()) {
            nextProjectToBeFunded = 0;
        }
        while (projects.get(nextProjectToBeFunded).isFullyFunded()) {
            nextProjectToBeFunded++;
            if (nextProjectToBeFunded == projects.size()) {
                nextProjectToBeFunded = 0;
            }
        }
        int fundingNeeded = projects.get(nextProjectToBeFunded).getFundsNeeded();
        if (fundingNeeded < amount) {
            amount -= fundingNeeded;
            projects.get(nextProjectToBeFunded).applyFunds(fundingNeeded);
            nextProjectToBeFunded++;
            return amount;
        } else {
            projects.get(nextProjectToBeFunded).applyFunds(amount);
            nextProjectToBeFunded++;
            return 0;
        }
    }

    public int totalFundingNeeded() {
        int total = 0;
        for (Project p : projects) {
            total += p.getFundsNeeded();
        }
        return total;
    }

    public List<Project> getProjectsFullyFunded() {
        List<Project> projectsFullyFunded = new ArrayList<>();
        for (Project p : projects) {
            if (p.isFullyFunded()) {
                projectsFullyFunded.add(p);
            }
        }
        return projectsFullyFunded;
    }
}
