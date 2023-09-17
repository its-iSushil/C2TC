public class TaxCalculator {
    public void calculateTax(Person p){
        if(p.getAge()>65 || p.getGender().equals("female")){
            p.setTax(0);
            System.out.println("Tax not applied");
        }
        else{
            if (p.getIncome()<=160000){
                System.out.println("Tax not applied\n");
                p.setTax(0);
            }
            else if (p.getIncome()>160000 && p.getIncome()<=500000){
                System.out.println("Tax applied: ");
                p.setTax((p.getIncome()-160000)*10/100);
            }
            else{
                System.out.println("Tax applied: ");
                p.setTax((p.getIncome()-800000)*30/100+94000);
            }
            
        }
    }
}
