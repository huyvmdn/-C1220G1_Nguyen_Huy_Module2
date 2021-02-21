package _05_Modifier_Static.thuc_hanh;


public class AccessModifier{

    public void msg(){System.out.println("Hello");}

}









class B{

    public static void main(String args[]){

        AccessModifier obj = new AccessModifier();

        obj.msg();

    }

}

