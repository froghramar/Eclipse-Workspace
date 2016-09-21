package bestFirstSearch;

public class Cell implements Comparable<Cell> {
    public int heuristicCost = 0;
    public int finalCost = 0;
    public int i, j;
    public Cell parent;

    public Cell(int i, int j){
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString(){
        return "["+this.i+", "+this.j+"]";
    }

	public int compareTo(Cell o2) {
		// TODO Auto-generated method stub
		Cell c1 = this;
        Cell c2 = (Cell)o2;
		return c1.finalCost<c2.finalCost?-1:
            c1.finalCost>c2.finalCost?1:0;
	}
}
