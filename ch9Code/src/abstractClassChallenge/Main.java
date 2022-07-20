package abstractClassChallenge;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList(null);
        list.traverse(list.getRoot());

        String stringData="5 7 3 9 8 2 1 0";
//        String stringData="Darwin Brisbane Perth Melbourne Canberra " +
//                "Adelaide Sydney Canberra";
        String [] data=stringData.split(" ");
        for (String s:data){
            list.addItem(new Node(s));
        }


        list.traverse(list.getRoot());
        System.out.println("removing 3\n"+
                "==============================");
        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());
        System.out.println("removing 5\n"+
                "==============================");
        list.removeItem(new Node("5"));
        list.traverse(list.getRoot());





    }
}
