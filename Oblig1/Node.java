
import java.util.ArrayList;

private int minne;
private int hz;

class Node{
  ArrayList<Prosessor> cpu = new Prosessor<>();

  Node(int minne){
    this.minne=minne;
    cpu.add(new Prosessor(minne));
  }
  Node(int minne, int hz){
    this.minne=minne;
    this.hz=hz;
    cou.add(new Prosessor(minne, hz));
  }
}
