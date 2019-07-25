package com.psl.langFund;

public class Problem5 {

	private char temprow, tempcol, tempdiag;
	boolean flag1, flag2, flag3;

	private char checkWinner(char[][] tt) {
		// TODO Auto-generated method stub
		//
		// // check winner in row
		for (int i = 0; i < tt.length; i++) {
			temprow = tt[i][0];
			for (int j = 0; j < tt.length; j++) {
				if (temprow == tt[i][j]) {
					flag1 = true;
				} else {
					flag1 = false;
					break;
				}
			}
		}

		// check winner in column
		for (int i = 0, k = 0; i < tt.length; i++, k++) {
			tempcol = tt[0][k];
			for (int j = 0; j < tt.length; j++) {
				if (tempcol == tt[j][i]) {
					flag2 = true;
				} else {
					flag2 = false;
					break;
				}
			}
		}

		for (int i = 0; i < tt.length; i++) {
			for (int j = 0; j < tt.length; j++) {
				if (i == j) {
					if (tempdiag == tt[i][j])
						flag3 = true;
					else
						flag3 = false;
				}
			}
		}
		if (flag1 == true) 
			return temprow;
		else if(flag2 == true)
			return tempcol;
		else if(flag3 == true)
			return tempdiag;
		else
			 return 'A';
	}

	public static void main(String[] args) {
		char[][] tictoe = new char[][] { { 'o', 'x', 'x' }, { 'x', 'o', 'o' },
				{ 'x', 'o', 'x' } };
		char winner;
		for (int i = 0; i < tictoe.length; i++) {
			for (int j = 0; j < tictoe.length; j++) {
				System.out.print(tictoe[i][j] + " ");
			}
			System.out.println();
		}

		Problem5 p = new Problem5();
		winner = p.checkWinner(tictoe);
		if(winner=='x' || winner=='o')
			System.out.println("Winner is :" + winner);
		else
			System.out.println("Match draw..nobody wins");
	}
}
