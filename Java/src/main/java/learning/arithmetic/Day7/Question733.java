package learning.算法入门.Day7;

/**
 * 733. 图像渲染
 *
 * @author wenxingzhan
 * @date 2022/01/01 13:41
 **/
public class Question733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc]!=newColor) {
            dfs(image, sr, sc, newColor, image[sr][sc]);
        }
        return image;
    }
    public void dfs(int[][] image,int sr,int sc,int newColor,int target){
        if (image[sr][sc]==target){
            image[sr][sc]=newColor;
            if (sr<image.length-1){
                dfs(image,sr+1,sc,newColor,target);
            }
            if (0<sr){
                dfs(image,sr-1,sc,newColor,target);
            }
            if (sc<image[0].length-1){
                dfs(image,sr,sc+1,newColor,target);
            }
            if (0<sc){
                dfs(image,sr,sc-1,newColor,target);
            }

        }
    }
}
