public class WarBoat extends SeaVessel {
    private Radar m_Radar;
    public void applyDamage(){

    }

    @Override
    public String toString() {
        return "WarBoat{" + "m_iLifePoints=" + m_iLifePoints + ", m_Missiles=" + m_Missiles + ", m_PosInfo=" + m_PosInfo + '}';
    }
}
