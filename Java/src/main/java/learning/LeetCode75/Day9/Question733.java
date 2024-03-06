package learning.LeetCode75.Day9;

/**
 * 733. 图像渲染
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/04 10:48
 **/
public class Question733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        dfs(image,sr,sc,color,oldColor);
        return image;
    }
    private void dfs(int[][] image,int x,int y,int newColor,int oldColor){
        if(x<0||x>=image.length||y<0||y>=image[0].length){
            return;
        }
        if(image[x][y]!=oldColor||image[x][y] == newColor){
            return;
        }
        image[x][y] = newColor;
        dfs(image,x-1,y,newColor,oldColor);
        dfs(image,x+1,y,newColor,oldColor);
        dfs(image,x,y-1,newColor,oldColor);
        dfs(image,x,y+1,newColor,oldColor);
    }
    public void TestCase(){
    }


}
