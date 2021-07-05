import java.util.*; 

public class Ex2 { 

    public static void main(String[] args) { 

     A s1=new A("Chó","Vàng",4); 
     A s2=new A("Gà","Đen",2); 
     A s3=new A("Cua","Xanh",6); 

     ArrayList<A> al=new ArrayList<A>(); 
     al.add(s1); 
     al.add(s2); 
     al.add(s3); 

     Iterator itr=al.iterator(); 

     
     while(itr.hasNext()){ 
    A st=(A)itr.next(); 
      System.out.println("Loài "+st.name+"- Có màu "+st.color+"- Có "+st.foot + " Chân"); 
     } 
    } 
} 

class A{ 
     
    String name;
    String color;
    int foot; 
    A(String name,String color,int foot){ 
     this.name=name; 
     this.color=color; 
     this.foot=foot; 
    } 
} 