

	import java.util.Random;

	/**
	 * Created by zhangxiao
	 */
	public class FoolRobot {

		private static ChessBoard chess = ChessBoard.getInstance();
		private static int robotColor=chess.BLACK;
			
		public FoolRobot() {
		}

		public int[] getNext(int i, int j, int robotColor2) {
			Random random = new Random();
			int x = random.nextInt(i);
            int y = random.nextInt(j);
            if(i-1>x) {
            	while(!chess.isEmpty(x, y))
            		x = random.nextInt(i);
            		int n=i-1-x;
            		for(int m=0;m<n;m++) {
            			x++;
            		}
            }
            else if(i+1<x) {
            	while(!chess.isEmpty(x, y))
            		x = random.nextInt(i);
            	int n=x-1-i;
            	for(int m=0;m<n;m++) {
            		x--;
            	}
            }
            
            if(j-1>y) {
            	while(!chess.isEmpty(x, y))
            		x = random.nextInt(i);
            	int n=j-1-y;
            	for(int m=0;m<n;m++) {
            		y++;
            	}
            }
            else if(j+1<y) {
            	while(!chess.isEmpty(x, y))
            		x = random.nextInt(i);
            	int n=y-1-j;
            	for(int m=0;m<n;m++) {
            		y--;
            	}
            }
			while(!chess.isEmpty(x, y)||x==0||y==0) {
				x = random.nextInt(7);
				y = random.nextInt(7);
			}
            int rel[] = new int[2];
			rel[0] = x;
			rel[1] = y;
			return rel;
		}
	}