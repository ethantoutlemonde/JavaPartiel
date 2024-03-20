public class PositionInformation {
    private int m_iX;
    private int m_iY;

    private Orientation m_eOrientation;

    public PositionInformation(int p_iPosX, int p_iPosY, Orientation p_eOrientation){
        m_iX = p_iPosX;
        m_iY = p_iPosY;
        m_eOrientation = p_eOrientation;
    }

    public void setNewPosition(int p_iPosX, int p_iPosY){
        m_iX = p_iPosX;
        m_iY = p_iPosY;
    }

    @Override
    public String toString() {
        return "Position: (" + m_iX + ", " + m_iY + ")";
    }
}
