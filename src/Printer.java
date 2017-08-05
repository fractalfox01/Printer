public class Printer {
    private int pagesPrinted = 0;
    private boolean duplex = false;
    private String ipAddress;
    private Paper paper;
    private InkCartridge inkCartridge;

    public Printer(String ipAddress, Paper paper, InkCartridge inkCartridge) {
        this.ipAddress = ipAddress;
        this.paper = paper;
        this.inkCartridge = inkCartridge;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public void refillToner() {
        int curLevel = inkCartridge.getInkLevel();
        inkCartridge.refillInk(curLevel);
    }

    public void deductPaper(){

    }

    public String[] printPage(String myPage) {

        double i = 1;
        String[] words = myPage.split("\\s");
        String[] empty = new String[3];

        if (paper.getTotalPaper() <= pagesPrinted) {

            System.out.println("Out of Paper - Refill Paper Tray");
            return empty;
        }

        for (String w : words) {
            if ((inkCartridge.getInkLevel() -i) <= 0){
                System.out.println("Pages printed: " + (pagesPrinted/10 + 1));
                System.out.println("Not Enough Toner - refill now\n");
                return words;
            }
            inkCartridge.deductInk(-1 * i);
            i = 1;
            i++;
            pagesPrinted += 1;
        }
        System.out.println("Pages printed: " + (pagesPrinted/10 + 1));
        return words;
    }

}
