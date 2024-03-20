import java.util.List;

public class SeaVessel {
    protected int m_iLifePoints;
    public static int s_iNbMissilePerSlot;
    protected List m_Missiles;
    protected PositionInformation m_PosInfo;

    public PositionInformation getPositionInformation(){
        return m_PosInfo;
    }
    public boolean isDestroyed(){
        return m_iLifePoints <= 0;
    }
    private boolean isTouched(PositionInformation p_PositionInformation){
        return m_PosInfo.equals(p_PositionInformation);
    }

    @Override
    public String toString() {
        return "SeaVessel{" + "m_iLifePoints=" + m_iLifePoints + ", m_Missiles=" + m_Missiles + ", m_PosInfo=" + m_PosInfo + '}';
    }

}
