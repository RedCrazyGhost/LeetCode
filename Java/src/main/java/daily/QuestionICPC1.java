package daily;

public class QuestionICPC1 {
    public static void main(String[] args) {
        int maparea[]={4,4};
        int map[][]={{1,2,1,1},{1,2,2,2},{1,1,1,2},{1,1,1,1}};
        int iarea[]={3,3};

/*
不知道 对不对
 */

        System.out.println(test(maparea,map,iarea));

    }
    public static  boolean test(int maparea[],int map[][],int iarea[]){
        show(map,maparea);
        for (int x = 0; x < maparea[0]-iarea[0]+1; x++) {
            for (int y = 0; y < maparea[1]-iarea[1]+1; y++) {
                if(map[x][y]==map[x][y+iarea[0]-1]
                        &&map[x][y]==map[x+iarea[0]-1][y+iarea[0]-1]
                        &&map[x][y]==map[x+iarea[0]-1][y]){
                    System.out.println("可着陆位置:");
                    System.out.println("左上角坐标:"+x+","+y+" 坐标高度:"+map[x][y]+" 右下角坐标:"+(x+iarea[0]-1)+","+y+" 坐标高度:"+map[x+iarea[0]-1][y]);
                    System.out.println("右上角坐标:"+x+","+(y+iarea[0]-1)+" 坐标高度:"+map[x][y+iarea[0]-1]+" 右上角坐标:"+(x+iarea[0]-1)+","+(y+iarea[0]-1)+" 坐标高度:"+map[x+iarea[0]-1][y+iarea[0]-1]);
                    map[x][y+iarea[0]-1]=map[x+iarea[0]-1][y+iarea[0]-1]=map[x+iarea[0]-1][y]=map[x][y]=-1;
                    show(map,maparea);
                    return true;
                }
            }
        }
        return false;

    }
    public static void show(int map[][],int maparea[]){
        for (int i = 0; i < maparea[0]; i++) {
            for (int j = 0; j < maparea[1]; j++) {
                System.out.print(map[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
