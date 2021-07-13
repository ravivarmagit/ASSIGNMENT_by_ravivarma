import java.util.Objects;

public class Department {
    public String domain;
    public String branch;

    public Department(String domain, String branch) {
        this.domain = domain;
        this.branch = branch;
    }

    public String getDomain() {return domain; }

    public void setDomain(String domain) {this.domain = domain; }

    public String getBranch() {return branch; }

    public void setBranch(String branch) {this.branch = branch; }

    @Override
    public boolean equals(Object o) { return true; }

    @Override
    public int hashCode() {return 15;}

    @Override
    public String toString() { return "Department{" + "domain='" + domain + '\'' + ", branch='" + branch + '\'' + '}'; }
}
