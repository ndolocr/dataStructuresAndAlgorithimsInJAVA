package letterLinkedList;

public class MainClass {
    public static void main(String[] args) {
        // Create Letter objects
        LetterNode a = new LetterNode('A');
        LetterNode b = new LetterNode('B');
        a.setNextPointer(b);
        LetterNode c = new LetterNode('C');
        b.setNextPointer(c);
        LetterNode d = new LetterNode('D');
        c.setNextPointer(d);
        LetterNode e = new LetterNode('E');
        d.setNextPointer(e);
        LetterNode f = new LetterNode('F');
        e.setNextPointer(f);
        LetterNode g = new LetterNode('G');
        f.setNextPointer(g);
        LetterNode h = new LetterNode('H');
        g.setNextPointer(h);
        LetterNode i = new LetterNode('I');
        h.setNextPointer(i);
        LetterNode j = new LetterNode('J');
        i.setNextPointer(j);
        LetterNode k = new LetterNode('K');
        j.setNextPointer(k);
        LetterNode l = new LetterNode('L');
        k.setNextPointer(l);
        LetterNode m = new LetterNode('M');
        l.setNextPointer(m);
        LetterNode n = new LetterNode('N');
        m.setNextPointer(n);
        LetterNode o = new LetterNode('O');
        n.setNextPointer(o);
        LetterNode p = new LetterNode('P');
        o.setNextPointer(p);
        LetterNode q = new LetterNode('Q');
        p.setNextPointer(q);
        LetterNode r = new LetterNode('R');
        q.setNextPointer(r);
        LetterNode s = new LetterNode('S');
        r.setNextPointer(s);
        LetterNode t = new LetterNode('T');
        s.setNextPointer(t);
        LetterNode u = new LetterNode('U');
        t.setNextPointer(u);
        LetterNode v = new LetterNode('V');
        u.setNextPointer(v);
        LetterNode w = new LetterNode('W');
        v.setNextPointer(w);
        LetterNode x = new LetterNode('X');
        w.setNextPointer(x);
        LetterNode y = new LetterNode('Y');
        x.setNextPointer(y);
        LetterNode z = new LetterNode('Z');
        y.setNextPointer(z);

        // Create Linked List Instance and initialize head
        LinkedList linkedList = new LinkedList(a);



        System.out.println(linkedList.printLinkedList());

    }
}
