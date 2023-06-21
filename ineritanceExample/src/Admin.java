ChatGPT
To fix the code, you need to make several corrections and adjustments. Here's the corrected code:

class Admin extends Employee {
    private String jobTitle;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void assignCourse() {
        System.out.println(getJobTitle());
    }
}
