public class AContainer {
    int cID;
    Product [] ap;
    int currentNb;
    int size = 10;

    public AContainer(int cID) {
        this.cID = cID;
    }

    public int getSize() {
        return size;
    }

    public AContainer() {
        ap = new Product[size];
        this.currentNb = 0;
    }

    public boolean isEmpty(){
        return currentNb == 0;
    }
    public boolean isFull(){
        return currentNb == ap.length;
    }
    public int Size(){
        return currentNb;
    }
    public Product Pop(){
        this.currentNb--;
        Product temp = ap[currentNb];
        ap[currentNb] = null;
        return temp;
    }
    public void Push(Product p){
        if(isFull()){
            return;
        }
        ap[currentNb] = p;
        currentNb++;
    }
    public void display(){
        int size = currentNb;
        Product [] tempStack = new Product[size];
        for(int i = 0; i < size; i++){
            tempStack[i] = this.Pop();
        }
        Product temp;
        int nbOfElements = tempStack.length-1;
        for (int j = 0; j < tempStack.length ; j++){
            temp = tempStack[nbOfElements];
            tempStack[nbOfElements] = null;
            nbOfElements--;
            System.out.println("Element at ["+j+"] = "+temp.toString());
            this.Push(temp);
        }
    }
}
