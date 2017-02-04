import java.util.ArrayList;

class Regneklynge{
  ArrayList<Rack> rack = new ArrayList<>();
  int ant=0;
  Regneklynge(int ant){
    this.ant=ant;
  }
  void settInnNode(Node node){
    rack.add(node);
  }
}
