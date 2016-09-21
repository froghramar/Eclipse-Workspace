package eightpuzzle;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Game extends JFrame{
	
	JButton []button = new JButton[9];
	JButton hint, newGame;
	int [][]arr = new int[3][3];
	Pair curPos[], solPos[];
	Map<String, String> par = new HashMap<String, String>();
	int hintstaken;
	int numberofMoves;
	JTextField hintField, moveField;
	
	public Game() {
		// TODO Auto-generated constructor stub
		super("8 Puzzle");
		calculatePath();
		setLayout(null);
		generate();
		initialize();
	}
	
	void generate(){
		solPos = new Pair[9];
		curPos = new Pair[9];
		int k = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = k;
				curPos[k] = new Pair(i,j);
				solPos[k] = new Pair(i, j);
				k++;
			}
		}
		int howlong = 100 + (new Random().nextInt(100000));
		for (int i = 0; i < howlong; i++) {
			int x = new Random().nextInt(9);
			if(adjacent(x)) swap(x);
		}
	}
	
	void initialize(){
		for (int i = 1; i < 9; i++) {
			button[i] = new JButton("", new ImageIcon("img/" + i + ".jpg"));
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(arr[i][j] == 0) continue;
				button[arr[i][j]].setBounds(i * 70, j * 70, 70, 70);
				final int x = arr[i][j];
				button[arr[i][j]].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						if(adjacent(x)){
							button[x].setLocation(curPos[0].first * 70, curPos[0].second * 70);
							swap(x);
							numberofMoves++;
							moveField.setText("Moves :    " + numberofMoves);
							if(completed()){
								JOptionPane.showMessageDialog(null, "Congratulations!");
							}
						}
					}
				});
				add(button[arr[i][j]]);
			}
		}
		
		newGame = new JButton("New");
		newGame.setBounds(0, 215, 100, 30);
		newGame.setBackground(Color.CYAN);
		newGame.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				Game game = new Game();
				game.setSize(320, 250);
				game.setVisible(true);
			}
		});
		add(newGame);
		
		hint = new JButton("Hint");
		hint.setBounds(105, 215, 100, 30);
		hint.setBackground(Color.CYAN);
		hint.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(completed()) return;
				hintstaken++;
				hintField.setText("Hints   :    " + hintstaken);
				numberofMoves++;
				moveField.setText("Moves :    " + numberofMoves);
				nextMove();
			}
		});
		add(hint);
		
		hintstaken = 0;
		hintField = new JTextField("Hints   :    " + hintstaken);
		hintField.setBounds(215, 5, 100, 30);
		hintField.setBackground(Color.YELLOW);
		hintField.setEditable(false);
		add(hintField);
		
		numberofMoves = 0;
		moveField = new JTextField("Moves :    " + numberofMoves);
		moveField.setBounds(215, 45, 100, 30);
		moveField.setBackground(Color.YELLOW);
		moveField.setEditable(false);
		add(moveField);
	}
	
	void nextMove(){
		String cur = "";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				char ch = (char)('0' + arr[i][j]);
				cur += ch;
			}
		}
		String nxt = par.get(cur);
		for (int i = 0; i < 9; i++) {
			if(cur.charAt(i) == '0'){
				int v = nxt.charAt(i) - '0';
				swap(v);
				button[v].setLocation(curPos[v].first * 70, curPos[v].second * 70);
				break;
			}
		}
		if(completed()){
			JOptionPane.showMessageDialog(null, "Congratulations!");
			return;
		}
	}
	
	int manhattanDistance(int x){
		int distance = Math.abs(curPos[x].first - curPos[0].first) + Math.abs(curPos[x].second - curPos[0].second);
		return distance;
	}
	
	int manhattanDistance(int x, int y){
		int distance = Math.abs(curPos[x].first - solPos[y].first) + Math.abs(curPos[x].second - solPos[y].second);
		return distance;
	}
	
	boolean completed(){
		for (int i = 0; i < 9; i++) {
			if(curPos[i].first != solPos[i].first || curPos[i].second != solPos[i].second){
				return false;
			}
		}
		return true;
	}
	
	boolean adjacent(int x){
		int distance = manhattanDistance(x);
		if(distance == 1) return true;
		else return false;
	}
	
	void swap(int x){
		int f = curPos[x].first;
		curPos[x].first = curPos[0].first;
		curPos[0].first = f;
		int s = curPos[x].second;
		curPos[x].second = curPos[0].second;
		curPos[0].second = s;
		arr[curPos[x].first][curPos[x].second] = x;
		arr[curPos[0].first][curPos[0].second] = 0;
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		game.setSize(320, 250);
		game.setVisible(true);
		
	}
	
	int [][]opt = {{-1,0}, {1,0}, {0, -1}, {0, 1}};
	
	boolean valid(int x, int y){
		return (x >= 0 && y >= 0 && x <= 2 && y <= 2);
	}
	
	void calculatePath(){
		String source = "012345678";
		par.put(source, source);
		PriorityQueue <State> list = new PriorityQueue<State>();
		list.add(new State(0, source));
		while(!list.isEmpty()){
			State cur = list.peek();
			list.poll();
			int [][]a = new int[3][3];
			int k = 0, x = 0, y = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					a[i][j] = cur.state.charAt(k++) - '0';
					if(a[i][j] == 0){
						x = i;
						y = j;
					}
				}
			}
			for (int i = 0; i < 4; i++) {
				if(valid(x + opt[i][0], y + opt[i][1])){
					int [][]b = new int[3][3];
					for (int j = 0; j < 3; j++) {
						for (int l = 0; l < 3; l++) {
							b[j][l] = a[j][l];
						}
					}
					b[x][y] = a[x + opt[i][0]][y + opt[i][1]];
					b[x + opt[i][0]][y + opt[i][1]] = a[x][y];
					String nxt = "";
					for (int j = 0; j < 3; j++) {
						for (int l = 0; l < 3; l++) {
							char ch = (char)('0' + b[j][l]);
							nxt += ch;
						}
					}
					if(!par.containsKey(nxt)){
						par.put(nxt, cur.state);
						list.add(new State(cur.cost + 1, nxt));
					}
				}
			}
		}
	}

}
