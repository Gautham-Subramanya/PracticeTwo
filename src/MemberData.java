public class MemberData {
    String name;
    int age;
    double salary;
    public void changename(String givenname)
    {
        name = givenname;
    }
    public void changeage(int givenage){
        age = givenage;
    }
    public void changesalary(double givensalary){
        salary = givensalary;
    }
    public void printvalue(){
        System.out.println("Members Name: "+name+"\nMembers Age: "+age+"\nMembers Salary: "+salary);
    }
}

