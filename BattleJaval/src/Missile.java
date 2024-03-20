public class Missile {
    private PositionInformation m_TargetPosition;
    public void setTargetPosition(PositionInformation p_TargetPosition){
        m_TargetPosition = p_TargetPosition;
    }

    @Override
    public String toString() {
        return "Missile{" +
                "m_TargetPosition=" + m_TargetPosition +
                '}';
    }
}
