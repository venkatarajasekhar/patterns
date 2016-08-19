package structural.adapter;


public class Program {

    public static void main(String[] args) {

        VectorGraphicsInterface vectorGraphics = new structural.adapter.composition.VectorAdapterFromRaster();

        vectorGraphics.drawLine();

        vectorGraphics = new structural.adapter.inheritance.VectorAdapterFromRaster();

        vectorGraphics.drawSquare();
    }

}
