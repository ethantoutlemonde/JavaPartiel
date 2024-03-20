public class Submarine extends SeaVessel{
    public static int s_iSpeed;
    private Player m_PlayerOwner;
    public MovementDirection m_eDirection;

    public Submarine(Player p_PlayerOwner){
        m_PlayerOwner = p_PlayerOwner;
        String[] tab = Main.getScannerInfo();
        m_iLifePoints = Integer.parseInt(tab [0]);
        m_PosInfo = new PositionInformation(Integer.parseInt(tab [1]), Integer.parseInt(tab [2]), Orientation.valueOf(tab [3]));
    }

    public void setEndPointTrajectory(){

    }
    public void applyDamages(){

    }

    public void move(){

    }

    @Override
    public String toString() {
        return "Submarine has " + m_iLifePoints + " life points, and is positionned  " + m_PosInfo.toString() + " and it still has its Torpido";
    }
}
