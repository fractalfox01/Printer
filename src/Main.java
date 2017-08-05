public class Main {
    public static void main(String[] args){

        Dimensions printerDimensions = new Dimensions(14, 8,12);
        Dimensions paperDimensions = new Dimensions(5,8,0);
        Paper printerPaper = new Paper(paperDimensions,"white",100);
        InkCartridge myInkCartridge = new InkCartridge(100);
        Printer myPrinter = new Printer("192.168.1.1",printerPaper,myInkCartridge);

        System.out.println("Current Ink Levels: " + myInkCartridge.getInkLevel() + "%\n");
        myPrinter.printPage("a b c d e f g h r i drg d l g k j f d g s i l j s d s d dn j s f n o g df f   d f   g js");
        System.out.println("Current Ink Levels: " + myInkCartridge.getInkLevel() + "%");
        System.out.println("Paper Dimensions are: " + printerPaper.getPaperDimensions().getWidth() + "\" X " + printerPaper.getPaperDimensions().getHeight() + "\"");
        myPrinter.refillToner();
        System.out.println("Current Ink Levels: " + myInkCartridge.getInkLevel() + "%\n");


    }
}
