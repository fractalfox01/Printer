public class InkCartridge {
    private int inkLevel;

    public InkCartridge(int inkLevel) {
        this.inkLevel = inkLevel;
    }

    public void refillInk(int current){
        int full = 100;
        int needed = full - current;
        setInkLevel(needed);
    }

    public void deductInk(double deductBy){
        double test = getInkLevel() + deductBy;
        if(test >= 0){
            setInkLevel((int)deductBy);
        }
    }

    public int getInkLevel(){
        return this.inkLevel;
    }

    private void setInkLevel(int refill){
        this.inkLevel += refill;
    }
}
