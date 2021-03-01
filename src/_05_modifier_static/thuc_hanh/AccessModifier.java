package _05_modifier_static.thuc_hanh;


public class AccessModifier{

    public void msg(){System.out.println("Hello");}

}









class B{

    public static void main(String args[]){

        AccessModifier obj = new AccessModifier();

        obj.msg();

    }

}

