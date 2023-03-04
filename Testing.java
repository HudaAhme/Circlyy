/**
 * Created by DELL on 26/01/2023.
 */
public class Testing {
    public static void main(String[] args) {
        CirclyLinkedList<Integer>c=new CirclyLinkedList<>();

        System.out.println(c.isEmpty());
        System.out.println(c.size());
        c.addfirst(90);
        c.addfirst(100);
        c.addfirst(200);
        c.addlast(900);

        for (int i = 0; i <c.size() ; i++) {
            System.out.println(c.First());
            System.out.println(c.Las());
            c.rotate();
            System.out.println();
            System.out.println(c.size());
        }


    }
}
