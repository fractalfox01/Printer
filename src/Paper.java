public class Paper {
    private Dimensions paperDimensions;
    private String color;
    private int totalPaper;
    private int paperLeft;

    public Paper(Dimensions paperDimansions, String color, int totalPaper) {
        this.paperDimensions = paperDimansions;
        this.color = color;
        this.totalPaper = totalPaper;
    }

    public void changePaper(int width, int height, int depth){
        paperDimensions.setWidth(width);
        paperDimensions.setHeight(height);
        paperDimensions.setDepth(depth);
    }

    public Dimensions getPaperDimensions() {
        return paperDimensions;
    }

    public String getColor() {
        return color;
    }

    public int getTotalPaper() {
        return totalPaper;
    }
}
