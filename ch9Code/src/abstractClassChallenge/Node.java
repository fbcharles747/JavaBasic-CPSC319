package abstractClassChallenge;

public class Node extends ListItem{
    
    public Node(Object value) {
        super(value);
    }
    @Override
    public ListItem next(){
        return rightLink;
    }

    @Override
    public ListItem setNext(ListItem right) {
        rightLink=right;
        return rightLink;
    }

    @Override
    public ListItem previous() {
        
        return leftLink;
        
    }

    @Override
    public ListItem setPrevious(ListItem left) {
        leftLink=left;
        return leftLink;
    }

    @Override
    public int compareTo(ListItem item) {
        if(item!=null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }
        return -1;

    }

}
