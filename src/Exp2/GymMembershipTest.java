package Exp2;
/*
Create a class called GymMembership that includes a static variable monthlyFee to store the membership cost
for all members. Each object has an instance variable memberName. Provide a method calculateAnnualFee
that returns the yearly membership cost by multiplying monthlyFee by 12. Implement a static method
updateMonthlyFee to modify the membership fee. Write a test application named GymMembershipTest,
create two member objects, display their annual fees, then modify the monthly fee and display the updated
fees.
 */

class GymMembership{
    private static double monthlyFee;
    private String memberName;

    GymMembership(String name){
        this.memberName = name;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    double calculateAnnualFee(){
        return monthlyFee * 12;
    }

    static void updateMonthlyFee(double fee){
        monthlyFee = fee;
    }
}

public class GymMembershipTest {
    public static void main(String[] args){
        GymMembership g1 = new GymMembership("Om");
        GymMembership g2 = new GymMembership("Aniket");

        GymMembership.updateMonthlyFee(2000);
        System.out.println("Monthly Fee Set To 2000 Rs.");
        System.out.println("Name : " + g1.getMemberName() + " - " + "Annual Fee : " + g1.calculateAnnualFee() + " Rs.");
        System.out.println("Name : " + g2.getMemberName() + " - " + "Annual Fee : " + g2.calculateAnnualFee() + " Rs.");

        GymMembership.updateMonthlyFee(4000);
        System.out.println("Monthly Fee Set To 4000 Rs.");
        System.out.println("Name : " + g1.getMemberName() + " - " + "Annual Fee : " + g1.calculateAnnualFee() + " Rs.");
        System.out.println("Name : " + g2.getMemberName() + " - " + "Annual Fee : " + g2.calculateAnnualFee() + " Rs.");
    }
}
