public class Main {
    public static void main(String[] args){

        Dimensions printerDimensions = new Dimensions(14, 8,12);
        Dimensions paperDimensions = new Dimensions(5,8,0);
        Paper printerPaper = new Paper(paperDimensions,"white",100);
        InkCartridge myInkCartridge = new InkCartridge(100);
        Printer myPrinter = new Printer("192.168.1.1",printerPaper,myInkCartridge);

        System.out.println("Current Ink Levels: " + myInkCartridge.getInkLevel() + "%\n");
        myPrinter.printPage("");
        System.out.println("Current Ink Levels: " + myInkCartridge.getInkLevel() + "%");
        System.out.println("Paper Dimensions are: " + printerPaper.getPaperDimensions().getWidth() + "\" X " + printerPaper.getPaperDimensions().getHeight() + "\"");

    }
}
