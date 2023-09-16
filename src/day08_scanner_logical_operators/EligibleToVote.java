package day08_scanner_logical_operators;

public class EligibleToVote {
    /*
        create and assign these variables:

            name
            are they citizen
            do have criminal background
            age

            sample inputs:
                "James Bond"
                true
                false
                49

        determine if they are eligible to vote, they can only vote
         1)if they are a citizen,
         2)have no criminal background
         3)and are about age 18

        print : $name is eligible to vote: $boolean

     */
     public static  void main (String[] args){



         String  name = " Tom Jerry ";
         boolean  isCitizen =  true;
         boolean isCriminal = false;
         int age = 30;
                                 //true      false        true  we use &&
         boolean isEligible = isCitizen && isCriminal || age >= 18;

         System.out.println( "is"+ name + "eligible to vote  "+ isEligible);








     }

}
