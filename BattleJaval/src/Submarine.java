public class Submarine extends SeaVessel{
    public static int s_iSpeed;
    private Player m_PlayerOwner;
    public MovementDirection m_eDirection;

    public Submarine(Player p_PlayerOwner){
        m_PlayerOwner = p_PlayerOwner;
    }

    public void setEndPointTrajectory(){

    }
    public void applyDamages(){

    }

    public void move(){

    }

    @Override
    public String toString() {
        return "Submarine{" +
                "m_PlayerOwner=" + m_PlayerOwner +
                ", m_eDirection=" + m_eDirection +
                '}';
    }
}
