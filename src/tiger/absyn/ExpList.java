package tiger.absyn;

public class ExpList {

    public Exp head;
    public ExpList tail;

    public ExpList(Exp h, ExpList t) {
        head = h;
        tail = t;
    }

   
}
