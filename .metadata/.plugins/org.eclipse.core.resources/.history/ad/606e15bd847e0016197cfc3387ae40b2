package bestFirstSearch;

import java.util.PriorityQueue;


public class AStar {
    private static final int DIAGONAL_COST = 14;
    private static final int V_H_COST = 10;
    private Cell [][]grid;

    private PriorityQueue<Cell> open;

    private boolean closed[][];
    private int startI, startJ;
    private int endI, endJ;

    private void setBlocked(int i, int j){
        grid[i][j] = null;
    }

    private void setStartCell(int i, int j){
        startI = i;
        startJ = j;
    }

    private void setEndCell(int i, int j){
        endI = i;
        endJ = j;
    }

    private void checkAndUpdateCost(Cell current, Cell t, int cost) {
        if (t == null || closed[t.i][t.j]) return;
        int t_final_cost = t.heuristicCost + cost;

        boolean inOpen = open.contains(t);
        if (!inOpen || t_final_cost < t.finalCost) {
            t.finalCost = t_final_cost;
            t.parent = current;
            if (!inOpen) open.add(t);
        }
    }

    private void AStar(){

        open.add(grid[startI][startJ]);

        Cell current;

        while(true){
            current = open.poll();
            if(current==null)break;
            closed[current.i][current.j]=true;

            if(current.equals(grid[endI][endJ])){
                return;
            }

            Cell t;
            if(current.i-1>=0){
                t = grid[current.i-1][current.j];
                checkAndUpdateCost(current, t, current.finalCost+V_H_COST);

                if(current.j-1>=0){
                    t = grid[current.i-1][current.j-1];
                    checkAndUpdateCost(current, t, current.finalCost+DIAGONAL_COST);
                }

                if(current.j+1<grid[0].length){
                    t = grid[current.i-1][current.j+1];
                    checkAndUpdateCost(current, t, current.finalCost+DIAGONAL_COST);
                }
            }

            if(current.j-1>=0){
                t = grid[current.i][current.j-1];
                checkAndUpdateCost(current, t, current.finalCost+V_H_COST);
            }

            if(current.j+1<grid[0].length){
                t = grid[current.i][current.j+1];
                checkAndUpdateCost(current, t, current.finalCost+V_H_COST);
            }

            if(current.i+1<grid.length){
                t = grid[current.i+1][current.j];
                checkAndUpdateCost(current, t, current.finalCost+V_H_COST);

                if(current.j-1>=0){
                    t = grid[current.i+1][current.j-1];
                    checkAndUpdateCost(current, t, current.finalCost+DIAGONAL_COST);
                }

                if(current.j+1<grid[0].length){
                    t = grid[current.i+1][current.j+1];
                    checkAndUpdateCost(current, t, current.finalCost+DIAGONAL_COST);
                }
            }
        }
    }

    void test(int x, int y, int si, int sj, int ei, int ej, int[][] blocked){
        grid = new Cell[x][y];
        closed = new boolean[x][y];
        open = new PriorityQueue<Cell>();

        setStartCell(si, sj);
        setEndCell(ei, ej);

        for(int i=0;i<x;++i){
            for(int j=0;j<y;++j){
                grid[i][j] = new Cell(i, j);
                grid[i][j].heuristicCost = Math.abs(i-endI)+Math.abs(j-endJ);
            }
        }
        grid[si][sj].finalCost = 0;

        for(int i=0;i<blocked.length;++i){
            setBlocked(blocked[i][0], blocked[i][1]);
        }

       /* System.out.println("\n\nInitial Grid:");
        for(int i=0;i<x;++i){
            for(int j=0;j<y;++j){
                if(i==si&&j==sj)System.out.print("SO  "); //Source
                else if(i==ei && j==ej)System.out.print("DE  ");  //Destination
                else if(grid[i][j]!=null)System.out.printf("%-3d ", 0);
                else System.out.print("BL  ");
            }
            System.out.println();
        }
        System.out.println();*/
        
        AStar();
        
        /*System.out.println("Scores for cells: ");
        for(int i=0;i<x;++i){
            for(int j=0;j<x;++j){
                if(grid[i][j]!=null)System.out.printf("%-3d ", grid[i][j].finalCost);
                else System.out.print("BL  ");
            }
            System.out.println();
        }
        System.out.println();*/

        if(closed[endI][endJ]){
            System.out.print("Path: ");
            printPath(grid[endI][endJ]);
            System.out.println();
        }else System.out.println("No possible path");
    }

    private void printPath(Cell current){
        if(current.parent==null){
            System.out.print(current);
            return;
        }
        printPath(current.parent);
        System.out.print(" -> "+current);
    }
}
