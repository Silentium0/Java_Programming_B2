package day38_a_abstraction_interface.shopping;

public interface Consumer extends AllowUserToSell, Shipping {

}


// we    implement 2  interface
abstract  class Tesla implements AllowUserToSell,Shipping{

// interface to  multiple interface use -->"extends"
//  from class to   ONE class  ---> "extends"
// from class to  multiple interfaces --->  "implements"

}