public class WarBoat extends SeaVessel {
    private Radar m_Radar;
    public void applyDamage(){

    }
    public WarBoat(){
        String[] tab = Main.getScannerInfo();
        m_iLifePoints = Integer.parseInt(tab [0]);
        m_PosInfo = new PositionInformation(Integer.parseInt(tab [1]), Integer.parseInt(tab [2]), Orientation.valueOf(tab [3]));
        //SeaVessel.s_iNbMissilePerSlot = Integer.parseInt(tab [4]);
        //Radar.s_iSearchRadius = Integer.parseInt(tab [5]);

    }

    @Override
    public String toString() {
        return "WarBoat has " + m_iLifePoints + " life points, and is positionned  " + m_PosInfo.toString() + " and it still has its Radar";
    }
}
