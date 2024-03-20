import java.util.List;

public class Board {
    public static int s_iWidth;
    public static int s_iHeight;
    public List<SeaVessel> m_VesselsArrayList;

    public Board(int p_iWidth, int p_iHeight){
        s_iWidth = p_iWidth;
        s_iHeight = p_iHeight;
    }



    public void setupVessels(){

    }
    public List<SeaVessel> getVessels(){
        return m_VesselsArrayList;
    }
}
