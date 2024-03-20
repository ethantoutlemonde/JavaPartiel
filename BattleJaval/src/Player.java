public class Player {
    private String m_sName;
    private Player m_EnemyPlayer;

    public Player(String p_sName){
        m_sName = p_sName;
    }

    public Board getBoard(){
        return new Board(10, 10);
    }
    public void prepareBoard(){

    }

}
