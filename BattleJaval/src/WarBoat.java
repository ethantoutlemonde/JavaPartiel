public class WarBoat extends SeaVessel {
    private Radar m_Radar;
    public void applyDamage(){

    }

    @Override
    public String toString() {
        return "WarBoat has " + m_iLifePoints + " life points, and is positionned  coordinates ( " + m_PosInfo.toString() + " )a";
    }
}
