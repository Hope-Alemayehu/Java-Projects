class Employee {
    private String name;
    private String ID;
    private String qualification;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void display() {
        System.out.println(getName());
        System.out.println(getID());
        System.out.println(getQualification());
    }
}

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






